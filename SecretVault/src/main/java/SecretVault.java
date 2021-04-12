import java.util.*;
import java.util.Scanner;

public class SecretVault {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Syötä lasku (välilyönnit väliin):");
        String calculation = scanner.nextLine();
        String[] a = calculation.split(" ");
        int num1 = Integer.valueOf(a[0]);
        int num2 = Integer.valueOf(a[2]);
        String operation = a[1];
        int answer = calculator.calculate(num1, num2, operation);
        System.out.println(answer);
    }    
}
