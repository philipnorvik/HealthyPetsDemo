
package healthypetsdemo;

import java.util.*;


public class Cat extends Mamal implements IMealPlan{
    
    //Definera att detta djur äter kattmat
    Cat (String name, int weight){
        super(name, weight,FoodType.Kattfoder);
    }
     
    public void mealPlan(){
        System.out.println("ska ha " + foodAmount() + " gram " + FoodType.Kattfoder);
    }
    
    public int foodAmount(){
        int meal =weight / 150;
        return meal;
    }
}
