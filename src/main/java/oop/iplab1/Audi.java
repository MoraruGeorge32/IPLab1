package oop.iplab1;

public class Audi implements car {
    private int price;
    private int yearOfProduction=0;

    public double getConsum() {
        return 6.78;
    }

    public double HorsePower() {
        return 200;
    }

    public int getDoorsNumber() {
        return 4;
    }

    public int TopSpeed() {
        return 240;
    }

    public void SetPriceYear(int x) //Functie folosita la polimorfism static
    {
        this.price = x;
        if (this.yearOfProduction == 0)
            this.yearOfProduction = 2000;
    }
    public void SetPriceYear(int x,int y)//Functie folosita la polimorfism static
    {
        this.price = x;
            this.yearOfProduction = y;
    }
    public int getYearOfProduction()
    {
        return this.yearOfProduction;
    }
    public int GetPrice() {
        return this.price;
    }

}

