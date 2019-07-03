package models;

import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.List;

public class EndangeredAnimalsTest{
    @Rule
    public DatabaseRules database = new DatabaseRules();
    @Test
    public void endangered_instantiatesCorrectly_true(){
        EndangeredAnimals testAnimal = new EndangeredAnimals("lion","okay", "young");
        assertEquals(testAnimal instanceof EndangeredAnimals, true);
    }
    @Test
    public void endangered_instantiatesWithAnimalName_String(){
        EndangeredAnimals testAnimal = new EndangeredAnimals("lion","okay", "young");
        assertEquals("lion", testAnimal.getName());
    }
    @Test
    public void endangered_instantiatesWIthAnimalHealth_String(){
        EndangeredAnimals testAnimal = new EndangeredAnimals("lion","okay", "young");
        assertEquals("okay", testAnimal.getHealth());
    }
    @Test
    public void endangered_instantiatesWithAgeOfAnimal_String(){
        EndangeredAnimals testAnimal = new EndangeredAnimals("lion","okay", "young");
        assertEquals("young", testAnimal.getAge());
    }
    @Test
    public void save_savesEndangeredAnimalObjectsIntoDB(){
        EndangeredAnimals testAnimal = new EndangeredAnimals("lion","okay", "young");
        testAnimal.save();
        assertTrue(EndangeredAnimals.all().get(0).equals(testAnimal));
    }
    @Test
    public void all_returnsAllInstancesOfEndangeredAnimals_true(){
        EndangeredAnimals firstAnimal = new EndangeredAnimals("lion","okay", "young");
        firstAnimal.save();
        EndangeredAnimals secondAnimal = new EndangeredAnimals("snake","healthy", "adult");
        secondAnimal.save();
        assertEquals(true, EndangeredAnimals.all().get(0).equals(firstAnimal));
        assertEquals(true, EndangeredAnimals.all().get(1).equals(secondAnimal));
    }
    @Test
    public void find_returnsEndangeredAnimalWithSameId_secondAnimal(){
        EndangeredAnimals firstAnimal = new EndangeredAnimals("lion","okay", "young");
        firstAnimal.save();
        EndangeredAnimals secondAnimal = new EndangeredAnimals("snake","healthy", "adult");
        secondAnimal.save();
        assertEquals(EndangeredAnimals.find(secondAnimal.getId()), secondAnimal);
    }
}