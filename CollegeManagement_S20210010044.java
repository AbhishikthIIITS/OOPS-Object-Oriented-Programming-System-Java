import java.util.*;

class student {
    String s_name;
    String s_id;
    int semester;
}

class teacher {
    String t_name;
    String t_id;
    String course;
}


public class CollegeManagement_S20210010044 {

    public static student addStudent(){
    	student s = new student();
	    return s;
    }

    public static teacher addTeacher(){
    	teacher t = new teacher();
	    return t;
    }

    public static void setDetails(student s) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the name of student");
        s.s_name = i.nextLine();
        System.out.println("Enter the id of student");
        s.s_id = i.nextLine();
        System.out.println("Enter the semester of student");
        s.semester = i.nextInt();
    }
    
    public static void getDetails(student s) {
        System.out.printf("Student name:- %s\nStudent ID:- %s\nStudent semester:- %d\n", s.s_name, s.s_id,s.semester);
    }
    
    public static void setdetails(teacher t) {
        Scanner i1 = new Scanner(System.in);
        System.out.println("Enter the name of teacher");
        t.t_name = i1.nextLine();
        System.out.println("Enter the id of teacher");
        t.t_id = i1.nextLine();
        System.out.println("Enter the course of teacher");
        t.course = i1.nextLine();
    }
    
    public static void getdetails(teacher t) {
        System.out.printf("Teacher name:- %s\nTeacher Id:- %s\nTeacher course:- %s\n", t.t_name,t.t_id,t.course);
    }
    public static void main(String[] args){
        student s1 = addStudent();
        setDetails(s1);
        
        student s2 = addStudent();
        setDetails(s2);
        
        student s3 = addStudent();
        setDetails(s3);
        
        System.out.println("Enter the details of teachers\n");
        
        teacher t1 = addTeacher();
        setdetails(t1);
        
        teacher t2 = addTeacher();
        setdetails(t2);
        
        teacher t3 = addTeacher();
        setdetails(t3);
        
        System.out.println("Details of students");
        getDetails(s1);
        getDetails(s2);
        getDetails(s3);
        System.out.println("Details of teachers");
        getdetails(t1);
        getdetails(t2);
        getdetails(t3);
    }
}
