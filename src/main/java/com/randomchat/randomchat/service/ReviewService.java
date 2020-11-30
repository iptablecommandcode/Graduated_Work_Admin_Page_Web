package com.randomchat.randomchat.service;

import java.util.Map;

import com.randomchat.randomchat.dao.ReviewDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewDao dao;

    public void reviewInsert(Map<String,Object> dataMap){
        final String sqlMapId = "review.insert";
        
        dao.insertList(sqlMapId, dataMap);
    }
}
