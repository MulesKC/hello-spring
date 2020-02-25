package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="")
public class HelloController {


//    @GetMapping("")
//    public String hello(@RequestParam String coder) {
//
//        return "Hello";
//    }

//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//    @GetMapping("city/{cityName}")
//    public String cityNamer(@PathVariable String cityName) { return cityName + " Discussion Page";}
//
//    @GetMapping("dogName")
//    public String dogNamer(@RequestParam String dog) { return "Your dog's name is " + dog;}

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @PostMapping("helloFunction")
    public static String createMessage(@RequestParam String userName, String language) {
        String helloTranslated = "error";

        switch (language) {
            case "english" : helloTranslated = "Hello ";
                break;
            case "french" : helloTranslated = "Bonjour ";
                break;
            case "spanish" : helloTranslated = "Hola ";
                break;
            case "latin" : helloTranslated = "Salve ";
                break;
            case "inuktitut" : helloTranslated = "Halu ";
                break;

        }

        return helloTranslated + userName;

    }


}
