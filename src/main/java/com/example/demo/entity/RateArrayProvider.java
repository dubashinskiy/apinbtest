package com.example.demo.entity;

import com.example.demo.model.RateShort;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class RateArrayProvider {
    public RateShort[] getRateArray(int cur,String start, String end) throws ParseException {
        RateShort[] arrayRate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = dateFormat.parse(start);
        Date endDate = dateFormat.parse(end);
        String url = "https://www.nbrb.by/API/ExRates/Rates/Dynamics/"+ cur + "?startDate="+ dateFormat.format(startDate)+ "&endDate=" + dateFormat.format(endDate);
        arrayRate = new RestTemplate().getForObject(url, RateShort[].class);
        return arrayRate;
    }
}
