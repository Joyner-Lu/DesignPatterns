package com.joyner.patterns.mediator;

public class Valve implements Colleague {
    private MachineMediator mediator;
    private static int water = 0;

    @Override
    public void setMediator(MachineMediator mediator){
        this.mediator = mediator;
    }
    public void open(){
        System.out.println("Valve is opened...");System.out.println("Filling water...");
        int water = generateWater();
        while (water < mediator.getWater()) {
            water = generateWater();
        }
        System.out.println("water is enough:" + water + "L");
        mediator.closed();
    }

    private int generateWater() {
        try {
            Thread.sleep(2000);
            water += 50;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return water;
    }

    public void closed(){
        System.out.println("Valve is closed...");
        mediator.on();
    }
}
