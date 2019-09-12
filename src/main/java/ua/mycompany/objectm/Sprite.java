package ua.mycompany.objectm;

import java.util.Objects;

public class Sprite{
    private String material;
    private int price;
    private double capacity;

    public Sprite() {
        material = "glass";
        price = 20;
        capacity = 1.0;
    }

    public Sprite(String material, int price, double capacity) {
        this.material = material;
        this.price = price;
        this.capacity = capacity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean equals(Sprite sprite) {
        if (this == sprite) return true;
        if (sprite == null || getClass() != sprite.getClass()) return false;
        return price == sprite.price &&
                Double.compare(sprite.capacity, capacity) == 0 &&
                material.equals(sprite.material);
    }

    public int hashCode() {
        return (price-2+(int)capacity + material.length()+8)*32;
    }
}
