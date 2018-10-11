package com.joyner.patterns.prototype;

public class AccessControl implements Prototype{
    private final String controlLevel;//级别
    private String access;//访问权限，级别一样，但是有可能访问权限不一致。例如级别都是user但是A有写的权限，而B没有
    public AccessControl(String controlLevel,String access){
        this.controlLevel = controlLevel;
        this.access = access;
    }

    @Override
    public AccessControl clone(){
        try {
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String getControlLevel(){
        return controlLevel;
    }
    public String getAccess() {
        return access;
    }
    public void setAccess(String access) {
        this.access = access;
    }
}
