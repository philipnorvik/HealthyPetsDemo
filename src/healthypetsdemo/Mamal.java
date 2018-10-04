
package healthypetsdemo;

/**
 * extra kod som inte behövs
 */
abstract class Mamal extends Animal{
    
    //speciella attribut för mamals för att skilja från Reptile 
    Mamal (String name, int weight, FoodType foodType){
        super(name, weight,foodType);
          bloodType = "Warm";
          
    }
}
