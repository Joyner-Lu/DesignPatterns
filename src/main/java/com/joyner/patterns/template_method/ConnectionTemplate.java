package com.joyner.patterns.template_method;

public abstract class ConnectionTemplate {

    /**
     * The key method of the above class is the run method. The run method is used to run these steps in order. The method is set as
     * final because the steps should be kept safe and should not be change by any user.
     */
    public final void run() {
        setDBDriver();
        setCredentials();
        connect();
        prepareStatement();
        setData();
        insert();
        close();
        destroy();
    }
    public abstract void setDBDriver();
    public abstract void setCredentials();
    public void connect() {
        System.out.println("Setting connection...");
    }
    public void prepareStatement() {
        System.out.println("Preparing insert statement...");
    }
    public abstract void setData();
    public void insert() {
        System.out.println("Inserting data...");
    }
    public void close() {
        System.out.println("Closing connections...");
    }
    public void destroy() {
        System.out.println("Destroying connection objects...");
    }
}
