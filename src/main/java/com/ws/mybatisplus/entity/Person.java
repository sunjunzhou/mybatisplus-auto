package com.ws.mybatisplus.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Person implements Serializable {
    private Integer id;

    private Integer age;

    private String name;

    private static final long serialVersionUID = 1L;
}