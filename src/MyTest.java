


import tutoring.BusinessObjects.MemberBuilder;
import tutoring.BusinessObjects.TutorCourseBehaviour;
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
    
    public static void main(String[] args){
        
       Student s1 = MemberBuilder.create()
                .studentID(2).lastName("james").firstName("mark").email("james@email.com").phoneNumber("613-457923").build();
        
       Tutor t1 = MemberBuilder.create()
                .studentID(2).lastName("james").firstName("mark").email("james@email.com").phoneNumber("613-457923")
                .tutorID(50).status("Strong").experineceID(90).build();
        
         System.out.println(s1.StudentBehaviourType());
        
         System.out.println(t1.StudentBehaviourType());
         t1.changeBehaviourTo(TutorCourseBehaviour.getInstance());
         System.out.println(t1.StudentBehaviourType());
         System.out.println(t1.getStudentID());
         
         
         
         
         
        

    
    }
    
}
