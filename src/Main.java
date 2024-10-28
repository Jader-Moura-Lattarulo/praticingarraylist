import br.com.alura.models.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person01 = new Person("Jader", 35);
        Person person02 = new Person("Gabi", 33);
        Person person03 = new Person("Laura", 14);

        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(person01);
        peopleList.add(person02);
        peopleList.add(person03);

        System.out.println(peopleList.size());
        System.out.println(peopleList.get(1));
        System.out.println(peopleList.toString());

//        peopleList.forEach(person -> System.out.println(person));
        peopleList.forEach(System.out::println);
    }
}