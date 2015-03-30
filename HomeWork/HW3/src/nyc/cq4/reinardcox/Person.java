package nyc.c4q.reinardcox;

/**
 * Created by shadowslimmedia on 3/26/15.
 */
public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean checkSameCity(Person nameA, Person nameB) {

        return (nameA.getCity().equalsIgnoreCase(nameB.getCity()));
    }

    public Person registerChild(Person parent, String childName) {

        Person child = new Person(childName);
        child.setCity(parent.getCity());
        child.setPhoneNumber(parent.getPhoneNumber());

        return child;
    }
}