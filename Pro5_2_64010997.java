public class Pro5_2_64010997 {
    public static void main(String[] agrs) {
        RegularPolygon regPol_1 = new RegularPolygon();
        RegularPolygon regPol_2 = new RegularPolygon(6,4);
        RegularPolygon regPol_3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("");
        System.out.println("parimeter1 " + regPol_1.getPerimeter() );
        System.out.println("area1 "+ regPol_1.getArea());

        System.out.println("parimeter2 "+ regPol_2.getPerimeter());
        System.out.println("area2 "+ regPol_2.getArea());

        System.out.println("parimeter3 "+ regPol_3.getPerimeter());
        System.out.println("area3 "+ regPol_3.getArea());
    }
}
