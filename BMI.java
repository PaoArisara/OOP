import java.util.Scanner;
public class BMI {

    double pound = 0.45359237;
    double oneinches = 0.0254;
    String name;
    int age;
    double weight,height;

    public BMI(String name,int age,double weight,double height)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    public double getw()
    {
        return this.weight*this.pound;
    }

    public double geti()
    {
        //double height = (feet / 12) + inches;
        return (height*this.oneinches)*(height*this.oneinches);
    }
    public double getbmi()
    {
        return getw()/geti();
    }

}
