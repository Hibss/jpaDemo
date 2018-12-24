package com.steven.demo.controller;

import com.steven.demo.bean.Person;
import com.steven.demo.service.PersonService;
import com.steven.demo.util.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author steven.sheng
 * @Date 2018/12/21/021.
 */
@Controller
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/all")
    @ResponseBody
    public String all() {
        List<Person> person = personService.getAll();
        return GsonUtil.toJson(person);
    }

    @RequestMapping("/search/{name}")
    @ResponseBody
    public String search(@PathVariable(value = "name")String name) {
        Person person = personService.getByName(name);
        return GsonUtil.toJson(person);
    }

    @RequestMapping("/search1/{name}")
    @ResponseBody
    public String search1(@PathVariable(value = "name")String name) {
        Person person = personService.getByName1(name);
        return GsonUtil.toJson(person);
    }
}
