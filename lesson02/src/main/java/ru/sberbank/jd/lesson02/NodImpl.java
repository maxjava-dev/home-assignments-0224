package ru.sberbank.jd.lesson02;

/**
 * Класс, вычисляющий наибольший общий делитель двух чисел.
 */
public class NodImpl implements Nod {

    @Override
    public int calculate(int first, int second) {
        if (first == 0 && second == 0) {
            throw new IllegalArgumentException("Оба числа равны нулю, НОД не определен");
        }

        // Или first или second не равно нулю

        if (first == 0) {
            return second;
        }

        if (second == 0) {
            return first;
        }

        // Оба числа не равны нулю

        int absFirst = Math.abs(first);
        int absSecond = Math.abs(second);

        if (absFirst == absSecond) {
            return absFirst;
        }

        int minNumber = Math.min(absFirst, absSecond);
        int maxNumber = Math.max(absFirst, absSecond);
        int maxDivider = 1;

        for (int divider = 2; divider <= minNumber; divider++) {
            if (minNumber % divider == 0 && maxNumber % divider == 0) {
                maxDivider = divider;
            }
        }

        return maxDivider;
    }
}
