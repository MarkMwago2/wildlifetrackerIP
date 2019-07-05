package models;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {
    @Rule
    public DatabaseRules database = new DatabaseRules();

    @Test
    public void animal_InstantiatesCorrectly_true() {
        NonEndangered myAnimal = new NonEndangered("panther", "young", "weak", "endangered");
        assertEquals(true, myAnimal instanceof NonEndangered);
    }

    @Test(expected = IllegalArgumentException.class)
    public void animal_InstantiatesWithName_panther() {
        NonEndangered myAnimal = new NonEndangered("", "", "", "");
        assertEquals("panther", myAnimal.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void animal_InstantiatesWithAge_panther() {
        NonEndangered myAnimal = new NonEndangered("", "", "", "");
        assertEquals("panther", myAnimal.getAge());
    }

    @Test(expected = IllegalArgumentException.class)
    public void animal_InstantiatesWithHealth_panther() {
        NonEndangered myAnimal = new NonEndangered("", "", "", "");
        assertEquals("panther", myAnimal.getHealth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void animal_InstantiatesWithType_panther() {
        NonEndangered myAnimal = new NonEndangered("", "", "", "");
        assertEquals("panther", myAnimal.getType());
    }


    // test to see if animal instantiates with an age and if an error is thrown
    @Test(expected = IllegalArgumentException.class)
    public void animal_InstantiatesWithAge_mature() {
        NonEndangered myAnimal = new NonEndangered("", "", "", "");
    }

    // test to see if animal instantiates with the health status and if an error is thrown
    @Test(expected = IllegalArgumentException.class)
    public void animal_InstantiatesWithHealth_Weak() {
        NonEndangered myAnimal = new NonEndangered("", "", "", "");
    }

//    @Test
//    public void animal_IsSavedInDatabase() {
//        NonEndangered myAnimal = new NonEndangered("panther", "adult", "healthy", "nonendangered");
//        myAnimal.save();
//        assertTrue(NonEndangered.all().get(0).equals(myAnimal));
//    }

    //Test to check if all instances of regular animals are made
//    @Test
//    public void animal_AllInstancesOfAnimalAreReturned_True() {
//        NonEndangered myAnimal1 = new NonEndangered("coyote", "young", "healthy", "nonendangered");
//        myAnimal1.save();
//        NonEndangered myAnimal2 = new NonEndangered("jaguar", "mature", "healthy", "nonendangered");
//        myAnimal2.save();
//        assertTrue(NonEndangered.all().get(0).equals(myAnimal1));
//        assertTrue(NonEndangered.all().get(1).equals(myAnimal2));
//    }

    //Animal is assigined an Id
//    @Test
//    public void animal_AnimalIsAssingnedAnID_getid() {
//        NonEndangered myAnimal = new NonEndangered("jaguar", "young", "healthy", "nonendangered");
//        myAnimal.save();
//        NonEndangered testAnimals = NonEndangered.all().get(0);
//        assertEquals(myAnimal.getId(), testAnimals.getId());
//    }

    //Test to find Animal with the Same Id
//    @Test
//    public void find_WillReturnAnimalWithTheSame_SecondAnimal() {
//        NonEndangered firstAnimal = new NonEndangered("coyote", "mature", "healthy", "nonendangered");
//        firstAnimal.save();
//        NonEndangered secondAnimal = new NonEndangered("jaguar", "young", "healthy", "nonendangered");
//        secondAnimal.save();
//        assertEquals(Animals.find(secondAnimal.getId()), secondAnimal);
//    }


}
