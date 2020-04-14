package com.zxw.transactional.controller;

import com.zxw.transactional.bean.PoetryBean;
import com.zxw.transactional.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PoetryController {

    @Autowired
    private PoetryService poetryService;

    @Transactional
    @PostMapping("/register")
    public String registerVerse(PoetryBean poetryBean) {
        poetryService.addVerse(poetryBean);
        int i = 3 / 0;
        poetryService.addVerse(poetryBean);
        return "success";
    }
}
