package assignment_19_09_2025;

class Student {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class Getter_Setter_methods {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ravi");
        System.out.println("Student Name: " + s.getName());
    }
}
