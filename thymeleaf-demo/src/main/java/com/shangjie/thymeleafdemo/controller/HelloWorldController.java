package com.shangjie.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

//    @GetMapping("/showForm")
//    public String showForm() {
//        return "helloworld-form";
//    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // need a controller method to read form data
    // add data to the model.
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from html form
        String theName = request.getParameter("studentName");

        // convert all caps
        theName = theName.toUpperCase();

        // add message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @GetMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName,
                                          Model model) {

        // convert all caps
        theName = theName.toUpperCase();

        // add message
        String result = "Hey my friend from v3 " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
