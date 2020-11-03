package com.randomchat.randomchat.controller.web_controller;

import java.util.Map;

import com.randomchat.randomchat.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {
    @Autowired
    MemberService memberservice;

    @GetMapping("DeleteAction")
    public String Delete(@RequestParam Map<String, Object> paramMap) {
        String Search = (String) paramMap.get("search");

        memberservice.Delete(Search);
        return "redirect:/MainPage/Index";
    }
}