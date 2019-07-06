/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.test;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import tutoring.BusinessObjects.StudentBehaviour;
import tutoring.BusinessObjects.StudentCourseBehaviour;
import tutoring.BusinessObjects.TutorCourseBehaviour;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;
import tutoring.DTO.Student;


/**
 *
 * @author feng
 */
public class StudentTest {
    
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
      Course c1 = new Course("A001","java level1","java is a java");
  
      Student st = new Student();
      st.addCourse(c1);
           
       ArrayList<SelectCourse> ac = (ArrayList<SelectCourse>) st.getAllCourses();
       int beforeSize = ac.size()+1;
       st.addCourse(c1);
       ac = (ArrayList<SelectCourse>) st.getAllCourses();
       int afterSize = ac.size();

       Assert.assertEquals(beforeSize,afterSize);
    
      
      
    }

    /**
     * Test of deleteCourse method, of class Student.
     */
    @Test
    public void testDeleteCourse() {
    }

    /**
     * Test of getAllCourses method, of class Student.
     */
    @Test
    public void testGetAllCourses() {
        
         System.out.println("Testing get all list");
      Course c1 = new Course("A001","java level1","java is a java");
      Course c2 = new Course("A002","java leve22","java is w java");
      Course c3 = new Course("A003","java leve33","java is f java");
      Course c4 = new Course("A004","java leve44","java is ava");
      Course c5 = new Course("A005","java leve55","javaba");
      
      Student st = new Student();
     
       System.out.println("Testing all lists");    
       ArrayList<SelectCourse> ac = (ArrayList<SelectCourse>) st.getAllCourses();
       int beforeSize = ac.size()+5;
      st.addCourse(c1);
      st.addCourse(c2);
      st.addCourse(c3);
      st.addCourse(c4);
      st.addCourse(c5);
       ac = (ArrayList<SelectCourse>) st.getAllCourses();
       int afterSize = ac.size();

       Assert.assertEquals(beforeSize,afterSize);
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
