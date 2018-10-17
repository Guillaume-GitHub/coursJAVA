package com.openCl.guigui.Garage;
public abstract class Vehicle {
        protected String modelName;
        private String description;
        private String manufacturer;
        private int year;
        private String color;
        private int speed;
        private int[] dimensions = new int[3];
        private int weight;

    public Vehicle() {
    }

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

        public abstract void start();

        public abstract void stop();

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
