package com.wlzhou.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wlzhou.api.domain.City;
import com.wlzhou.api.service.CityService;

@Service
public class CityServiceImpl implements CityService {

    @Override
    public City findCityByName(String cityName) {
        City  city  = new City("上海","打飞机的沙拉看风景");

        return city;
    }
}
