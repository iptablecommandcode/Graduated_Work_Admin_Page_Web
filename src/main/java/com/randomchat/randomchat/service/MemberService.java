package com.randomchat.randomchat.service;

import java.util.HashMap;
import java.util.Map;

import com.randomchat.randomchat.dao.MemberDao;
import com.randomchat.randomchat.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository repository;

    @Autowired
    private MemberDao dao;
    
    public Object SignIn(String id, String password) {
        final String sqlMapId = "member.login";
        final Map<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("ID", id);
        dataMap.put("PASSWORD", password);
        return dao.getObject(sqlMapId, dataMap);
    }
}