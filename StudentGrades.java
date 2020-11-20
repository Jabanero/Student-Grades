import java.io.*;
import java.util.*;

public class StudentGrades {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<Student>()
        Scanner fileScanner = new Scanner(new File("grades.txt"));
        while (fileScanner.hasNextLine()) {
            Scanner line = new Scanner(fileScanner.nextLine());
            String lastName = line.next();
            String firstName = line.next();
            int id = line.nextInt();
            double numGrade = line.nextDouble();
            String letterGrade = line.next();
            students.add(new Student(lastName, firstName, id, numGrade, letterGrade));
        }
    }
}
class LastNameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getLastName().compareTo(s2.getLastName());
    }

}
class IDComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getId() - s2.getId();
    }
}
class NumGradeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return (int) (s1.getNumGrade() - s2.getNumGrade()) * 10;
    }
}