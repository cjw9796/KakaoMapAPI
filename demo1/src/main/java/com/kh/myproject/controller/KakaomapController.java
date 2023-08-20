package com.kh.myproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class KakaomapController {

    // 단순요청
    @RequestMapping("/thymeleaf-test") //http://localhost:8090/thymeleaf-test
    public String thymeleafTest() {
        return "thymeleaf-test";
    }

    // 단순요청
    @RequestMapping("/kakaomap1") //http://localhost:8090/kakaomap1
    public String kakaoMap1() {
        return "kakaomap1";
    }

    @RequestMapping("/kakaomap2") //http://localhost:8090/kakaomap2
    public String kakaoMap2() {
        return "kakaomap2";
    }

    @RequestMapping("/kakaomap3") //http://localhost:8090/kakaomap3
    public String kakaoMap3() {
        return "kakaomap3";
    }


}
