package com.steven.demo.dao;

import com.steven.demo.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Author steven.sheng
 * @Date 2018/12/21/021.
 */
public interface PersonDao extends JpaRepository<Person,Long> {

    Person getByName(String name);

    @Query(value = "select id,name from Person where name=?1 limit 1",nativeQuery = true)
    Person getByName1(String name);
}
