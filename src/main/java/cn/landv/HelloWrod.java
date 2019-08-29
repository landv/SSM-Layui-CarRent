package cn.landv;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWrod {
    @RequestMapping("/")
    public String hello(){
        return "hello,Spring boot!!!";
    }
}
