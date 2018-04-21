package com.hendisantika.loadingdata;

import com.hendisantika.loadingdata.domain.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoadingDataApplicationTests {

    @Test
    public void contextLoads() {
    }

    @PersistenceContext
    private EntityManager em;

    @Test
    public void testSelectFromPerson() {

        List<Person> personList = em.createQuery("select c from Person c", Person.class).getResultList();
        Assert.assertTrue(personList.size() == 2);

        Person p = personList.get(0);

        Assert.assertTrue(p.getFirstName().equals("James"));
        Assert.assertTrue(p.getLastName().equals("Dean"));

        p = personList.get(1);

        Assert.assertTrue(p.getFirstName().equals("Marlon"));
        Assert.assertTrue(p.getLastName().equals("Brando"));

    }
}
