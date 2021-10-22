package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    Dog dog = new Dog("Doggy", new Date(), 31);

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAdd() {

        Dog dog = new Dog("Doggy", new Date(), 31);

        DogHouse.add(dog);

        Assert.assertEquals(dog, dog);

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId() {

        Dog dog = new Dog("Doggy", new Date(), 31);

        int expected = 31;

        int actual = dog.getId();

        DogHouse.remove(31);

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemove() {

        Dog doggy = new Dog("Doggy", new Date(), 31);

        DogHouse.remove(doggy);

        int expected = 1;

        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetCatById() {

        Dog dog = new Dog("Doggy", new Date(), 31);

        DogHouse.getDogById(31);

        Dog expected = dog;

        Dog actual = dog;

        Assert.assertEquals(expected, actual);

    }

}
