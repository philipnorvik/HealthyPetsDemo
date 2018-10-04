/*
 * Javautveckling 2018
 */
package healthypetsdemo;

/**
 * extra kod som inte behövs
 * @author 01phi
 */
abstract class Mamal extends Animal{
    
    //speciella attribut för mamals?   
    Mamal (String name, int weight, FoodType foodType){
        super(name, weight,foodType);
          bloodType = "Warm";
          
    }
}
