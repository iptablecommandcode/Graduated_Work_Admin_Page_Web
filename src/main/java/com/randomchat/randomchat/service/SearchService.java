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
    final String sqlMapId = "search.search";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchID(Object dataMap) {
    final String sqlMapId = "search.searchid";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getObject(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchNAME(Object dataMap) {
    final String sqlMapId = "search.searchname";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchGENDER(Object dataMap) {
    final String sqlMapId = "search.searchgender";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchPHONE(Object dataMap) {
    final String sqlMapId = "search.searchphone";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchEMAIL(Object dataMap) {
    final String sqlMapId = "search.searchemail";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object SearchSCHOOL(Object dataMap) {
    final String sqlMapId = "search.searchschool";

    Object resultObject = new HashMap<>();
    ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId, dataMap));

    return resultObject;
  }

  public Object MemberInfo(Object dataMap) {
    final String sqlMapId = "search.memberinfo";

    Object resultObject = dao.getObject(sqlMapId, dataMap);

    return resultObject;
  }
}