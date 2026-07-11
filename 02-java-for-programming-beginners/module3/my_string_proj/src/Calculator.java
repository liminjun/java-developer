public class Calculator {
    public int multiply(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int product = calc.multiply(4, 5);
        System.out.println("The product is: "+ product);
    }
}
