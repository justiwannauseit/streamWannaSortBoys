package ru.tinkoff.fintech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    public static void main(final String[] args) {

        final ArrayList<Boy> boys = new ArrayList<>() {{
            add(new Boy("Николай", 68));
            add(new Boy("Пётр", 53));
            add(new Boy("Василий", 25));
            add(new Boy("Михаил", 19));
            add(new Boy("Алексей", 6));
            add(new Boy("Николай", 86));
            add(new Boy("Пётр", 35));
            add(new Boy("Михаил", 111));
            add(new Boy("Алексей", 22));
            add(new Boy("Михаил", 1));
            add(new Boy("Яков", 30));
        }};

        final int ageOfMajority = 18;
        final int limitBoys = 4;
        List<String> list = boys.stream()
                .filter(x -> (x.getAge() >= ageOfMajority)) //оставить совершеннолетних
                .map(Boy::getName) //оставляем имена
                .distinct() // убрать дубли
                .sorted() //сортировка по алфавиту
                .limit(limitBoys) //оставить 4х парней
                .collect(Collectors.toList());

        Map<String, Integer> map = new HashMap<>();
        for (String t : list) {
            int count = Collections.frequency(boys.stream().map(Boy::getName).collect(Collectors.toList()), t) - 1;
            map.put(t, count);
        }
        System.out.println(map.toString());
    }
}
