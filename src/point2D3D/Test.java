package point2D3D;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point3D p2 = new Point3D();
        p1.setXY(2,3);
        System.out.println(Arrays.toString(p1.getXY()));
        System.out.println(Arrays.toString(p2.getXYZ()));
        p2.setXYZ(1,2,3);
        System.out.println(Arrays.toString(p2.getXYZ()));
    }
}
