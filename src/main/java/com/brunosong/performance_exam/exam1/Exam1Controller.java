package com.brunosong.performance_exam.exam1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam1")
public class Exam1Controller {


    @GetMapping("/sample1")
    public String sample1(){
        return "Hello";
    }


    @GetMapping("/sample2")
    public String sample2(){
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Hello";
    }
}
