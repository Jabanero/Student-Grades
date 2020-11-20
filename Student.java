public class Student {
    
    private String lastName;
    private String firstName;
    private int id;
    private double numGrade;
    private String letterGrade;
    public Student(String lastName, String firstName, int id, double numGrade, String letterGrade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.numGrade = numGrade;
        this.letterGrade = letterGrade;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }
    public double getNumGrade() {
        return numGrade;
    }
}