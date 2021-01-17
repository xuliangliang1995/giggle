package com.grasswort.giggle.webflux.converter;

import com.grasswort.giggle.webflux.controller.DynamicController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.serializer.Deserializer;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.io.InputStream;

@Component
public class FormDeserializer implements Deserializer<DynamicController.Form> {

    @Autowired
    private StringToFormConverter stringToFormConverter;

    @Override
    public DynamicController.Form deserialize(InputStream inputStream) throws IOException {
        byte[] bytes = new byte[0];
        bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String str = new String(bytes);
        return stringToFormConverter.convert(str);
    }
}
