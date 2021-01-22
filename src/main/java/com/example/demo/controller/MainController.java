package com.example.demo.controller;

import com.example.demo.model.Currency;
import com.example.demo.entity.CurrencyArrayProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @Autowired
    CurrencyArrayProvider currencyArrayProvider;

    @GetMapping
    public String doGet(Model model){
        List<Currency> list = Arrays.asList(currencyArrayProvider.getCurrencyArray());
        model.addAttribute("list",list);
        return "index";
    }

}
