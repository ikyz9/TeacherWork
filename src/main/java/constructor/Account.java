package constructor;

public class Account {

    private String firstName;
    private String lastName;
    private int age;
    private boolean subscribe;

    public Account() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.subscribe = false;
    }

    public Account(String firstName){
        this(firstName, "", 0, false);
    }

    public Account(String firstName, String lastName, int age, boolean subscribe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.subscribe = subscribe;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", subscribe=" + subscribe +
                '}';
    }
}
