package org.courses.ex3_5;

public class Printer {

    protected String value;

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String  ANSI_YELLOW = "\u001B[33m";


    public Printer(String value){
        this.value = value;
    }

    public void print(){
        if (this.getClass().equals(Printer.class)) {
            System.out.println((ANSI_YELLOW + value + ANSI_RESET));
        }
    }
}
