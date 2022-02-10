package com.himoon.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Zhang Wenqian
 * @Description:
 * @version: 1.0
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){ return  "index";}
}
