package com.coco.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by yadi_coco on 2019/3/24.
 */
@Data
@Getter
@Setter
public class User implements Serializable {
    private String name;
    private Integer age;
    private String city;
    private String province;

}
