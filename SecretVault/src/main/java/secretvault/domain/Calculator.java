package secretvault.domain;


import java.util.*;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    
    public int calculate(int num1, int num2, String operation) {
        int answer = 0;
        
        if (operation.equals("+")) {
            answer = num1 + num2;
        }
        
        if (operation.equals("-")) {
            answer = num1 - num2;
        }
        
        if (operation.equals("*")) {
            answer = num1 * num2;
        }
        
        if (operation.equals("/") && num2 != 0) {
            answer = num1 / num2;
        }
        
        return answer;
    }
}
