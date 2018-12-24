package com.steven.demo.controller;

import com.steven.demo.bean.Person;
import com.steven.demo.service.PersonService;
import com.steven.demo.util.GsonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author steven.sheng
 * @Date 2018/12/21/021.
 */
@Controller
@RequestMapping(value = "/person")
@Api(value = "PersonController",description = "自然人信息查询api")
public class PersonController {
    @Autowired
    private PersonService personService;

    @ApiOperation(value = "获取所有人自然人")
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public String all() {
        List<Person> person = personService.getAll();
        return GsonUtil.toJson(person);
    }

    @ApiOperation(value = "jpa查询")
    @RequestMapping(value = "/search/{name}",method = RequestMethod.GET)
    @ResponseBody
    public String search(@PathVariable(value = "name")String name) {
        Person person = personService.getByName(name);
        return GsonUtil.toJson(person);
    }

    @ApiOperation(value = "原生sql查询")
    @RequestMapping(value = "/search1/{name}",method = RequestMethod.GET)
    @ResponseBody
    public String search1(@PathVariable(value = "name")String name) {
        Person person = personService.getByName1(name);
        return GsonUtil.toJson(person);
    }
}
