public class Display {
    public void show(int number) {
        System.out.println("Number: " + number);
    }
    public void show(String text) {
        System.out.println("Text: " + text);
    }
    public static void main(String[] args) {
        Display display = new Display();
        display.show(10);
        display.show("Hello, World!");
    }
}
