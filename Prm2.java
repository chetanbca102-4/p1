

class RectangleArea {
    double length;
    double breadth;

    // Constructor
    RectangleArea(double l, double b) {
        length = l;
        breadth = b;
    }

    double getArea() {
        return length * breadth;
    }
}

class RectanglePerimeter {
    double length;
    double breadth;

    // Constructor
    RectanglePerimeter(double l, double b) {
        length = l;
        breadth = b;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class Prm2 {
    public static void main(String[] args) {
        double length = 10;
        double breadth = 5;

        // Area calculation
        RectangleArea areaRect = new RectangleArea(length, breadth);
        System.out.println("Area of Rectangle: " + areaRect.getArea());

        // Perimeter calculation
        RectanglePerimeter perimeterRect = new RectanglePerimeter(length, breadth);
        System.out.println("Perimeter of Rectangle: " + perimeterRect.getPerimeter());
    }
}
