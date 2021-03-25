package ru.tinkoff.fintech;

public class Boy {
    private String name;
    private int age;

    Boy(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return имя мальчика.
     */
    public String getName() {
        return name;
    }
    /**
     * @return возраст мальчика.
     */
    public int getAge() {
        return age;
    }
    /**
     * @return строку: "имя мальчика - возраст".
     */
    @Override
    public String toString() {
        return name + "-" + age;
    }
}