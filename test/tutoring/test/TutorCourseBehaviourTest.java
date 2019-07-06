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
import tutoring.BusinessObjects.TutorCourseBehaviour;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;
import tutoring.DTO.Student;
import tutoring.DTO.Tutor;

/**
 *
 * @author feng
 */
public class TutorCourseBehaviourTest {
    
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
        
      Course c1 = new Course("A001","java level1","java is a java");
  
      Tutor st = new Tutor();
      st.changeBehaviourTo(TutorCourseBehaviour.getInstance());
      Assert.assertEquals("Tutor Behaviour",st.StudentBehaviourType());
      st.addCourse(c1);
           
       ArrayList<SelectCourse> ac = (ArrayList<SelectCourse>) st.getAllCourses();
       int beforeSize = ac.size()+1;
       st.addCourse(c1);
       ac = (ArrayList<SelectCourse>) st.getAllCourses();
       int afterSize = ac.size();

       Assert.assertEquals(beforeSize,afterSize);      
      
       
      
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
              
         System.out.println("Testing get all list");
         
          Tutor st = new Tutor();    
      st.changeBehaviourTo(TutorCourseBehaviour.getInstance());
      Assert.assertEquals("Tutor Behaviour",st.StudentBehaviourType());
      
      Course c1 = new Course("A001","java level1","java is a java");
      Course c2 = new Course("A002","java leve22","java is w java");
      Course c3 = new Course("A003","java leve33","java is f java");
      Course c4 = new Course("A004","java leve44","java is ava");
      Course c5 = new Course("A005","java leve55","javaba");
      
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
