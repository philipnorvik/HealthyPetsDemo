
package healthypetsdemo;


abstract class Reptile extends Animal{

    public Reptile(String name, int weight, FoodType foodType){
        super(name, weight,foodType);
          bloodType = "Cold";
    }
}
