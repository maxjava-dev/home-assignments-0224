package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.List;

/**
 * Класс для приветсвия студента второго потока по java в 2024 году.
 */
public class GreetingImpl implements Greeting {

    @Override
    public String getFirstName() {
        return "Максим";
    }

    @Override
    public String getLastName() {
        return "Бойченко";
    }

    @Override
    public int getBirthYear() {
        return 1991;
    }

    @Override
    public Collection<String> getHobbies() {
        return List.of("Стримы на твиче");
    }

    @Override
    public String getRepoUrl() {
        return "https://github.com/maxjava-dev/home-assignments-0224";
    }

    @Override
    public String getPhone() {
        return "89500269827";
    }

    @Override
    public Collection<String> getCourseExpectations() {
        return List.of("Узнать новое по java и Spring", "Расширить контакты по java");
    }
}
