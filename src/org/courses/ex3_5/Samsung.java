package org.courses.ex3_5;

public class Samsung extends Printer {

    String text;

    public static final String ANSI_GREEN = "\u001B[32m";

    public Samsung(String value, String text){
        super(value);
        this.text = text;
    }
    @Override
    public void print(){
        System.out.println(ANSI_GREEN + value + " " + text + ANSI_RESET);
    }
}
