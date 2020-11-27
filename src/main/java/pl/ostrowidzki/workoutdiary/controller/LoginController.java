package pl.ostrowidzki.workoutdiary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/access-denied")
    public String showAccess() {
        return "login-forms/access-denied";
    }

    @RequestMapping("/**")
    public String redirectToHomepage() {
        return "index";
    }
}
