package com.codegym.mapper;

import com.codegym.mapper.model.StudentResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class MapperApplication {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        StudentResponse student = new StudentResponse();
        student.setName("Carlos");
        student.setCityName("HN");
        student.setClazz("C0620K1");
        String out = mapper.writeValueAsString(student);
        System.out.println(out);
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        // Convert camelCase to snake_case
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        // Ignore unknown properties
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // ignore null for primitive types
        mapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
        // ignore fail for enum number
        mapper.configure(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS, false);
        // Enable when using @JsonRootName
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        // Format Date
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a z");
        mapper.setDateFormat(df);

        return mapper;
    }
}

