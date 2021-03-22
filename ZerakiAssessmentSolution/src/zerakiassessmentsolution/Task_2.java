/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zerakiassessmentsolution;

/**
 *
 * @author Bii
 */
public class Task_2 {
    public static void main(String[] args) {
         Task_2 task_2=new Task_2();
         String inputString="Lorem at";
        System.out.println("Transformed: "+task_2.transformString(inputString));  ;
    }
    public String transformString( String inputString) {
      
      // String noSpace = inputString.replace(" ", "");
       char c[]=inputString.toCharArray();
        String transformedString="";
        
        for (int i =c.length-1; i>=0; i--) {           
            transformedString +=c[i];
        }
        return transformedString;
    }
}
