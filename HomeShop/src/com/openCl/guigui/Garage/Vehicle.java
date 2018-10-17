package com.openCl.guigui.Garage;

public class Vehicle {
        private String modelName;
        private String description;
        private String manufacturer;
        private int year;
        private String color;
        private int speed;
        private int[] dimensions = new int[3];
        private int weight;

        public Vehicle(String modelName, String description, String manufacturer, int yeah, String color, int speed, int[] dimensions, int weight) {
            this.modelName = modelName;
            this.description = description;
            this.manufacturer = manufacturer;
            this.year = year;
            this.color = color;
            this.speed = speed;
            this.dimensions = dimensions;
            this.weight = weight;
        }

        public void start() {
            System.out.println("Je suis " + modelName + " et je  démarre");
        }

        public void stop() {
            System.out.println("Je suis " + modelName + " et je m'arrête");
        }

        // ... Getter ...


    public String getModelName() {
        return modelName;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }
}
