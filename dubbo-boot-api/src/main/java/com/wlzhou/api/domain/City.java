package com.wlzhou.api.domain;

import java.io.Serializable;

public class City implements Serializable {

    private String name;
    private String from;

    public City() {
    }

    public City(String name, String from) {
        this.name = name;
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
