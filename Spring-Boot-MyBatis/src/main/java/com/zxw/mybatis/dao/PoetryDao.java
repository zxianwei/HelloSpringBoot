package com.zxw.mybatis.dao;

import com.zxw.mybatis.bean.PoetryBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PoetryDao {

    void insertVerse(PoetryBean poetryBean);
}
