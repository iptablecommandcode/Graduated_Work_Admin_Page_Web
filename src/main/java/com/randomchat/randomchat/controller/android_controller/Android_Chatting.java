package com.randomchat.randomchat.controller.android_controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.randomchat.randomchat.service.ChattingService;
import com.randomchat.randomchat.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Android_Chatting {
    @Autowired
    private ChattingService chattingService;

    private final static String MAPPING = "Android_Chatting_";
    String user1 = null, menu1 = null, user2 = null, menu2 = null, menudump1 = null, menudump2 = null;
    static int count = 0;

    //채팅 매칭
    @RequestMapping(value = MAPPING + "Search")
    @ResponseBody
    public Map<String, String> Chatting_Maching(HttpServletRequest request) {
        Map<String, String> result = new HashMap<String, String>();

        //값 임시 저장
        menudump1 = request.getParameter("id");
        menudump2 = request.getParameter("menu");

        //첫번째 대기 사용자 없을시 값 입력후 다른 사람 입력 요청
        if (user1 == null) {
            user1 = request.getParameter("id");
            menu1 = request.getParameter("menu");
            result.put("Search", "false");
            return result;
            //첫번째 대기열 점유중 똑같은 값이 들어올 경우 다시 입력 요청 단 10번 요청시 처음부터 다시 초기화
        } else if((user1 != null) && (user2 != null) && (menu1.equals(menu2))){
            count = 0;
            result.put("Search", "true");
            return result;
        } else if ((user1 != null) && (user1.equals(menudump1)) && count == 10) {
            user1 = null;
            user2 = null;
            count = 0;
            result.put("Search", "false");
            return result;
            //첫번째 대기열 점유중 똑같은 값이 들어올 경우 다시 입력 요청
        } else if ((user1 != null) && (user1.equals(menudump1))) {
            count ++;
            result.put("Search", "false");
            return result;
            //첫번째 점유중 새로운 값이 들어올 경우 매칭 완료
        } else if ((user1 != null) && (!(user1.equals(menudump1)) && (menu1.equals(menudump2)))) {
            user2 = request.getParameter("id");
            menu2 = request.getParameter("menu");
            result.put("Search", "false");
            return result;
        } else {
            result.put("Search", "false");
            return result;
        }
    }

    //채팅 메인
    @RequestMapping(value = MAPPING + "main")
    @ResponseBody
    public Map<String, Object> Chatting(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        String ID;
        String TIME;
        String CHATTINGTIME;
        ID = request.getParameter("ID");
        TIME = request.getParameter("CHAT");
        CHATTINGTIME = request.getParameter("TIME");
        
        result.put("ID", ID);
        result.put("CHATTING", TIME);
        result.put("CHATTINGTIME", CHATTINGTIME);

        chattingService.InsertChatting(result);

        return result;
    }
}