package com.randomchat.randomchat.repository;

import com.randomchat.randomchat.modal.ClassBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<ClassBean, String>{
    
}