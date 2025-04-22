package com.tibuapp.tibu_app.controller;

import java.util.HashMap;
import java.util.Map;
import com.tibuapp.tibu_app.models.User;

import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class homecontroller {
    @GetMapping("/home")
    public Map<String,Object> index(Model model) {
        User user = new User("maria", "mariahelenasalas@gmail.com", "12345678");


        // Map<String,Object> map = Map.of(
        //     "titulo", "desarrollador",
        //     "actor", "adrian"
        // );
        Map<String,Object> copi = new HashMap<>();
        copi.put("titulo", "desarrollador");
        copi.put("actor", "maria");
        copi.put("user", user);


        // model.addAttribute("titulo", "desarrollador");
        // model.addAttribute("actor", "adrian");
        return copi;
    }
    

}
