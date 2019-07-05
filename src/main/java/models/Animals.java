package models;

import org.sql2o.Connection;

public class Animals {
    protected String name;
    protected String age;
    protected String health;
    protected String type;
    protected int id;

//    public Animals(String name, String age, String health, String type, int id) {
//        this.name = name;
//        this.age = age;
//        this.health = health;
//        this.type = type;
//        this.id = id;
//    /}

    public String getName() {
        return name;
    }

    //Method to get Age of Animal
    public String getAge() {
        return age;
    }

    //Method to get health of animal
    public String getHealth() {
        return health;
    }

    //Method to get Type0
    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object otherAnimal) {
        if (!(otherAnimal instanceof Object)) {
            return false;
        }
        Animals myAnimal = (Animals) otherAnimal;
        return this.getName().equals(myAnimal.getName()) &&
                this.getType().equals(myAnimal.getType()) &&
//                this.getId() == myAnimal.getId() &&
                this.getAge() == myAnimal.getAge() &&
                this.getHealth().equals(myAnimal.getHealth());
    }

    //Method for saving
    public void save() {
        try (org.sql2o.Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name, age, health, type) VALUES (:name, :age, :health, :type);";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .addParameter("age", this.age)
                    .addParameter("health", this.health)
                    .addParameter("type", this.type)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
        }

    }

    //Method to Find Id
    public static Animals find(int id) {
        String sql = "SELECT * FROM animals WHERE id = :id;";
        try (Connection con = DB.sql2o.open()) {
            Animals myAnimal = con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Animals.class);
            return myAnimal;

        }


    }

    public void setId(int id) {
        this.id = id;
    }
}