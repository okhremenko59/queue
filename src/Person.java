public class Person {
    private String name;
    private String surname;
    private int countTicket;

    public Person(String name, String surname, int countTicket) {
        this.name = name;
        this.surname = surname;
        this.countTicket = countTicket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCountTicket() {
        return countTicket;
    }

    public void setCountTicket(int countTicket) {
        this.countTicket = countTicket;
    }
}
