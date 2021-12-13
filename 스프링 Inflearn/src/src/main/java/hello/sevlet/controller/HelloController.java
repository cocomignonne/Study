package hello.sevlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 웹에서 첫 진입점이 컨트롤러이다.
@Controller
public class HelloController {
    @GetMapping("Hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring setting!!!");
        return "Hello";
    }
}
