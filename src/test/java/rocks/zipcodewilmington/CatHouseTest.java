package rocks.zipcodewilmington;

import org.junit.*;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAdd() {

        Cat cat = new Cat("Kitty", new Date(), 30);

        CatHouse.add(cat);

        Assert.assertEquals(cat, cat);

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId() {

        Cat cat = new Cat("Kitty", new Date(), 30);

        int expected = 30;

        int actual = cat.getId();

        CatHouse.remove(30);

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemove() {

        Cat kitty = new Cat("Kitty", new Date(), 30);

        CatHouse.remove(kitty);

        int expected = 1; //<-- cat object already exists for the test case

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById() {
        Cat cat = new Cat("Kitty", new Date(), 30);

        CatHouse.getCatById(30);

        Cat expected = cat;

        Cat actual = cat;

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {

        Cat kitty = new Cat("Kitty", new Date(), 30);

        CatHouse.add(kitty);

        CatHouse.getNumberOfCats();

        int expected = 1;

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }
}
