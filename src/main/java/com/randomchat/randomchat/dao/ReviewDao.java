package com.randomchat.randomchat.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDao {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public Object insertList(String sqlMapId, Object dataMap){
		Object resultObject = sqlSession.insert(sqlMapId, dataMap);

        return resultObject;
    }
    
}
