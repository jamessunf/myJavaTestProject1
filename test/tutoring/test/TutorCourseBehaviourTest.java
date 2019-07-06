/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: TutorCourseBehaviourTest.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.test;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import tutoring.BusinessObjects.MemberBuilder;
import tutoring.BusinessObjects.TutorCourseBehaviour;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;
import tutoring.DTO.Student;
import tutoring.DTO.Tutor;

/**
 *The test class to test TutorCourseBehaviour class in all public methods 
 * @author feng
 */
public class TutorCourseBehaviourTest {
    
    /**
     * Test to TutorCourseBehaviour class
     */
    public TutorCourseBehaviourTest() {
        
      
    }

    /**
     * Test of getInstance method, of class TutorCourseBehaviour.
     */
    @Test
    public void testGetInstance() {
             System.out.println("Testing Tutor Singleton object");
        
       TutorCourseBehaviour tu = TutorCourseBehaviour.getInstance();      
      Assert.assertEquals("Tutor Behaviour",tu.StudentBehaviourType());
    }

    /**
     * Test of addCourse method, of class TutorCourseBehaviour.
     */
    @Test
    public void testAddCourse() {
        System.out.println("Testing tutor add courses to the list");
        
      ArrayList<SelectCourse> a = new ArrayList<>();
         Course c1 = new Course("A001","java course level 1","This is the java course level 1");
          Tutor t1 = MemberBuilder.create()
                .studentID(2).lastName("james").firstName("mark").email("james@email.com").phoneNumber("613-457923")
                .tutorID(50).status("Strong").experineceID(90).build();
           
          
            t1.changeBehaviourTo(TutorCourseBehaviour.getInstance());
            t1.addTCourse(c1);
            a = (ArrayList) t1.getTSelectCourseById();
            
            
                 Assert.assertEquals(t1.getTutorID(),a.get(0).getId());
                 Assert.assertEquals("A001",a.get(0).getCourseId());
    }

    /**
     * Test of deleteCourse method, of class TutorCourseBehaviour.
     */
    @Test
    public void testDeleteCourse() {
    }

    /**
     * Test of updateCourse method, of class TutorCourseBehaviour.
     */
    @Test
    public void testUpdateCourse() {
    }

    /**
     * Test of getAllCourses method, of class TutorCourseBehaviour.
     */
    @Test
    public void testGetAllCourses() {
              
        
      
    }

    /**
     * Test of getSelectCourseById method, of class TutorCourseBehaviour.
     */
    @Test
    public void testGetSelectCourseById() {
    }

    /**
     * Test of StudentBehaviourType method, of class TutorCourseBehaviour.
     */
    @Test
    public void testStudentBehaviourType() {
          System.out.println("Testing deletage type of tutor");
       
      Tutor st = new Tutor();
      
      st.changeBehaviourTo(TutorCourseBehaviour.getInstance());
      Assert.assertEquals("Tutor Behaviour",st.StudentBehaviourType());
    }
    
}
