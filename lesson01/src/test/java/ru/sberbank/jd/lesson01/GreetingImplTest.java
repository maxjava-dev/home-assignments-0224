package ru.sberbank.jd.lesson01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GreetingImplTest {

    private Greeting sut;

    @Before
    public void setUp() {
        sut = new GreetingImpl();
    }

    @Test
    public void getFirstName() {
        assertEquals("Максим", sut.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Бойченко", sut.getLastName());
    }

    @Test
    public void getBirthYear() {
        assertEquals(1991, sut.getBirthYear());
    }

    @Test
    public void getHobbies() {
        assertArrayEquals(new String[]{"Стримы на твиче"}, sut.getHobbies().toArray());
    }

    @Test
    public void getRepoUrl() {
        assertEquals("https://github.com/maxjava-dev/home-assignments-0224", sut.getRepoUrl());
    }

    @Test
    public void getPhone() {
        assertEquals("89500269827", sut.getPhone());
    }

    @Test
    public void getCourseExpectations() {
        assertArrayEquals(
            new String[]{"Узнать новое по java и Spring", "Расширить контакты по java"},
            sut.getCourseExpectations().toArray()
        );
    }
}