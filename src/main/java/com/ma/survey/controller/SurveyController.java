package com.ma.survey.controller;

import com.ma.survey.model.SurveyForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * created by <a href="mailto:18045142590@163.com" > mameng </a>
 */
@Controller
public class SurveyController {

    @PostMapping("/apply")
    @ResponseBody
    public String apply(
            String name,
            String course,
            Integer[] purpose
    ) {
        System.out.println(name + ":" + course + ":" + purpose);
        return "SUCCESS";
    }

    @PostMapping("/apply1")
    @ResponseBody
    public String apply1(
            String name,
            String course,
            @RequestParam List<Integer> purpose
    ) {
        System.out.println(name + ":" + course + ":" + purpose);
        return "SUCCESS";
    }

    @PostMapping("/apply2")
    @ResponseBody
    public String apply2(SurveyForm param) {
        System.out.println(param);
        return "SUCCESS";
    }
}
