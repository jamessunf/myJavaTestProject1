/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.test;

import tutoring.BusinessObjects.StudentBuilder;
import tutoring.DTO.Student;

/**
 *
 * @author feng
 */
public class test {
    
    public static void main(String[] args){
    
  //  Person b = PersonBuilder.create().firstName("FName").lastName("LName").email("ab@c.com").build();
      
     Student a = StudentBuilder.create().studentID(1).firstName("james").lastName("sun").email("james@email.com").phoneNumber("613-3345634").build();
     Student b = StudentBuilder.create().studentID(1).firstName("james").lastName("sun").email("james@email.com")
             .phoneNumber("613-3345634").tutorID(4).experineceID(66).status("good student").build();
     
      System.out.println(b);
    
    }
    
}
