/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: StudentTest.java 
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
import tutoring.BusinessObjects.StudentBehaviour;
import tutoring.BusinessObjects.StudentCourseBehaviour;
import tutoring.BusinessObjects.TutorCourseBehaviour;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;
import tutoring.DTO.Student;


/**
 *The test class to test Student class in all public methods
 * @author feng
 */
public class StudentTest {
    
    /**
     * Test to Student class
     */
    public StudentTest() {
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        
        System.out.println("Testing getter of Student ID");
        Student st = new Student(1);
        Assert.assertEquals(1,st.getStudentID());
    }

    /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetLastName() {
        System.out.println("Testing getter of Student's last name");
        Student st = new Student();
        st.setLastName("james");
        Assert.assertEquals("james",st.getLastName());
    }

    /**
     * Test of getFirstName method, of class Student.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("Testing getter of Student's first name");
        Student st = new Student();
        st.setFirstName("mark");
        Assert.assertEquals("mark",st.getFirstName());
    }

    /**
     * Test of getEmail method, of class Student.
     */
    @Test
    public void testGetEmail() {
        System.out.println("Testing getter of Student's email");
        Student st = new Student();
        st.setEmail("james@email.com");
        Assert.assertEquals("james@email.com",st.getEmail());
    }

    /**
     * Test of getPhoneNumber method, of class Student.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("Testing getter of Student's phone number");
        Student st = new Student();
        st.setPhoneNumber("613-678945");
        Assert.assertEquals("613-678945",st.getPhoneNumber());
    }

    /**
     * Test of setStudentID method, of class Student.
     */
    @Test
    public void testSetStudentID() {
        System.out.println("Testing setter of Student ID");
        Student st = new Student();
        st.setStudentID(3);
        Assert.assertEquals(3,st.getStudentID());
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetLastName() {
              System.out.println("Testing setter of Student's last name");
        Student st = new Student();
        st.setLastName("james");
        Assert.assertEquals("james",st.getLastName());
    }

    /**
     * Test of setFirstName method, of class Student.
     */
    @Test
    public void testSetFirstName() {
           System.out.println("Testing setter of Student's first name");
        Student st = new Student();
        st.setFirstName("mark");
        Assert.assertEquals("mark",st.getFirstName());
    }

    /**
     * Test of setEmail method, of class Student.
     */
    @Test
    public void testSetEmail() {
          System.out.println("Testing setter of Student's email");
        Student st = new Student();
        st.setEmail("james@email.com");
        Assert.assertEquals("james@email.com",st.getEmail());
    }

    /**
     * Test of setPhoneNumber method, of class Student.
     */
    @Test
    public void testSetPhoneNumber() {
         System.out.println("Testing setter of Student's phone number");
        Student st = new Student();
        st.setPhoneNumber("613-678945");
        Assert.assertEquals("613-678945",st.getPhoneNumber());
    }


    /**
     * Test of addCourse method, of class Student.
     */
    @Test
    public void testAddCourse() {
        
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
     * Test of deleteCourse method, of class Student.
     */
    @Test
    public void testDeleteCourse() {
    }

    

    /**
     * Test of StudentBehaviourType method, of class Student.
     */
    @Test
    public void testStudentBehaviourType() {
        
        System.out.println("Testing type of student");
        Student st = new Student();
      
      Assert.assertEquals("Student Behaviour",st.StudentBehaviourType());
     
    }

    
}
