package com.joyner.patterns.proxy.protection;

public interface Staff {

    public boolean isOwner();
    public void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
