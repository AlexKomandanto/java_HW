package lesson_6;

public class Cat_Test {
    private String name;
    private String owner;
    private String breed;
    private Float weight;

    public Cat_Test(String name, String owner, String breed, Float weight) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
    public String getOwner() {
        return owner;
    }
    public String getBreed() {
        return breed;
    }
    public Float getWeight() {
        return weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setWeight(Float weight) {
        this.weight = weight;
    }
    public void meow(){
        System.out.println("Meow!");
    }

    @Override
    public String toString(){
        return "Cat [name=" + name + ", owner=" + owner + ", breeed=" + breed + ", weight=" + weight + "]" ;
    }
}
