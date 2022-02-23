package nl.codegorilla.CodeGorilla.exercises.dag7.exercise1;

import java.util.Objects;

public class Car {
    private Brand brand;
    private String model;
    private Color color;

    public Car(Brand brand, String model, Color color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}
