public class Greeting {
    public void greet(String name, int age) {
        System.out.println("Hello, "+ name + "! You are "+ age + " years old.");
    }
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greet("Lee", 30);
    }
}
