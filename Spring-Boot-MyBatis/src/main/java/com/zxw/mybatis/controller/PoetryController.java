package com.zxw.mybatis.controller;

import com.zxw.mybatis.bean.PoetryBean;
import com.zxw.mybatis.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PoetryController {

    @Autowired
    private PoetryService poetryService;

    @PostMapping("/register")
    private String registerVerse(PoetryBean poetryBean) {
        poetryService.addVerse(poetryBean);
        return "success";
    }
}
