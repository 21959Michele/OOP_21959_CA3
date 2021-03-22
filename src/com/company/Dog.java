package com.company;

public class Dog {

    private String name;
    private String breed;
    private Integer age;
    private boolean isAvailable;


    public Dog (String name, String breed, Integer age){

        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isAvailable = true;
    }

    public String getName(){
        return name;
    }
    public  String getBreed(){
        return breed;
    }
    public Integer getAge(){
        return age;
    }
    void setAvailable(boolean available){
        isAvailable = available;
    }

        public boolean isAvailable(){
        return isAvailable;
        }

    @Override
    public String toString() {
        return "Dog: " + getName() + "\nbreed: " + getBreed() + "\nAge: " + getAge();
    }
}
