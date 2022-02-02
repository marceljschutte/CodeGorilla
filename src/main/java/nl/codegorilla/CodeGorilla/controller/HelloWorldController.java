package nl.codegorilla.CodeGorilla.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/welkom")
    public String helloworld(){
        return "Hallo, welkom bij jouw eerste spring boot applicatie";
    }
}
