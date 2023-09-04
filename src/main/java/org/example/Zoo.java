package org.example;

import java.util.List;
import java.util.Set;

public record Zoo(
Set<Animal> animals
) {
public Zoo(Set<Animal> animals) {
this.animals = animals;
}
public double foodTotal() {
    double totalFood = 0;
    for (Animal animal : animals) {
        totalFood += animal.species().foodDaily();
    }
    return totalFood;
}
}
