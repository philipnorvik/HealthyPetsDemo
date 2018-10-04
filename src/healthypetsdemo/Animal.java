/*
 * Javautveckling 2018
 */
package healthypetsdemo;

/**
 *
 * @author 01phi
 */
abstract class Animal implements IMealPlan{
    
    //enum som håller koll på matTypen
    protected FoodType foodType;
    protected String name;
    protected int weight;
    protected String bloodType;
    
    
   
    Animal(String name, int weight,FoodType foodType){
        this.name = name;
        this.weight = weight;
        this.foodType = foodType;
    }

    //Hämtar klass Namnet så kan man skilja om det är däggdjur eller reptil
    public String GetTypeOfAnimal(){
        return this.getClass().getName();
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
