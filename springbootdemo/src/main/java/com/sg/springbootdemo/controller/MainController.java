package com.sg.springbootdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("test")
    public String testPage(Model model){
        String name = "John";

        model.addAttribute("number", 42);
        model.addAttribute("firstName", name);

        return "test";
    }

    @PostMapping("testForm")
    public String testForm(HttpServletRequest request){
        String name = request.getParameter("formFirstName");
        int number = Integer.parseInt(request.getParameter("formNumber"));

        return "redirect:/test";
    }

    @GetMapping("testList")
    public String testList(Model model){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(10);
        numbers.add(6);
        numbers.add(35);

        model.addAttribute("numberList", numbers);

        return "testList";
    }

    @GetMapping("testConditional")
    public String testConditional(Model model){

        model.addAttribute("truth", true);
        model.addAttribute("theNumber", 33);
        model.addAttribute("aString", "testing");

        return "testConditional";
    }
    


}
