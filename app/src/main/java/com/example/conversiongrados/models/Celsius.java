package com.example.conversiongrados.models;

public class Celsius extends Grado {
    public Celsius(Double valor, String unidad) {
        super(valor, unidad);
    }

    public Fahrenheit parse(Celsius c){
        return new Fahrenheit(c.getValor()*1.8+32,"F");
    }
    public  Kelvin parse(Kelvin k){
        return  new Kelvin(k.getValor(), "K");
    }
}
