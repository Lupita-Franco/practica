/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Lupita
 */
public class Model {
    private double peso = 0;
    private double altura =0;
    private NumberFormat df = new DecimalFormat("0.0");
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String calcular()
    {
        return df.format(this.peso/(this.altura*this.altura));
    }

    private String string(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
