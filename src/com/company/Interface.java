package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public interface Interface {
    HashMap<String, String> getDogsAvailable();

    HashMap<String, String> getDogsAdopted();

    ArrayList<Dog> getListOfDogs();

    void addDogAdoptionHouse(Dog dog);


}
