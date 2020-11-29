package com.example.jenkins.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @RequestMapping("/test")
    public String tast(){
        log.info("日志测试");
        try{
            int a = 1/0;
        }catch (Exception e){
            log.error("错误信息：",e);
        }

        return "test-change2";
    }
}
