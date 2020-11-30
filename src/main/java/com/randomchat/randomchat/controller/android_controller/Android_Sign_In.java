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
    public Map<String, Object> SignIn(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        String ID, PASSWORD, Account_Check;

        // 안드로이드에서 가져온 값
        ID = request.getParameter("id");
        PASSWORD = request.getParameter("pw");

        // DB확인
        Account_Check = (String) memberservice.SignInAndroid(ID, PASSWORD);

        // 결과값 없으면 로그인 실패있으면 성공
        if (Account_Check == null)
            result.put("Sign_In", "false");
        else if (Account_Check != null)
            result.put("Sign_In", "true");

        return result;
    }
}