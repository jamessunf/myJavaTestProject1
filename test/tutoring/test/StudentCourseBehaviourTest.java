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
import tutoring.BusinessObjects.StudentCourseBehaviour;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;
import tutoring.DTO.Student;

/**
 *
 * @author feng
 */
public class StudentCourseBehaviourTest {
    
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
        
      Course c1 = new Course("A001","java level1","java is a java");
  
      Student st = new Student();
      st.addCourse(c1);
           
       ArrayList<SelectCourse> ac = (ArrayList<SelectCourse>) st.getAllCourses();
       int beforeSize = ac.size()+1;
       st.addCourse(c1);
       ac = (ArrayList<SelectCourse>) st.getAllCourses();
       int afterSize = ac.size();

       Assert.assertEquals(beforeSize,afterSize);      
       Assert.assertEquals("Student Behaviour",st.StudentBehaviourType()); 
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
       Assert.assertEquals("Student Behaviour",st.StudentBehaviourType()); 
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
