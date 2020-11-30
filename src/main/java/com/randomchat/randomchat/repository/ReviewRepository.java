package com.randomchat.randomchat.repository;

import com.randomchat.randomchat.modal.ReviewBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewBean, String>{
    
}
