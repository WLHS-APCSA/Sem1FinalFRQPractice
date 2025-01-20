package Dinosaur;

import java.util.Random;

public class DinosaurKey {
    private String species;
    private String name;
    private String diet; //omnivore, herbivore, carnivore
    private int age;
    private double weight;

    public DinosaurKey(String species, String name, String diet, int age, double weight) {
        this.species = species;
        this.name = name;
        this.diet = diet;
        this.age = age;
        this.weight = weight;
    }

    /**
     *
     * @return String species of the dinosaur
     */
    public String getSpecies() {
        return species;
    }

    /**
     *
     * @return String name of the dinosaur
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return String diet of the dinosaur
     */
    public String getDiet() {
        return diet;
    }

    /**
     *
     * @return int age of the dinosaur
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return double weight of the dinosaur in kilograms
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Change the name of the dinosaur
     * @param name String new name of dinosaur
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Change weight of dinosaur
     * @param weight double new weight of dinosaur
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Change age of dinosaur
     * @param age int new age of dinosaur
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Determines if a dinosaur is hungry. There is a 65% chance the dinosaur is hungry.
     * @return true if the random integers is in the interval [0,65), false otherwise
     */
    public boolean isHungry(){
        Random rand = new Random();
        int chance = rand.nextInt(0,101);
        return chance >= 0 && chance < 65;
    }

    /**
     * Determines if the Dinosaur can eat the provided food. Carnivores eat met, Herbivores eat plants,
     * and Omnivores will eat either. foodType input should be converted to title case
     * @param food name of food
     * @param foodType meat or plant
     * @return true if the food can be consumed, false if not
     */
    public boolean canEat(String food, String foodType){
        foodType = foodType.toLowerCase();
        foodType = foodType.replace(foodType.charAt(0),Character.toUpperCase(foodType.charAt(0)));
        food = food.toLowerCase();
        if(this.diet.equals("Carnivore") && foodType.equals("Meat")){
            System.out.printf("%s consumed %s\n",this.name,food);
            return true;
        }
        else if(this.diet.equals("Herbivore") && foodType.equals("Plant")){
            System.out.printf("%s consumed %s\n",this.name,food);
            return true;
        }
        else if(this.diet.equals("Omnivore")){
            System.out.printf("%s consumed %s\n",this.name,food);
            return true;
        }
        else{
            System.out.printf("%s cannot consume %s\n",this.name,food);
            return false;
        }
    }

    /**
     * If a dino is hungry and can consume the food it will, otherwise it is
     * not hungry.
     * @param food String name of food
     * @param foodType String meat or plant
     */
    public void eat(String food, String foodType){
        food = food.toLowerCase();
        if(isHungry() && canEat(food, foodType)){
            System.out.printf("%s feels much better after eating %s\n",this.name,food);
        }
        else{
            System.out.printf("%s doesn't feel hungry right now\n",this.name);
        }
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nSpecies: %s\nAge: %d\nDiet: %s\nWeight: %.2f kg",
                this.name,this.species,this.age,this.diet,this.weight);
    }
}
