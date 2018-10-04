

package healthypetsdemo;

import java.io.*;
import javax.swing.*;


public class HealthyPetsDemo {

   
    public static void main(String[] args) {

        
        Animal sixten = new Dog("Sixten", 5000);
        Animal dogge = new Dog("Dogge", 10000);
        Animal venus = new Cat ("Venus", 5000);
        Animal ove = new Cat("Ove", 3000);
        Animal hypno = new Snake ("Hypno", 1000);
        
        boolean tryAgain = true;
        while(tryAgain){
            try { 
                String answer = JOptionPane.showInputDialog("Vilken husdjur ska matas?");

                switch(answer.toLowerCase().trim()){
                    case "sixten":
                        IMealPlan plan1 = sixten;
                        System.out.println(sixten.name);
                        sixten.mealPlan();
                        tryAgain = false;
                        break;
                    case "dogge":
                        IMealPlan plan2 = dogge;
                        System.out.println(dogge.name);
                        dogge.mealPlan();
                        tryAgain = false;
                        break;
                    case "venus":
                        IMealPlan plan3 = venus;
                        System.out.println(venus.name);
                        venus.mealPlan();
                        tryAgain = false;
                        break;
                    case "ove":
                        IMealPlan plan4 = ove;
                        System.out.println(ove.name);
                        ove.mealPlan();
                        tryAgain = false;
                        break;
                    case "hypno":
                        IMealPlan plan5 = hypno;
                        System.out.println(hypno.name);
                        hypno.mealPlan();
                        tryAgain = false;
                        break;
                    }
            }
            catch(Exception e){
                JOptionPane.showInputDialog("Något blev fel försök igen");
                System.exit(0);
            }
        }  
    }
}
