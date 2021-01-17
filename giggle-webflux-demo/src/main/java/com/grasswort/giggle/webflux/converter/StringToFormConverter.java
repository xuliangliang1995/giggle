package com.grasswort.giggle.webflux.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.grasswort.giggle.webflux.controller.DynamicController;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToFormConverter
        implements Converter<String, DynamicController.Form> {

    private final static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public DynamicController.Form convert(String s) {
        ObjectNode objectNode = objectMapper.convertValue(s, ObjectNode.class);
        int type = objectNode.get("type").asInt();
        DynamicController.Form form = null;
        switch (type) {
            case 1:
                form = objectMapper.convertValue(s, DynamicController.Form1.class);
                break;
            case 2:
                form = objectMapper.convertValue(s, DynamicController.Form2.class);
                break;
            default:
                break;
        }
        return form;
    }
}
