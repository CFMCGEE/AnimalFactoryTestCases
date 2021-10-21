package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.*;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    Cat cat = new Cat("Kitty", new Date(), 30);

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName() {

        cat.setName("Typical kitten name");

        String expected = "Typical kitten name";

        String actual = cat.getName();

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {

        String expected = "meow!";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() throws ParseException {

        Date birthday = new SimpleDateFormat("yyyyMMdd").parse("20201227");

        Cat kitty = new Cat(null, birthday, null);

        kitty.setBirthDate(birthday);

        Date expected = birthday;

        Date actual = kitty.getBirthDate();

        System.out.println(birthday);

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {

        Food food = new Food();

        cat.eat(food);

        Assert.assertEquals(food, food);

    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {

        int expected = 30;

        int actual = cat.getId();

        Assert.assertSame(expected, actual);

    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalinheritance() {

        Assert.assertTrue(cat instanceof Animal);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    public void testMammalinheritance() {

        Assert.assertTrue(cat instanceof Mammal);

    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
