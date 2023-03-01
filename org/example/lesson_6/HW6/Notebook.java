package lesson_6.HW6;

public class Notebook {
    private String brand;
    private int ram;
    private int hddVolume;
    private String operatingSystem;
    private String color;

    public Notebook(String brand, int ram, int hddVolume, String operatingSystem, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hddVolume = hddVolume;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getHddVolume() {
        return hddVolume;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }
}

