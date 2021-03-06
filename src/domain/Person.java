package domain;


public class Person {

    private String firstName;
    private String lastName;
    private String pesel;
    private int age;

    public Person(String firstName, String lastName, String pesel, int age) throws NameUndefinedException, IncorrectAgeException {
        if(firstName == null || lastName==null || firstName.length()<2 || lastName.length()<2){
            throw new NameUndefinedException("Niepoprawne imię lub nazwisko!");
        }
        if (age<1){
            throw new IncorrectAgeException("Zły wiek");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
