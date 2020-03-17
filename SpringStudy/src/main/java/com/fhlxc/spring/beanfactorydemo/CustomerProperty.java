package com.fhlxc.spring.beanfactorydemo;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
* @author Xingchao Long
* @date 2020/06/23 21:06:04
* @ClassName CustomerProperty
* @Description
*/

public class CustomerProperty extends PropertyEditorSupport {

    private String format = "yyyy-MM-dd";
    
    public String getFormat() {
        return format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }
    
    @Override
    public void setAsText(String text) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        
        try {
            this.setValue(sdf.parse(text));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
}
