package com.demo.diagram;

/**
 * Created by liuburu on 2017/5/4.
 */
public class Worker extends Person implements IAction {
    private int wkId;
    private String wkName;

    public int getWkId() {
        return wkId;
    }

    public void setWkId(int wkId) {
        this.wkId = wkId;
    }

    public String getWkName() {
        return wkName;
    }

    public void setWkName(String wkName) {
        this.wkName = wkName;
    }
}
