package co.kr.fulloftraval.adminLogin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("adminLogin")
@RequiredArgsConstructor
public class AdminLoginController {

    @GetMapping("adminLoginPage")
    public String AdminLoginPage(Model model){
        return "adminLogin/adminLoginPage";
    }

}
