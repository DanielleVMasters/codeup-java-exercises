import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("Hunter");
        people[1] = new Person("Kit");
        people[2] = new Person("Jonsey");
        for (Person person : people) {
            System.out.println(person.getName());
        }
        Person Dax = new Person("Dax");
        people = addPerson(people, Dax);
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
