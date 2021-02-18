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
public class Rectangle extends Shape {
    private double height;
    private double width;
    public Rectangle()
    {

    }
    public Rectangle setHeight(double h)
    {
        this.height=h;
        this.onAreaChange();
        return this;
    }
    public Rectangle setWidth(double h)
    {
        this.width=h;
        this.onAreaChange();
        return this;
    }

    public void onAreaChange() {
        this.area=this.height*this.width;
    }


}
