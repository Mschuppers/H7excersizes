public class Person {

    private int age;
    private String universalRights = "All humans are equal";
    private Name name;
    private Gender gender;
    private static final int maxAge = 131;

    private enum Name {
        UNKOWN
    }

    private enum Gender {
        MALE,
        FEMALE
    }

    //CONSTRUCTORS
    public Person(Name name, int age, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    //SETTERS
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setUniversalRights(String universalRights) {
        this.universalRights = universalRights;
    }
    public void setName(Name name) {
        this.name = name;
    }

    //GETTERS
    public int getAge() {
        return age;
    }
    public Gender getGender() {
        return gender;
    }
    public String getUniversalRights() {
        return universalRights;
    }
    public Name getName() {
        return name;
    }


    //MAIN
    public static void main(String[] args) {


        printPersonDetails();

    }

    private static void printPersonDetails() {
        Person p = new Person(Name.UNKOWN, 45, Gender.MALE);

        while (p.age < maxAge) {
            System.out.println(p.name);
            System.out.println(p.age);
            System.out.println(p.gender);
            System.out.println(p.universalRights);
            p.haveBirthday();
        }
    }


    public void haveBirthday() {
        getAge();
        this.age = age+1;
        if (this.age == maxAge || this.age > maxAge) {
            System.out.println("PersonDiedException");
        } else {
            System.out.println("This person got older, " + this.age + " years to be exact");
        }
    }

}






