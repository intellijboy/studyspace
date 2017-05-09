package com.jxufe.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuburu on 2017/4/29.
 */
@Controller
@RequestMapping("demo1")
public class MyControl {

    @RequestMapping("success")
    public String toSuccessPage(){
        System.out.println("test f jrelabel working....");
        return "success";
    }
}
