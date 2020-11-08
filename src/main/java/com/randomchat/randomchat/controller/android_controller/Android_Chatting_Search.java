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
public class Android_Chatting_Search {
    @Autowired
    private MemberService memberservice;

    @RequestMapping("Android_Chatting_Search")
    @ResponseBody
    public Map<String, String> SignIn(HttpServletRequest request) {
    Map<String, String> result = new HashMap<String, String>();
    String user1,user2;

    user1 = request.getParameter("id");
    user2 = request.getParameter("id");

    // while((user1.equals(null))||(user2.equals(null))){
    //     user1 = request.getParameter("id");
    //     user2 = request.getParameter("id");
    // }



    result.put("Search", "true");

    return result;
    }
}