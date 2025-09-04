package com.example.my_portfolio_blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// このクラスがWebリクエストの受付係であることを示す
@Controller
public class HomeController {

    // トップページ ("/") へのリクエストが来たら、このメソッドを実行する
    @GetMapping("/")
    public String index() {
        // 表示するHTMLファイルの名前 "index.html" を返す
        return "index";
    }
}