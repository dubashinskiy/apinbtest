package com.example.demo.entity;

import com.example.demo.model.Currency;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CurrencyArrayProvider {
    public Currency[] getCurrencyArray(){
        Currency[] arrayCurrency = new RestTemplate().getForObject("https://www.nbrb.by/API/ExRates/Currencies", Currency[].class);
        return arrayCurrency;
    }
}
