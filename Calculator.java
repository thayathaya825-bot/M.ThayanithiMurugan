import java.util.Scanner;
class Calculator {
int a, b;
void calculate() {
System.out.println("Addition = " + (a + b));
System.out.println("Subtraction = " + (a - b));
System.out.println("Multiplication = " + (a * b));
System.out.println("Division = " + (a / b));
}
}
public class Main {
public static void main(String[] args) {
Calculator obj = new Calculator();
Scanner sc = new Scanner(System.in);
System.out.print("Enter first number: ");
obj.a = sc.nextInt();
System.out.print("Enter second number: ");
obj.b = sc.nextInt();
obj.calculate();
}
}

