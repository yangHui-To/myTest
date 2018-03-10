package com.springboot.controller;

import com.springboot.pojo.Notice;
import com.springboot.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Resource
    private NoticeService noticeService;

    @Autowired
    private Environment environment;

    @GetMapping("/hello")


    public String hello(){
        System.out.println(environment.getProperty("name"));
        return "hello world 你好世界";
    }

    @GetMapping("/findAll")
    public List<Notice> findAll(){
        return noticeService.findAll();
    }


    @PostMapping("/findByPage")
    public Map<String,Object> findByPage(@RequestParam Integer page, @RequestParam Integer rows){
        Map<String, Object> byPage = noticeService.findByPage(page, rows);
        return byPage;
    }
}
