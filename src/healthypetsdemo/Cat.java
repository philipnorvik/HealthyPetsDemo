/*
 * Javautveckling 2018
 */
package healthypetsdemo;

import java.util.*;

/**
 *
 * @author 01phi
 */
public class Cat extends Mamal implements IMealPlan{
    
    //Definera att detta djur äter kattmat
     Cat (String name, int weight){
        super(name, weight,FoodType.Kattfoder);
     }
     

//    ska detta vara i main? 
    public void mealPlan(){
        System.out.println("ska ha " + foodAmount() + " gram " + FoodType.Kattfoder);
    }
    
//   ska detta in i interfacet IMealPlan???
    public int foodAmount(){
        int meal =weight / 150;
        return meal;
    }
}
