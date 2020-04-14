package com.zxw.transactional.dao;


import com.zxw.transactional.bean.PoetryBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PoetryDao {

    void insertVerse(PoetryBean poetryBean);
}
