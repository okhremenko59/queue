import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            if (person.getCountTicket() > 0) {
                person.setCountTicket(person.getCountTicket() - 1);
                if (person.getCountTicket() > 0) {
                    queue.add(person);
                }
                System.out.println(person.getName() + " " + person.getSurname() + " Прокатился на аттракционе  ");
            }
        }
    }

    private static List<Person> generateClients() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ivan", "Pupkin", 1));
        personList.add(new Person("Oleg", "Vorohin", 2));
        personList.add(new Person("Nikolay", "Glazov", 3));
        personList.add(new Person("Petor", "Petrov", 4));
        personList.add(new Person("Vasiliy", "Nemov", 5));
        return personList;
    }
}

//    private static List<Person> generateClients () {
//        return List.of(
//                new Person("Ivan", "Pupkin", 1),
//                new Person("Oleg", "Vorohin", 3),
//                new Person("Nikola", "Glazov", 5),
//                new Person("Petor", "Petrov", 6),
//                new Person("Oleg", "Nemov", 8)
//        );
//    }