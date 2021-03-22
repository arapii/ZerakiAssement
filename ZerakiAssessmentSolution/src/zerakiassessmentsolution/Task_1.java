/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zerakiassessmentsolution;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bii
 */
public class Task_1 {

    public static void main(String[] args) {
        Task_1 task_1 = new Task_1();
        int k[] = {3, 5, 4, 1};        ;
        
        System.out.println("Missing Ineger: " + task_1.findMissingInteger(k));
    }

    public int findMissingInteger(int inputArray[]) {
         int N = inputArray.length + 2;
        int missingInteger = 0;
        int sumOfCurrentElements = 0;
        
        //get the sum of all possible elements
        int sumOfN =0;        
        for (int i = 1; i < N; i++) {
            sumOfN +=i;            
        }
        
        //compute the sum of the current elements
        for (int i = 0; i < inputArray.length; i++) {
            sumOfCurrentElements += inputArray[i];
        }
        //get the defference
        missingInteger = sumOfN - sumOfCurrentElements;

        
        return missingInteger;
       
    }

}
