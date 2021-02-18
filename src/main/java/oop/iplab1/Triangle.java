/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.iplab1;

/**
 * @author morar
 */
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(){}

    public Triangle setBase(double n) {
        this.base = n;
        this.onAreaChange();
        return this;
    }

    public Triangle setHeight(double n) {
        this.height = n;
        this.onAreaChange();
        return this;
    }
    public void TypeOfShape()
    {
        System.out.println("This is a triangle");
    }
    public void onAreaChange() {
        this.area = (base * height) / 2;
    }

}
