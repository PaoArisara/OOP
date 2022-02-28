
public class Pro8_2_64010997 {
    public static void main(String[] args)throws Exception {
        GeometricObject[] geometricObject = new GeometricObject[5];
        geometricObject[0] = new Square(2,"white",true);
        geometricObject[1] = new Square(2.5,"blue",true);
        geometricObject[2] = new Square(3,"red",true);
        geometricObject[3] = new Square(3.5,"black",true);
        geometricObject[4] = new Square(4,"green",true);
        
        for (int i = 0; i < 5; i++) {
            System.out.println(geometricObject[i]);
            System.out.println("Filled= "+geometricObject[i].isFilled());
            System.out.println("Area= "+ geometricObject[i].getArea());
            System.out.println("Perimeter= "+ geometricObject[i].getPerimeter());
            ((Square)geometricObject[i]).howToColor();
            System.out.println();
           // System.out.println("Perimeter= "+ square.getPerimeter);
        }
    }
}
