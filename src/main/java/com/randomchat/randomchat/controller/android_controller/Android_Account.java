package com.randomchat.randomchat.controller.android_controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.randomchat.randomchat.service.MemberService;
import com.randomchat.randomchat.service.SearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Android_Account {
    @Autowired
    private MemberService memberservice;

    @Autowired
    private SearchService searchservice;

    private final static String MAPPING = "Account/";

    // 계정 생성
    @RequestMapping(value = MAPPING + "Sign_Up")
    @ResponseBody
    public void Sign_Up(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        String chatting = "chatting";
        int admin = 2;

        //DB값 전송위해 map에 저장
        result.put("ID", request.getParameter("ID"));
        result.put("NAME", request.getParameter("NAME"));
        result.put("PASSWORD", request.getParameter("PASSWORD"));
        result.put("GENDER", request.getParameter("GENDER"));
        result.put("PHONE", request.getParameter("PHONE"));
        result.put("EMAIL", request.getParameter("EMAIL"));
        result.put("SCHOOL", request.getParameter("SCHOOL"));
        result.put("CHATTING", chatting);
        result.put("ADMIN", admin);

        memberservice.AddUser(result/*admin, id, name, password, gender, phone, email, school, chatting*/);
    }

    // 중복확인
    @RequestMapping(value = MAPPING + "Search_ID")
    @ResponseBody
    public Map<String, Object> Search_ID(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        Object resultMap = new HashMap<String, Object>();
        String firstcheckid = null;

        firstcheckid = request.getParameter("ID");

        // 중복 확인 값 DB처리
        resultMap = searchservice.SearchID(firstcheckid);

        //id검색 결과 저장 없으면 null 있으면 firstcheckid와 같은 값
        resultMap = ((Map<String, Object>) resultMap).get("resultList");

        //map에서 온 값이 db에 없으면 취소 반환
        if (resultMap == null) {
            result.put("Search", "false");
        //map으로 온 데이터 값에서 id값이 같은지 확인 같으면 참 다르면 취소
        } else if(((Map<String, String>) resultMap).get("ID").equals(firstcheckid)){
            result.put("Search", "true");
        } else {
            //만약 그 외의 값으로 인한 오류발생시 전부 취소값 전송
            result.put("Search", "false");
        }
        
        return result;
    }
}