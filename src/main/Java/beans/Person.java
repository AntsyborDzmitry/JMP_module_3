package beans;

public class Person extends AbstractPerson{

    private String gender ;

    public Person(String name, String age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
