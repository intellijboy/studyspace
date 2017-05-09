package com.demo.diagram;

/**
 * Created by liuburu on 2017/5/4.
 */
public class HighSchoolStudent extends Student {
    private int hsId;
    private String name;

    public int getHsId() {
        return hsId;
    }

    public void setHsId(int hsId) {
        this.hsId = hsId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
