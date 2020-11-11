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
    String user1=null,menu1=null,user2 = null, menu2 = null, menudump1 = null, menudump2 = null;
    @RequestMapping("Android_Chatting_Search")
    @ResponseBody
    public Map<String, String> SignIn(HttpServletRequest request) {
    Map<String, String> result = new HashMap<String, String>();
    menudump1 = request.getParameter("id");
    menudump2 = request.getParameter("menu");
    if(user1 == null){
        user1 = request.getParameter("id");
        menu1 = request.getParameter("menu");
        result.put("Search", "false");
        return result;
    }else if((user1 != null) && (user1.equals(menudump1))){
        result.put("Search", "false");
        return result;
    }else if((user1 != null) && (!(user1.equals(menudump1)) && (menu1.equals(menudump2)))){
        user2 = request.getParameter("id");
        menu2 = request.getParameter("menu");
        result.put("Search", "true");
        return result;
    }else{
        result.put("Search","false");
        return result;
    }

    // while((user1.equals(null))||(user2.equals(null))){
    //     user1 = request.getParameter("id");
    //     user2 = request.getParameter("id");
    // }
    }
}