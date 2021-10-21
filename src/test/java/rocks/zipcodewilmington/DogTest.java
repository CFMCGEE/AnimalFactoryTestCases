package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    Dog dog = new Dog("Doggy", new Date(), 31);

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testReferenceVariable() {

        Dog dog = new Dog("Doggy", new Date(), 31);

        Dog expected = dog;

        Dog actual = dog;

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {

        String expected = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() throws ParseException {

        Date birthday = new SimpleDateFormat("yyyyMMdd").parse("20210117");

        Dog doggy = new Dog(null, birthday, null);

        doggy.setBirthDate(birthday);

        Date expected = birthday;

        Date actual = doggy.getBirthDate();

        System.out.println(birthday);

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {

        Food food = new Food();

        dog.eat(food);

        Assert.assertEquals(food, food);

    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {

        int expected = 31;

        int actual = dog.getId();

        Assert.assertSame(expected, actual);

    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalinheritance() {

        Assert.assertTrue(dog instanceof Animal);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    public void testMammalinheritance() {

        Assert.assertTrue(dog instanceof Mammal);

    }


}
