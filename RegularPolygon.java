import java.nio.channels.Pipe;
import java.util.function.DoubleToIntFunction;

public class RegularPolygon {
    private int n;
    private double side =1,x = 0,y = 0;

    public RegularPolygon()
    {
        this.n=3;
        this.side=1;
        this.x = 0;
        this.y = 0;
    }
    public RegularPolygon(int n,double side)
    {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n,double side,double x,double y)
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }


    public double getPerimeter(){
        return this.side*this.n;
    }
    public double getArea(){
        return (n*(side*side)) / (4*Math.tan(Math.PI/n));
    }


}
