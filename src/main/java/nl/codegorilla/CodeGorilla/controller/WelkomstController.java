package nl.codegorilla.CodeGorilla.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelkomstController {

    @RequestMapping("/welkom")
    public String helloworld(){
        return "Hallo, welkom bij jouw eerste spring boot applicatie";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam int numOne, @RequestParam int numTwo, @RequestParam String operator){



        return "";
    }
}
