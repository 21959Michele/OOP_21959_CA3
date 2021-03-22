package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdoptionHouse extends Rehoming implements Interface {


    private String adoptionId;


    private ArrayList<Dog> dogs = new ArrayList<>();

    private HashMap<String, String> dogsAvailable = new HashMap<>();


    private HashMap<String, String> dogsAdopted = new HashMap<>();

    private WriteFile writeFile;

    public AdoptionHouse (String adoptionId, String ONG, String city){
        super(ONG, city);
        this.adoptionId = adoptionId;

        CreateFile listOfDogsTXT = new CreateFile("ListOfDogs");
        writeFile = new WriteFile("ListOfDogs");
    }

    public String getAdoptionId(){ return adoptionId;
    }

       @Override
    public void addDogAdoptionHouse(Dog dog) {
        getListOfDogs().add(dog);
        writeFile = new WriteFile(dog, "ListOfDogs");
    }


    @Override
    public HashMap<String, String> getDogsAvailable() {
        HashMap<String, String> dogsAvailable = new HashMap<>();

        for (Dog dog :  getListOfDogs()){
            if (dog.isAvailable() == true)
                dogsAvailable.put(dog.getName(), dog.getBreed());
        }
        this.dogsAvailable = dogsAvailable;
        return dogsAvailable;
    }


    //# Feature: Overriding
    @Override
    public HashMap<String, String> getDogsAdopted(){
        HashMap<String, String> dogsAdopted = new HashMap<>();

        for (Dog dog :  getListOfDogs()){
            if (dog.isAvailable() == false)
                dogsAdopted.put(dog.getName(), dog.getBreed());
        }
        this.dogsAdopted = dogsAdopted;
        return dogsAdopted;
    }


    @Override
    public ArrayList<Dog> getListOfDogs() {
        return dogs;
    }

     void printDogs(){
        System.out.println("ONG: " + getRehomingPlace() + " | " + "Dog ID: " + getAdoptionId());
        System.out.println("");
        for (Dog dog : getListOfDogs()){
            System.out.println(dog.toString() + "\n");

        }
    }


    void printDogsAdopted(){

        HashMap<String, String> dogsAdopted = getDogsAdopted();

        System.out.println("Adopted dogs:\n");

        for (Map.Entry<String, String> dogs: dogsAdopted.entrySet()){
            System.out.println("Dog Name: "+dogs.getKey() + "\n" + "Breed: " + dogs.getValue());

        }
    }

    void printDogsAvailable(){

        HashMap<String, String> dogsAvailable = getDogsAvailable();

        System.out.println("Available dogs:\n");

        for (Map.Entry<String, String> dog: dogsAvailable.entrySet()){
            System.out.println("Dog Name: "+dog.getKey() + "\n" + "Breed: " + dog.getValue());

        }
    }
}

