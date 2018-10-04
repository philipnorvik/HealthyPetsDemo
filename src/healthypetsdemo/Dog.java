/*
 * Javautveckling 2018
 */
package healthypetsdemo;

/**
 *
 * @author 01phi
 */
public class Dog extends Mamal implements IMealPlan{
    
    
    public Dog(String name, int weight) {
        super(name, weight,FoodType.DogFood);
    }
    
     public void mealPlan(){
        System.out.println("Ska ha " + foodAmount() + " gram hundfoder" );
    }
     
    public int foodAmount(){
        int meal =weight / 100;
        return meal;
    }
    
}
