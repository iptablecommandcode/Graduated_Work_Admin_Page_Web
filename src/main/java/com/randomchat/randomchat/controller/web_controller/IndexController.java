package com.randomchat.randomchat.controller.web_controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.randomchat.randomchat.service.MemberService;
import com.randomchat.randomchat.service.SearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@SessionAttributes("MainPage")
@Controller
public class IndexController {
    @Autowired
    private MemberService memberservice;

    @Autowired
    private SearchService searchservice;
    // mainpage
    @GetMapping("/")
    public String SignInGet() {
        return "Sign_In";
    }

    // SIGN IN CHECK
    @PostMapping("MainPage/Index")
    public ModelAndView SignIN(@RequestParam Map<String,Object> paramMap, HttpServletRequest requset, HttpSession session,ModelAndView modelAndView){
        // search data
        String loginID = requset.getParameter("ID");
        String loginPW = requset.getParameter("PW");
        String viewName = "MainPage/Index";
        Object resultMap = new HashMap<String, Object>() ;

        // SIGN IN CHECK
        loginID = (String) memberservice.SignInAdmin(loginID, loginPW);
        
        if (loginID == null) {
            // Sign Fail
            viewName = "Sign_in";
            modelAndView.setViewName(viewName);
            return modelAndView;
        } else {
            // Sign Success
            // search all account data
            resultMap = searchservice.Search(paramMap);
            
            modelAndView.addObject("resultMap", resultMap);
            modelAndView.setViewName(viewName);

            // Sign IN SESSION
            session.setAttribute("id", loginID);
        }
        return modelAndView;
    }

    // SIGN OUT GET
    @GetMapping("SignOut")
    public String SignOutGet(HttpSession session, SessionStatus status) {
        // Session Out
        if(status.isComplete()){
            status.setComplete();
        }
        return "redirect:/";
    }

    // SIGN OUT POST
    @PostMapping("SignOut")
    public String SignOutPost(HttpSession session, SessionStatus status) {
        // Session Out
        if(status.isComplete()){
            status.setComplete();
        }
        return "redirect:/";
    }
}