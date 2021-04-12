package secretvault.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rozmarin
 */
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
