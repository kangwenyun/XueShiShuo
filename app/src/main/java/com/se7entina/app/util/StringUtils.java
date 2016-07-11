package com.se7entina.app.util;

import android.widget.EditText;

/**
 * Class:
 * Created by se7enTina on 2016/7/11.
 * Description:
 */
public class StringUtils {

    public static boolean isEmpty(EditText editText){
        if(editText == null ){
            return true;
        }
        String src = editText.getText().toString();
        return src.equals("");
    }
}
