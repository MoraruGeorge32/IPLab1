package oop.iplab1;

public class Source {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        c=c.setRadius(10);
        t=t.setHeight(20);
        t=t.setBase(10);
        r=r.setHeight(10);
        r=r.setWidth(20);
        System.out.println(r.getArea());
        System.out.println(t.getArea());
        System.out.println(c.getArea());
        r=r.setWidth(400);
        System.out.println(r.getArea());
        Audi A4=new Audi();
        A4.SetPriceYear(2500);
        System.out.println(A4.TopSpeed());
        System.out.println(A4.getYearOfProduction()+"  "+A4.GetPrice());
        A4.SetPriceYear(7000,2014);
        System.out.println(A4.getYearOfProduction()+"  "+A4.GetPrice());
        t.TypeOfShape();
        r.TypeOfShape();

    }
}
