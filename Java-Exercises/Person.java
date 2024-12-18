public class Person {
    private String name;
    private int age;
    private String gender;

    void setName(String name) {
        this.name=name;
    }

    void setAge(int age) {
        this.age=age;
    }

    void setGender(String gender) {
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }


    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        person.setGender("Male");
        person.setName("John");
        person.displayInfo();
    }
}
