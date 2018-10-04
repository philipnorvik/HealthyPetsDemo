
package healthypetsdemo;


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
    
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getWeight() {
        return weight;
    }

    
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
