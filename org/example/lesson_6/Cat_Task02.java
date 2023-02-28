package lesson_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cat_Task02 {

    private String name;
    private String breed;
    private String color;
    private LocalDate birthDate;
    private List<Award> awards;
    private String owner;

    public Cat_Task02(String name, String breed, String color, LocalDate birthDate, String owner) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.birthDate = birthDate;
        this.owner = owner;
        this.awards = new ArrayList<Award>();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Cat_Task02{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", birthDate=" + birthDate +
                ", awards=" + awards +
                ", owner='" + owner + '\'' +
                '}';
    }

    public void addAward(Award award) {
        awards.add(award);
    }
}
