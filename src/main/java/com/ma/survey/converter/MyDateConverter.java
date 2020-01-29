package com.ma.survey.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义日期类型转换器
 * created by <a href="mailto:18045142590@163.com" > mameng </a>
 */
public class MyDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date target = sdf.parse(source);
            return target;
        } catch (ParseException e) {
            return null;
        }
    }
}
