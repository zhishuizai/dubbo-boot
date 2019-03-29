package com.wlzhou.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.wlzhou.api.domain.City;
import com.wlzhou.api.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference
    private CityService cityService;


    @RequestMapping("dubbo")
    City dubboTest(){
        return cityService.findCityByName("");
    }
}
