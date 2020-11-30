package com.randomchat.randomchat.controller.android_controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.randomchat.randomchat.service.ReviewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Android_Review {
    @Autowired
    ReviewService reviewService;

    private final static String MAPPING = "Android_Review";

    @RequestMapping(value = MAPPING)
    @ResponseBody
    public void Review(HttpServletRequest request){
        int CHATSCORE;
        String ID,REVIEW;
        Map<String,Object> result = new HashMap<String,Object>();
        
        ID = request.getParameter("ID");
        CHATSCORE = Integer.parseInt(request.getParameter("CHATSCORE"));
        REVIEW = request.getParameter("REVIEW");

        result.put("ID", ID);
        result.put("CHATSCORE", CHATSCORE);
        result.put("REVIEW", REVIEW);

        reviewService.reviewInsert(result);
    }
    
}
