package com.steven.demo.bean;



import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author steven.sheng
 * @Date 2018/12/21/021.
 */
@Entity
@Table(name = "person")
@Data
public class Person implements Serializable{

    private static final long serialVersionUID = 352062344213882502L;
    @Id
    @GeneratedValue
    @ApiModelProperty(value = "主键ID", example = "123")
    private Long id;

    @Column(name = "name", nullable = true, length = 100)
    @ApiModelProperty(value = "姓名", example = "测试姓名")
    private String name;
}
