package com.steven.demo.service;


import com.steven.demo.bean.Person;
import com.steven.demo.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author steven.sheng
 * @Date 2018/12/21/021.
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public Person getByName(String name) {
        return personDao.getByName(name);
    }

    public List<Person> getAll() {
        return personDao.findAll();
    }

    public Person getByName1(String name) {
        return personDao.getByName1(name);
    }
}
