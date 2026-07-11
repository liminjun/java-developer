public class Rectangle {
    public double area(double length, double width) {
        return length * width;
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        double area = rect.area(4.5, 3);
        System.out.println("The area of the rectangle is: "+ area);
    }
}
