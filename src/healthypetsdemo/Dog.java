
package healthypetsdemo;


public class Dog extends Mamal implements IMealPlan{
    
    
    public Dog(String name, int weight) {
        super(name, weight,FoodType.Hundfoder);
    }
    
    public void mealPlan(){
        System.out.println("Ska ha " + foodAmount() + " gram " + FoodType.Hundfoder );
    }
     
    public int foodAmount(){
        int meal =weight / 100;
        return meal;
    }
}
