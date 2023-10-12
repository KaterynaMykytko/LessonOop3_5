package org.courses.ex3_5;

public class Epson extends Printer {

    protected String model;

    public static final String ANSI_PURPLE = "\u001B[35m";

    public Epson(String value, String model){
        super(value);
        this.model = model;
    }
    @Override
    public void print(){
        System.out.println(ANSI_PURPLE + value + " " + model + ANSI_RESET);
    }
}

