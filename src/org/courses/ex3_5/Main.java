package org.courses.ex3_5;

public class Main {
    public static void main(String[] args) {
        String value = "Hello printer";
        String text = "Samsung";
        String model = "ET-2850";

        Printer printer = new Printer(value);
        Printer samsung = new Samsung(value,text);
        Printer epson = new Epson(value,model);

        printer.print();
        samsung.print();
        epson.print();
        }
}
