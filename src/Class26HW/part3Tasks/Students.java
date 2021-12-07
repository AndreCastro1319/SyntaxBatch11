package Class26HW.part3Tasks;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Students {
    //Create a Set collection that will hold Objects of Student Type.
    // In this set we do not care about the insertion order.
    // Each student object should have name and studentID.
    // Display name of each student.

    String name;
    String studentID;
    Students(String name, String studentID){
        this.name=name;
        this.studentID=studentID;
    }
    void printInfo(){
        System.out.println(name+" "+studentID);
    }

    public static void main(String[] args) {
        Set<Students> students=new HashSet<>();
        students.add(new Students("Jimmy","10000"));
        students.add(new Students("Sebastian","100001"));
        students.add(new Students("Irina","100002"));
        students.add(new Students("Marina","100003"));

        for(Students students1:students){
            students1.printInfo();
        }
    }
    }

