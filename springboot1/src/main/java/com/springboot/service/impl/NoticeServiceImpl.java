package com.springboot.service.impl;

import com.springboot.mapper.NoticeMapper;
import com.springboot.pojo.Notice;
import com.springboot.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;
    @Override
    public List<Notice> findAll() {
        return noticeMapper.findAll();
    }

    @Override
    public Map<String, Object> findByPage(Integer page, Integer rows) {

        Map<String,Object> data = new HashMap<>();

        Long count = noticeMapper.count();

        List<Notice> notices = noticeMapper.findByPage((page-1)*rows,rows);

        data.put("total",count);
        data.put("rows",notices);

        return data;
    }
}
