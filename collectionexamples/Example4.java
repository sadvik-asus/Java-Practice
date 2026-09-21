package collectionexamples;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private int id;
    private String branch;

    public Student(String name, int id, String branch) {
        this.name = name;
        this.id = id;
        this.branch = branch;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", branch='" + branch + '\'' +
                '}';
    }
}
public class Example4 {
    public static void main(String[] args){
        List<Student> StudentList = new ArrayList<>();
        Student s1 = new Student("sadvik",6601,"CSM");
        Student s2 = new Student("Spiderman",6767,"NewYork");
        StudentList.add(s1);
        StudentList.add(s2);
        System.out.println(StudentList);
    }
}
