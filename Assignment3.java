import java.util.Scanner;
class Shape {
    double area;
    public void getInputs() {
    }
    public void setArea(double base, double height) {
        area = 0.5 * base * height;
    }
    public void setArea(int side) {
        area = side * side;
    }
    public void setArea(double radius) {
        area = 3.14 * radius * radius;
    }
    public void displayArea() {
        System.out.println("Area: " + area);
    }
}
class Triangle extends Shape {
    @Override
    public void getInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base length of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        setArea(base, height);
    }
}

class Square extends Shape {
    @Override
    public void getInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side length of the square: ");
        int side = scanner.nextInt();
        setArea(side);
    }
}

class Circle extends Shape {
    @Override
    public void getInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        setArea(radius);
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");
        int shapeChoice = scanner.nextInt();
        Shape shape = null;
        switch (shapeChoice) {
            case 1:
                shape = new Triangle();
                break;
            case 2:
                shape = new Square();
                break;
            case 3:
                shape = new Circle();
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        shape.getInputs();
        shape.displayArea();
        scanner.close();
    }
}
