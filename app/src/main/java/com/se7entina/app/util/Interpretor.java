package com.se7entina.app.util;

import android.app.Activity;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public final class Interpretor {
	private final Activity mActivity;

	private Interpretor(Activity activity) {
		mActivity = activity;
	}

	/**
	 * Gets an {@link Interpretor} capable of injecting fields for the given
	 * Activity.
	 */
	public static Interpretor get(Activity activity) {
		return new Interpretor(activity);
	}

	/**
	 * Injects all fields that are marked with the {@link InterpretView}
	 * annotation.
	 * <p>
	 * For each field marked with the InjectView annotation, a call to
	 * {@link Activity#findViewById(int)} will be made, passing in the resource
	 * id stored in the value() method of the InjectView annotation as the int
	 * parameter, and the result of this call will be assigned to the field.
	 * 
	 * @throws IllegalStateException
	 *             if injection fails, common causes being that you have used an
	 *             invalid id value, or you haven't called setContentView() on
	 *             your Activity.
	 */
	public void inject() {
		for (Field field : mActivity.getClass().getDeclaredFields()) {
			for (Annotation annotation : field.getAnnotations()) {
				if (annotation.annotationType().equals(InterpretView.class)) {
					try {
						Class<?> fieldType = field.getType();
						int idValue = InterpretView.class.cast(annotation).value();
						field.setAccessible(true);
						Object injectedValue = fieldType.cast(mActivity
								.findViewById(idValue));
						if (injectedValue == null) {
							throw new IllegalStateException("findViewById("
									+ idValue + ") gave null for " + field
									+ ", can't inject");
						}
						field.set(mActivity, injectedValue);
						field.setAccessible(false);
					} catch (IllegalAccessException e) {
						throw new IllegalStateException(e);
					}
				}
			}
		}
	}
}
