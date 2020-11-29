package com.randomchat.randomchat.service;

import java.util.HashMap;
import java.util.Map;

import com.randomchat.randomchat.dao.ChattingDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChattingService {
    @Autowired
    private ChattingDao dao;

    public void InsertChatting(Map<String, Object> dataMap){
        final String sqlMapId = "chatting.insert";

        dao.insertList(sqlMapId,dataMap);
    }
}
