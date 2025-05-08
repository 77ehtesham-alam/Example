public class Example2 {
    public static void main(String[] args) {
        System.out.println("Hello, this is Example2!");
        // Call the method to calculate the area of a rectangle
        double area = calculateArea(5.0, 3.0);
        System.out.println("The area of the rectangle is: " + area);
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
}

