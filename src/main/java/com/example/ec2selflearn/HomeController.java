
package com.example.ec2selflearn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class HomeController {

    @GetMapping
    public String test() {
        log.info("hehe");
        return "Tran Danh Hoang trigger" + "service1";
    }

}
