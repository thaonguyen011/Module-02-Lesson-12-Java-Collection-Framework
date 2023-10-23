import java.sql.SQLOutput;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Student student1 = new Student("Nam", 20, "HN");
       Student student2 = new Student("Hung", 30, "HN");
       Student student3 = new Student("Ha", 22, "HN");


       Map<Integer, Student> studentMap = new HashMap<>();
       studentMap.put(1, student1);
       studentMap.put(2, student2);
       studentMap.put(3, student3);
       studentMap.put(4, student1);


        System.out.println("Student hashmap: " + studentMap);
       for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
           System.out.println(student.toString());
       }

        System.out.println("............Set");
       Set<Student> students = new HashSet<>();
       students.add(student1);
       students.add(student2);
       students.add(student3);
       students.add(student1);

       for (Student student : students) {
           System.out.println(student);
       }


        System.out.println();
        System.out.println("........StudentArrayList");
       List<Student> studentsList = new ArrayList<>();
       studentsList.add(student1);
       studentsList.add(student2);
       studentsList.add(student3);

       int index = 0;
       for (Student student : studentsList) {
           System.out.println("Student " + index + " info: " + student);
           index++;
       }

       index = 0;
       System.out.println();
       AgeComparator ageComparator = new AgeComparator();
       Collections.sort(studentsList, ageComparator);
       System.out.println("Sort by age");
        for (Student student : studentsList) {
            System.out.println("Student " + index + " info: " + student);
            index++;
        }

    }

}