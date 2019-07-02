package models;

public class Animals {
    private int animals_id;
    private String animals_name;

    public int getAnimals_id() {
        return animals_id;
    }

    public String getAnimals_name() {
        return animals_name;
    }

    public Animals(int animals_id, String animals_name) {
        this.animals_id = animals_id;
        this.animals_name = animals_name;

    }
}