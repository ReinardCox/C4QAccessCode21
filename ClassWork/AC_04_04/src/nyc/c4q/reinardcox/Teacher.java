package nyc.c4q.reinardcox;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by davis on 4/4/15.
 */
public class Teacher {
    private String name;
    //ArrayList<Student> roster = new ArrayList<Student>();


    private HashMap<String, Teacher> myStudents = new HashMap<String, Teacher>();

    public Teacher(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public void addStudent(Student student){
        myStudents.put(student.getName(), student);

        //this.roster.add(student);
        //FixMe
    }
}
