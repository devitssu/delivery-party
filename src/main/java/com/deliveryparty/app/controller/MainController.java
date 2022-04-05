package com.deliveryparty.app.controller;

import com.deliveryparty.app.oauth.config.LoginUser;
import com.deliveryparty.app.oauth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {

    private final HttpSession httpSession;

    @GetMapping("/")
    public String main(Model model, @LoginUser SessionUser user) {
        if(user != null){
            model.addAttribute("user", user);
        }
        return "index";
    }
}
