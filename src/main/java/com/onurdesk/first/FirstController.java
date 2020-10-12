package com.onurdesk.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

   @RequestMapping("/")
   public String fristController(){
       return "Welcome to my First controller!!";
   }
}