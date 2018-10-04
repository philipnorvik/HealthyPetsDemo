/*
 * Javautveckling 2018
 */
package healthypetsdemo;

/**
 *
 * @author 01phi
 */
public class Snake extends Reptile implements IMealPlan{
    

    public Snake(String name, int weight) {
        super(name, weight,FoodType.SnakeFood);
    }
     public void mealPlan(){
        System.out.println("Ska ha " + foodAmount() + " gram ormpellets" );
    }
     
    public int foodAmount(){
        int meal = 20;
        return meal;
    }
}
