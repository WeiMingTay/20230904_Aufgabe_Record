package org.example;

public record Animal(
        int id,
        String name,
        Species species,
        int age,
        Owner owner) {

   public Animal withAge(int age) {
       return new Animal(this.id, this.name, this.species, age, this.owner);
    }
    public Animal withId(int id) {
        return new Animal(id, this.name, this.species, this.age, this.owner);
    }
}
