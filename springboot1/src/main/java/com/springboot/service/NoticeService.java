package com.springboot.service;

import com.springboot.pojo.Notice;

import java.util.List;
import java.util.Map;

public interface NoticeService {
    List<Notice> findAll();

    Map<String,Object> findByPage(Integer page, Integer rows);
}
