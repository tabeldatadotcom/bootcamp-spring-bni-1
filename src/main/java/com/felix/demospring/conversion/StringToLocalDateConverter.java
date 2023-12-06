package com.felix.demospring.conversion;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateConverter implements Converter<String, LocalDate> {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    @Override
    public LocalDate convert(String dateTimeString) {
        return LocalDate.parse(dateTimeString, formatter);
    }
}
