package models;

import org.junit.rules.ExternalResource;
import org.sql2o.*;

public class DatabaseRules extends ExternalResource {
    @Override
    protected void before() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlifetrackerIP", "mark", "87654321");
    }

//    @Override
//    protected void after() {
//        try(Connection con = DB.sql2o.open()) {
//            String deleteAnimalssQuery = "DELETE FROM animals *;";
//            String deleteSightingsQuery = "DELETE FROM sightings *;";
//            con.createQuery(deleteAnimalssQuery).executeUpdate();
//            con.createQuery(deleteSightingsQuery).executeUpdate();
//        }
//    }
}