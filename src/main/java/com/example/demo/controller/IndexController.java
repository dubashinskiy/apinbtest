package com.example.demo.controller;

import com.example.demo.entity.CurrencyArrayProvider;
import com.example.demo.entity.RateArrayProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.util.Arrays;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    CurrencyArrayProvider currencyArrayProvider;
    @Autowired
    RateArrayProvider arrayProvider;

    @PostMapping
    public String doPost(@RequestParam("currency") Integer currency,
                         @RequestParam("dateStart") String dateStart,
                         @RequestParam("dateEnd") String dateEnd,Model model) throws ParseException {
        model.addAttribute("list", Arrays.asList(currencyArrayProvider.getCurrencyArray()));
        model.addAttribute("currencyList",arrayProvider.getRateArray(currency,dateStart,dateEnd));
        return "index";
    }
}
