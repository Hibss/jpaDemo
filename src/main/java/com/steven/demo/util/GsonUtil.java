package com.steven.demo.util;

import com.google.gson.Gson;
import com.steven.demo.bean.Person;

import java.util.List;

/**
 * @Author steven.sheng
 * @Date 2018/12/21/021.
 */
public class GsonUtil {
    private static Gson gson = new Gson();
    public static String toJson(List<Person> result) {
        return gson.toJson(result);
    }

    public static String toJson(Person person) {
        return gson.toJson(person);
    }
}
