
package com.example.ec2selflearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String test() {
        return "Tran Danh Hoang trigger" + "service1";
    }

}
