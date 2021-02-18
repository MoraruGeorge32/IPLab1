/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.iplab1;

/**
 *
 * @author morar
 */
public class Circle extends Shape{
    private double radius;
    final private double PI=Math.PI;
    public Circle()
    {

    }
    public Circle setRadius(double r)
    {
        this.radius=r;
        this.onAreaChange();
        return this;
    }
    public void onAreaChange (){
        this.area=this.PI*this.radius*this.radius;
    }
    public void TypeOfShape()
    {
        System.out.println("This is a circle");
    }
}
