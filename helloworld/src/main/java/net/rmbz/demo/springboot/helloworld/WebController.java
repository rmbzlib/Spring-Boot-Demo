package net.rmbz.demo.springboot.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RMBZ.NET on 2015/7/6.
 */
@RestController("webController")
public class WebController {

    @RequestMapping(value = "/spring-boot")
    public String helloWorld() {
        return "Hello World - Spring-Boot";
    }

}
