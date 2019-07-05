package models;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredAnimalsTest {
    @Rule
    public DatabaseRules database = new DatabaseRules();
    @Test
    public void EndangeredAnimals_InstantiatesCorrectly_true(){
        EndangeredAnimals myEndangeredAnimal = new EndangeredAnimals("panther","young","weak","");
        assertEquals(true, myEndangeredAnimal instanceof EndangeredAnimals);
    }
    @Test(expected = IllegalArgumentException.class)
    public void animal_InstantiatesWithName_panther(){
        EndangeredAnimals myEndangeredAnimal = new EndangeredAnimals("","","","");
        assertEquals("panther", myEndangeredAnimal.getName());
    }

    // test to see if animal instantiates with an age and if an error is thrown
    @Test (expected = IllegalArgumentException.class)
    public void EndangeredeAnimal_InstantiatesWithAge_mature(){
        EndangeredAnimals myEndangeredAnimal = new EndangeredAnimals("","","","");
    }

    // test to see if animal instantiates with the health status and if an error is thrown
    @Test (expected = IllegalArgumentException.class)
    public void EndangeredAnimal_InstantiatesWithHealth_Weak(){
        EndangeredAnimals myEndangeredAnimal = new EndangeredAnimals("","","","");
    }
//    //test to check if info is saved into database
//    @Test
//    public void EndangeredAnimal_IsSavedInDatabase(){
//        EndangeredAnimals myEndangeredAnimal = new EndangeredAnimals("panther", "adult", "healthy","endangered");
//        myEndangeredAnimal.save();
//        assertTrue(myEndangeredAnimal.all().get(0).equals(myEndangeredAnimal));
//    }
//    //Test to find Animal with the Same Id
//    public void find_WillReturnEndangeredAnimalWithTheSame_SecondAnimal(){
//        EndangeredAnimals firstEndangeredAnimal = new EndangeredAnimals("panther", "adult", "healthy","endangered");
//        firstEndangeredAnimal.save();
//        EndangeredAnimals SecondEndangeredAnimal = new EndangeredAnimals("panther", "adult", "healthy","endangered");
//        SecondEndangeredAnimal.save();
//        assertEquals(EndangeredAnimals.find(SecondEndangeredAnimal.getId()), SecondEndangeredAnimal);
//    }
//    //Animal is assigined an Id
//    @Test
//    public void EndangeredAnimal_AnimalIsAssingnedAnID_getid(){
//        EndangeredAnimals myEndangeredAnimal = new EndangeredAnimals("panther", "adult", "healthy","endangered");
//        myEndangeredAnimal.save();
//        EndangeredAnimals testEndangeredAnimals = EndangeredAnimals.all().get(0);
//        assertEquals(myEndangeredAnimal.getId(), testEndangeredAnimals.getId());
//    }
//    @Test
//    public void EndangeredAnimal_AllInstancesOfAnimalAreReturned_True(){
//        EndangeredAnimals myEndangeredAnimal1 = new EndangeredAnimals("panther", "adult", "healthy","endangered");
//        myEndangeredAnimal1.save();
//        EndangeredAnimals myEndangeredAnimal2 = new EndangeredAnimals("Black Rhino", "adult", "healthy","endangered");
//        myEndangeredAnimal2.save();
//        assertTrue(EndangeredAnimals.all().get(0).equals(myEndangeredAnimal1));
//        assertTrue(EndangeredAnimals.all().get(1).equals(myEndangeredAnimal2));
//    }





}