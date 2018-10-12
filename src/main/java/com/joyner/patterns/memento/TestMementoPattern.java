package com.joyner.patterns.memento;

public class TestMementoPattern {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(5, 10, careTaker);
        System.out.println("Default State: "+originator);//x-5,y-10
        originator.setX(originator.getY()*51);
        System.out.println("State: "+originator);//x-510,y-10
        originator.createSavepoint("SAVE1");
        originator.setY(originator.getX()/22);
        System.out.println("State: "+originator);//x=510,y=23.18
        originator.undo();
        System.out.println("State after undo: "+originator);//x-510,y-10
        originator.setX(Math.pow(originator.getX(),3));
        originator.createSavepoint("SAVE2");
        System.out.println("State: "+originator);
        originator.setY(originator.getX()-30);
        originator.createSavepoint("SAVE3");
        System.out.println("State: "+originator);
        originator.setY(originator.getX()/22);
        originator.createSavepoint("SAVE4");
        System.out.println("State: "+originator);
        originator.undo("SAVE2");
        System.out.println("Retrieving at: "+originator);
        originator.undo();
        System.out.println("Retrieving at: "+originator);
        originator.undoAll();
        System.out.println("State after undo all: "+originator);
    }
}
