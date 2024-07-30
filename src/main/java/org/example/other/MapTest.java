package org.example.other;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MapTest {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);
        Person p4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<>(10);
        people.offer(p3);
        people.offer(p2);
        people.offer(p4);
        people.offer(p1);

        for (Person person : people)
            System.out.println(person);
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
