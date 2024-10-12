package com.bogil.rest.webservices.restfull_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
    //객체를 반환하면 json형태로 반환됨을 알 수 있다.
    @GetMapping("/hello-world-bean")
    public HelloworldBean helloWorldBean() {
        return new HelloworldBean("Hello World");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloworldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloworldBean(String.format("Hello World, %s", name));
    }

}
