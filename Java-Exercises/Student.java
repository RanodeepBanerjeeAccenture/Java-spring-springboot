import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        // Create a list of student names
        List<String> students = new ArrayList<>();
        students.add("Ram Kumar");
        students.add("Mohan Sharma");
        students.add("John Doe");
        students.add("Alice Smith");
        students.add("Bob Johnson");

        // Create a map to store student names and their grades
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Ram Kumar", 78);
        studentGrades.put("Mohan Sharma", 72);
        studentGrades.put("John Doe", 89);
        studentGrades.put("Alice Smith", 89);
        studentGrades.put("Bob Johnson", 72);

        // Sort students based on grade, first name, and last name
        Collections.sort(students, (s1, s2) -> {
            int grade1 = studentGrades.get(s1);
            int grade2 = studentGrades.get(s2);
            if (grade1 != grade2) {
                return Integer.compare(grade1, grade2);
            } else {
                String[] nameParts1 = s1.split(" ");
                String[] nameParts2 = s2.split(" ");
                String firstName1 = nameParts1[0];
                String firstName2 = nameParts2[0];
                String lastName1 = nameParts1[1];
                String lastName2 = nameParts2[1];
                if (!firstName1.equals(firstName2)) {
                    return firstName1.compareTo(firstName2);
                } else {
                    return lastName1.compareTo(lastName2);
                }
            }
        });

        // Print the sorted list of students
        System.out.println("Sorted Students:");
        for (String student : students) {
            System.out.println(student + " (Grade: " + studentGrades.get(student) + ")");
        }


    }
}
