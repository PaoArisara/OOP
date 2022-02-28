import org.w3c.dom.css.Rect;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    private double width,height;

    public Rectangle(){

    }

    public Rectangle(double width,double height){
        this.height =height;
        this.width = width;
    }

    public Rectangle(double width,double height,String color,boolean filled){
        this.width =width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Rectangle obj) {
        if (this.getArea() > obj.getArea()) {
            return 1;
        } else if (this.getArea() < obj.getArea()) {

            return -1;
        } else
            return 0;

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Rectangle) {
            return this.compareTo((Rectangle) obj) == 0;
        } else
            return false;

    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }

}
