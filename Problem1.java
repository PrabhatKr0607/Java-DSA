public class Main {
    public static void main(String[] args) {
        System.out.println("Write a program that takes two numbers as input and display the product of two numbers");

        Scanner in = new Scanner(System.in);

        System.out.print("First number: ");
        int num1 = in.nextInt();

        System.out.print("Second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}
