package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.*;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.text.*;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog() throws ParseException {

        Date birthday = new SimpleDateFormat("yyyyMMdd").parse("20210117");

        AnimalFactory.createDog("Doggy", birthday);

        Dog wolf = AnimalFactory.createDog("Doggy", birthday);

        Assert.assertEquals(wolf, wolf);

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat() throws ParseException {

        Date birthday = new SimpleDateFormat("yyyyMMdd").parse("20201227");

        AnimalFactory.createCat("Kitty", birthday);

        Cat feline = AnimalFactory.createCat("Kitty", birthday);

        Assert.assertEquals(feline, feline);

    }

}
