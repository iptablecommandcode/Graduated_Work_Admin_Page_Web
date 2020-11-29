package com.randomchat.randomchat.repository;

import com.randomchat.randomchat.modal.ChattingBean;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChattingRepository extends JpaRepository<ChattingBean,String>{
    
}
