import java.util.ArrayList;
import java.util.List;

public class Student {

    List<Student> students = new ArrayList();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(){
        Student student = new Student();
        student.setName("김철수");
        students.add(student);
    }

}
