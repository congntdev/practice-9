package Practice9.Lambda1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<>() {
            {
                add(new Person("Sarah", 8));
                add(new Person("James", 10));
                add(new Person("Jessica", 14));
                add(new Person("Jay", 15));
                add(new Person("Laura", 7));
            }
        };
        System.out.println("Person's list: ");
        System.out.println(personList);

        EditPerson editPerson = (index, person, name, age) -> {
            person.get(index).setName(name);
            person.get(index).setAge(age);
        };
        editPerson.edit(3, personList, "Maya", 12);
        System.out.println("Person's list after edit: ");
        System.out.println(personList);

        DeletePerson deletePerson = (index, person) -> {
            person.remove(index);
        };
        deletePerson.delete(2, personList);
        System.out.println("Person's list after delete: ");
        System.out.println(personList);
    }
}
