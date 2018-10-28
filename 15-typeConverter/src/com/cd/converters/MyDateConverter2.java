package com.cd.converters;

import org.springframework.beans.TypeMismatchException;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class MyDateConverter2 implements Converter<String, Date> {
    
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = getDateFormat(source);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private SimpleDateFormat getDateFormat(String source) {
        SimpleDateFormat sdf = null;
        if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",source)) {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        } else if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$",source)) {
            sdf = new SimpleDateFormat("yyyy/MM/dd");
        } else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$",source)) {
            sdf = new SimpleDateFormat("yyyyMMdd");
        } else {
            //如果日期匹配不成功，则提前抛出异常。参数1不能转换为参数2，则抛出TypeMismatchException异常,便于MyController类捕获处理
            throw new TypeMismatchException("", Date.class);
        }
        return sdf;
    }
}
