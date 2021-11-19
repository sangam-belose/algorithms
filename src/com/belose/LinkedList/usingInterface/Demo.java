package com.belose.LinkedList.usingInterface;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.insert("Anna");
        list.insert("Sana");
        list.insert("Dominick");

        list.traverse();

        list.remove("Sana");
        list.traverse();
        list.remove("Dominick");
        list.traverse();

        System.out.println(list.size());

        List<Person> personList = new LinkedList<>();
        personList.insert(new Person("Anna", 36));
        personList.insert(new Person("Binaa", 34));
        Person headPerson = new Person("Channa", 38);
        personList.insert(headPerson);

        personList.traverse();
        System.out.println();
        personList.remove(headPerson);
        System.out.println();
        personList.traverse();

    }

}
