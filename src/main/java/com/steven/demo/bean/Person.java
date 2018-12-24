package com.steven.demo.bean;



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
    private Long id;

    @Column(name = "name", nullable = true, length = 100)
    private String name;
}
