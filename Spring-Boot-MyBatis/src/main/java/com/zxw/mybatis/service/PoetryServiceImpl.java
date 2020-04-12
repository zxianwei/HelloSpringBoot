package com.zxw.mybatis.service;

import com.zxw.mybatis.bean.PoetryBean;
import com.zxw.mybatis.dao.PoetryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoetryServiceImpl implements PoetryService {

    @Autowired
    PoetryDao poetryDao;

    @Override
    public void addVerse(PoetryBean poetryBean) {
        poetryDao.insertVerse(poetryBean);
    }
}
