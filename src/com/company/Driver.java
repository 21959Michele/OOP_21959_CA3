package com.company;

public class Driver {

    public static void Run(){

        AdoptionHouse adoptionHouse = new AdoptionHouse("001", "TrustDogs.ie", "Dublin");


        Dog puppy1 = new Dog("Butch", "Pit Bull", "male", 2);
        Dog puppy2 = new Dog("Bailey", "Greyhound", "female",4 );
        Dog puppy3 = new Dog("Baxter", "Lurcher", "male", 6 );
        Dog puppy4 = new Dog("Bella Trix", "Jach Russel Terrier", "female",3 );
        Dog puppy5 = new Dog("Blanca", "Staffordshire Cross", "female",7 );
        Dog puppy6 = new Dog("Charlie", "Terrier Cross","male", 5 );
        Dog puppy7 = new Dog("Elsie", "Labrador","male", 3 );
        Dog puppy8 = new Dog("Bingo", "poodle","male", 7);

        puppy1.setAvailable(true);
        puppy2.setAvailable(false);
        puppy3.setAvailable(true);
        puppy4.setAvailable(false);
        puppy5.setAvailable(true);
        puppy7.setAvailable(false);
        puppy8.setAvailable(true);

        adoptionHouse.addDogAdoptionHouse(puppy1);
        adoptionHouse.addDogAdoptionHouse(puppy2);
        adoptionHouse.addDogAdoptionHouse(puppy3);
        adoptionHouse.addDogAdoptionHouse(puppy4);
        adoptionHouse.addDogAdoptionHouse(puppy5);
        adoptionHouse.addDogAdoptionHouse(puppy6);
        adoptionHouse.addDogAdoptionHouse(puppy7);
        adoptionHouse.addDogAdoptionHouse(puppy8);


        adoptionHouse.printDogs();

        adoptionHouse.printDogsAdopted();

        adoptionHouse.printDogsAvailable();


    }
}
