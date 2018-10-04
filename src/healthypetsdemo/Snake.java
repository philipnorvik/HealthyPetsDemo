
package healthypetsdemo;


public class Snake extends Reptile implements IMealPlan{
    

    public Snake(String name, int weight) {
        super(name, weight,FoodType.Ormpellets);
    }
    
    public void mealPlan(){
        System.out.println("Ska ha " + foodAmount() + " gram " + FoodType.Ormpellets );
    }
     
    public int foodAmount(){
        int meal = 20;
        return meal;
    }
}
