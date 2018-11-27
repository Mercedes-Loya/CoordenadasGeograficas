/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mloya.modelo;

/**
 *
 * @author MARIA LOYA
 */
public class Circulo {
    private Punto p;
    private int radio;

    public Circulo() {
    }

    public Circulo(Punto p, int radio) {
        this.p = p;
        this.radio = radio;
    }

    /**
     * @return the p
     */
    public Punto getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Punto p) {
        this.p = p;
    }

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "El centro es:"+getP()+"\n"
                +"De radio: "+getRadio();
    }
    
}
