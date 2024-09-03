package inhatc.cse.yeonheeshop.hello.controller;

import inhatc.cse.yeonheeshop.hello.dto.HelloDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public  String hello(Model model){
        HelloDto helloDto = HelloDto.builder().
                name("최길동e")
                .build();

        model.addAttribute("data", helloDto);
        return "hello";
    }

}
