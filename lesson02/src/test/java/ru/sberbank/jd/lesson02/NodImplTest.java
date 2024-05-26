package ru.sberbank.jd.lesson02;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class NodImplTest {

    private Nod sut;

    @Before
    public void setUp() {
        sut = new NodImpl();
    }

    @Test
    public void bothNumbersAreZero() {
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> sut.calculate(0, 0)
        );
        assertEquals("Оба числа равны нулю, НОД не определен", thrown.getMessage());
    }

    @Test
    public void firstNumberIsZero() {
        int second = getRandomNumber();
        assertEquals(second, sut.calculate(0, second));
    }

    @Test
    public void secondNumberIsZero() {
        int first = getRandomNumber();
        assertEquals(first, sut.calculate(first, 0));
    }

    @Test
    public void firstNumberIsOne() {
        int first = 1;
        int second = getRandomNumber();
        assertEquals(first, sut.calculate(first, second));
    }

    @Test
    public void secondNumberIsOne() {
        int first = getRandomNumber();
        int second = 1;
        assertEquals(second, sut.calculate(first, second));
    }

    @Test
    public void firstIs3AndSecondIs6() {
        int first = 3;
        int second = 6;
        assertEquals(3, sut.calculate(first, second));
    }

    @Test
    public void firstIs12AndSecondIs8() {
        int first = 12;
        int second = 8;
        assertEquals(4, sut.calculate(first, second));
    }

    @Test
    public void firstIsMinus12AndSecondIs8() {
        int first = -12;
        int second = 8;
        assertEquals(4, sut.calculate(first, second));
    }

    /**
     * Получение слуйчаного числа от 1 до Integer.MAX_VALUE
     */
    private int getRandomNumber() {
        Random random = new Random();

        // Генерируем случайное число от 0 до Integer.MAX_VALUE - 1
        int randomNumber = random.nextInt(Integer.MAX_VALUE);

        // Добавляем 1 к результату, чтобы получить число от 1 до Integer.MAX_VALUE
        randomNumber++;

        return randomNumber;
    }
}