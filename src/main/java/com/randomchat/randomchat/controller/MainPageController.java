package com.randomchat.randomchat.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.randomchat.randomchat.service.SearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// @SessionAttributes("MainPage")
@Controller
public class MainPageController {

    private final static String MAPPING = "/MainPage/";

    @Autowired
    private SearchService searchservice;

    @RequestMapping(value = MAPPING + "{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView test(@RequestParam Map<String, Object> paramMap, ModelAndView modelAndView, HttpSession session,
            @PathVariable String action) {

        Object resultMap = new HashMap<String, Object>();

        String check = (String) paramMap.get("title");
        String Search = (String) paramMap.get("search");

        // first page
        if (action.equals("AccountInfo")) {
            //search all account data
            resultMap = searchservice.MemberInfo(Search);
            action = "AccountInfo";
        //mapping Search
        } else if (action.equals("Search")) {
            // title check Search
            if (check.equals("ID")) {
                resultMap = searchservice.SearchID(Search);
            } else if (check.equals("NAME")) {
                resultMap = searchservice.SearchNAME(Search);
            } else if (check.equals("GENDER")) {
                resultMap = searchservice.SearchGENDER(Search);
            } else if (check.equals("PHONE")) {
                resultMap = searchservice.SearchPHONE(Search);
            } else if (check.equals("EMAIL")) {
                resultMap = searchservice.SearchEMAIL(Search);
            } else if (check.equals("SCHOOL")) {
                resultMap = searchservice.SearchSCHOOL(Search);
            }

            // action set
            action = "Index";
        } else if (action.equals("Index")){
            // search all account data
            resultMap = searchservice.Search(paramMap);
            
            modelAndView.addObject("resultMap", resultMap);

            action = "Index";
        } else if (action.equals("AccountDelete")){
            resultMap = searchservice.MemberInfo(Search);

            action = "AccountDelete";
        }

        String viewName = MAPPING + action;

        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}