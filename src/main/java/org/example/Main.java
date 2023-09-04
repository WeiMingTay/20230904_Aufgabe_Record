package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Real Estate
        RealEstate rE1 = new RealEstate("irgendwo", 5, 60000);
        System.out.println(rE1);
        RealEstate rE1Copy = rE1.withPrice(75_000d);
        System.out.println(rE1Copy);


        // Owner
        Owner owner1 = new Owner("Michelangelo", 23, "Unterm Gulli, hinten links");
        Owner owner2 = new Owner("Donatello", 24, "Unterm Gulli, hinten rechts");
        Owner owner3 = new Owner("Leonardo", 22, "Unterm Gulli, vorne rechts");
        Owner owner4 = new Owner("Raphaelo", 22, "Unterm Gulli, vorne links");

        //Species
        Species musang = new Species("Musang", "Schleichkatzen", 2300, 18);
        Species ginsterkatze = new Species("Ginsterkatzen", "Schleichkatzen", 2700, 16);
        Species makake = new Species("Makake", "Meerkatzenverwandte", 1300, 8);
        Species cicada = new Species("Cicada", "Cicadidae", 20, 1);

// Animal
        Animal musangKing = new Animal(1001, "King", musang, 3, owner1);
        Animal queen = new Animal(1002, "Queen", makake, 3, owner3);
        Animal cica = new Animal(1003, "Princess", cicada, 1, owner1);
        Animal miao = new Animal(1004, "Prince", ginsterkatze, 4, owner2);

        System.out.println(musangKing);
        Animal newMusangCopy = musangKing.withAge(6);
        System.out.println(newMusangCopy);


        System.out.println(musangKing.equals(queen));

        System.out.println(musangKing.species().family().equals(miao.species().family()));

        System.out.println(cica.owner());


        Set<Animal> animals = new HashSet<>();
        animals.add(musangKing);
        animals.add(queen);
        animals.add(cica);
        animals.add(miao);

        Zoo zoo = new Zoo(animals);
        System.out.println(zoo);

        System.out.println("Gesamtbedarf pro Tag: "+zoo.foodTotal()/1000+"kg");
    }
}