/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.iplab1;

/**
 *
 * @author Moraru George, Musteata Robert
 */
abstract public class Shape {
    public double area;
    public Shape()
    {
        area=0;
    }
    public double getArea()
    {
        return area;
    }
    public abstract void onAreaChange();//polimorfism dinamic. este supra

    public void TypeOfShape()//functie folosita la polimorfismul dinamic
    {
        System.out.println("Abstract idea of a shape");
    }
}
//polimorfism si interfata


