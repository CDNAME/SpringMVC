package com.cd.converters;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Converter接口中的两个泛型参数表示：
 * 第一个：表示源的类型
 * 第二个：表示宿的类型，即要转换为的目标类型
 */

public class MyDateConverter implements Converter<String, Date> {
    
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
