/*
 * Javautveckling 2018
 */
package healthypetsdemo;

/**
 *
 * @author 01phi
 */
abstract class Reptile extends Animal{

    // Kan lägga ägg?
    
    public Reptile(String name, int weight, FoodType foodType){
        super(name, weight,foodType);
          bloodType = "Cold";
    }
    
}
