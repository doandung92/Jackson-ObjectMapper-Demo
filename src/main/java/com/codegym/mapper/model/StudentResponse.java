package com.codegym.mapper.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonTypeName("student")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class StudentResponse implements Serializable {
    private String name;
    private String clazz;
    private String cityName;
}
