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
public class Android_Account {
    @Autowired
    private MemberService memberservice;

    private final static String MAPPING = "Account/";

    // 계정 생성
    @RequestMapping(value = MAPPING + "Sign_Up")
    @ResponseBody
    public Map<String, String> Sign_Up(HttpServletRequest request) {
    Map<String, String> result = new HashMap<String, String>();
    String test;

    test = request.getParameter("ID");
    System.out.println(test);
    test = request.getParameter("NAME");
    System.out.println(test);

    result.put("Sign_In", "true");

    return result;
    }

    //중복확인
    @RequestMapping(value = MAPPING + "Search_ID")
    @ResponseBody
    public Map<String, String> Search_ID(HttpServletRequest request) {
    Map<String, String> result = new HashMap<String, String>();
    String test;

    test = request.getParameter("ID");
    System.out.println(test);
    test = request.getParameter("NAME");
    System.out.println(test);

    result.put("Sign_In", "true");

    return result;
    }
}