/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: StudentCourseBehaviour.java 
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
import tutoring.BusinessObjects.StudentCourseBehaviour;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;
import tutoring.DTO.Student;

/**
 *The test class to test StudentCourseBehaviour class in all public methods
 * @author feng
 */
public class StudentCourseBehaviourTest {
    /**
     * Test to StudentCourseBehaviour class
     */
    public StudentCourseBehaviourTest() {
    }

    /**
     * Test of getInstance method, of class StudentCourseBehaviour.
     */
    @Test
    public void testGetInstance() {
            System.out.println("Testing student Singleton object");
        
       StudentCourseBehaviour st = StudentCourseBehaviour.getInstance();      
      Assert.assertEquals("Student Behaviour",st.StudentBehaviourType());
    }

    /**
     * Test of addCourse method, of class StudentCourseBehaviour.
     */
    @Test
    public void testAddCourse() {
          System.out.println("Testing student add courses to the list");
        
       
      System.out.println("Testing add courses to the student");
         ArrayList<SelectCourse> a = new ArrayList<>();
         Course c1 = new Course("A001","java course level 1","This is the java course level 1");
          Student s1 = MemberBuilder.create()
                .studentID(16).lastName("Tom").firstName("John").email("tom@email.com").phoneNumber("613-995477").build();
           
          
            
            s1.addCourse(c1);
            a = (ArrayList) s1.getSelectCourseById();
            
            
                 Assert.assertEquals(s1.getStudentID(),a.get(0).getId());
                 Assert.assertEquals("A001",a.get(0).getCourseId());
    }

    /**
     * Test of deleteCourse method, of class StudentCourseBehaviour.
     */
    @Test
    public void testDeleteCourse() {
    }

    /**
     * Test of updateCourse method, of class StudentCourseBehaviour.
     */
    @Test
    public void testUpdateCourse() {
    }

    /**
     * Test of getAllCourses method, of class StudentCourseBehaviour.
     */
    @Test
    public void testGetAllCourses() {
                
        
    }

    /**
     * Test of getSelectCourseById method, of class StudentCourseBehaviour.
     */
    @Test
    public void testGetSelectCourseById() {
    }

    /**
     * Test of StudentBehaviourType method, of class StudentCourseBehaviour.
     */
    @Test
    public void testStudentBehaviourType() {
            System.out.println("Testing deletage type of student");
        Student st = new Student();
      
      Assert.assertEquals("Student Behaviour",st.StudentBehaviourType());
    }
    
}
