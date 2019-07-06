


import java.util.ArrayList;
import tutoring.BusinessObjects.MemberBuilder;
import tutoring.BusinessObjects.StudentCourseBehaviour;
import tutoring.BusinessObjects.TutorCourseBehaviour;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;
import tutoring.DTO.Student;
import tutoring.DTO.Tutor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feng
 */
public class MyTest {
    /**
     * main test
     * @param args 
     */
    public static void main(String[] args){
        ArrayList<SelectCourse> a;
         Course c1 = new Course("A001","java course level 1","This is the java course level 1");
         Course c2 = new Course("A002","database","This is the database");
         Course c3 = new Course("A003","Linux","This is the linux");
         Course c4 = new Course("A004","C# level 2","This is the C# level 2");
         Course c5 = new Course("A005","Windows","This is the windows 1");
         
         
         
       Student s1 = MemberBuilder.create()
                .studentID(16).lastName("Tom").firstName("John").email("tom@email.com").phoneNumber("613-995477").build();
        
       Tutor t1 = MemberBuilder.create()
                .studentID(17).lastName("James").firstName("mark").email("james@email.com").phoneNumber("613-457923")
                .tutorID(205).status("Strong").experineceID(90).build();
        
         System.out.println("A new student Tom: " + s1.StudentBehaviourType());
         System.out.println("Tom add one student courses:");
         s1.addCourse(c2);
         
         
         System.out.println("A new student/tutor James in student: " + t1.StudentBehaviourType());  
         System.out.println("James add 3 student courses:");       
         t1.addCourse(c1);       
         t1.addCourse(c4);
         t1.addCourse(c5);
         
         System.out.println("Tom add two student courses:");
         s1.addCourse(c1);
         s1.addCourse(c5);
          
         a = (ArrayList) s1.getSelectCourseById();
         for(SelectCourse se:a)       
         System.out.println(se.getId() +"," + se.getCourseId());
         
        
         System.out.println("James add more student courses:");
         t1.addCourse(c3);
         
         a = (ArrayList) t1.getSelectCourseById();
         for(SelectCourse se:a)       
         System.out.println(se.getId() +"," + se.getCourseId());
         
         
         t1.changeBehaviourTo(TutorCourseBehaviour.getInstance());
         System.out.println("James in tutor: " + t1.StudentBehaviourType());
         System.out.println("James add 2 tutor courses:");
         t1.addTCourse(c2);
         t1.addTCourse(c3);
         t1.deleteTCourse(c2);
         
          a = (ArrayList) t1.getTSelectCourseById();
         for(SelectCourse se:a)
         System.out.println(se.getId() +"," + se.getCourseId());
         
          t1.changeBehaviourTo(StudentCourseBehaviour.getInstance());
         System.out.println("James in Student: " + t1.StudentBehaviourType());
         System.out.println("James add more tutor courses:");
         t1.addCourse(c5);
        
          System.out.println("All students select courses:");
          a = (ArrayList) StudentCourseBehaviour.getInstance().getAllCourses();
         for(SelectCourse se:a)
         System.out.println(se.getId() +"," + se.getCourseId());
         
           System.out.println("All tutors select courses:");
          a = (ArrayList) TutorCourseBehaviour.getInstance().getAllCourses();
         for(SelectCourse se:a)
         System.out.println(se.getId() +"," + se.getCourseId());
        
        

    
    }
    
}
