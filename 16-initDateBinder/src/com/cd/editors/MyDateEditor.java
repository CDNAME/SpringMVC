package com.cd.editors;

import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class MyDateEditor extends PropertiesEditor {
    
    @Override
    public void setAsText(String source) throws IllegalArgumentException {
        SimpleDateFormat sdf = getDateFormat(source);
        try {
            Date date = sdf.parse(source);
            setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private SimpleDateFormat getDateFormat(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",source)) {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        } else if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$",source)) {
            sdf = new SimpleDateFormat("yyyy/MM/dd");
        } else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$",source)) {
            sdf = new SimpleDateFormat("yyyyMMdd");
        } else {
            //如果日期匹配不成功，则提前抛出异常。1参数若不能转换为2参数，则抛出TypeMismatchException异常,便于MyController类捕获处理
            throw new TypeMismatchException("", Date.class);
        }
        return sdf;
    }
}
