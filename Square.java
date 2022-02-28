public class Square extends GeometricObject {

    private double height;

    public Square(){

    }
    

    public Square(double height,String color, boolean filled) {
        super(color, filled);
        this.height = height;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");

    }

    @Override
    public double getArea() {
        return height * height;
    }

    @Override
    public double getPerimeter() {
        return height * 4;
    }
}
