package com.randomchat.randomchat.controller.android_controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.randomchat.randomchat.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Android_Sign_In {
    @Autowired
    private MemberService memberservice;

    @RequestMapping("AndroidSign_In")
    @ResponseBody
    public Map<String, String> SignIn(HttpServletRequest request) {
    Map<String, String> result = new HashMap<String, String>();
    String test;

    test = request.getParameter("id");
    System.out.println(test);
    test = request.getParameter("pw");
    System.out.println(test);

    result.put("Sign_In", "true");

    return result;
    }
}