package com.randomchat.randomchat.service;

import java.util.HashMap;
import java.util.Map;

import com.randomchat.randomchat.dao.MemberDao;
import com.randomchat.randomchat.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
  @Autowired
  private MemberRepository repository;

  @Autowired
  private MemberDao dao;

  public Object Search(Object dataMap) {
    String sqlMapId = "member.search";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchID(Object dataMap) {
    String sqlMapId = "member.searchid";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchNAME(Object dataMap) {
    String sqlMapId = "member.searchname";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchGENDER(Object dataMap) {
    String sqlMapId = "member.searchgender";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchPHONE(Object dataMap) {
    String sqlMapId = "member.searchphone";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchEMAIL(Object dataMap) {
    String sqlMapId = "member.searchemail";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchSCHOOL(Object dataMap) {
    String sqlMapId = "member.searchschool";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object MemberInfo(Object dataMap) {
    String sqlMapId = "member.memberinfo";

    Object resultObject = dao.getObject(sqlMapId, dataMap);

    return resultObject;
  }
}