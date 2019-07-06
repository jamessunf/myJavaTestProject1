/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: TutorTest.java 
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
 *The test class to test Tutor class in all public methods 
 * @author feng
 */
public class TutorTest {
    
    /**
     * Test to Tutor class
     */
    public TutorTest() {
        
        
    }

    /**
     * Test of getTutorID method, of class Tutor.
     */
    @Test
    public void testGetTutorID() {
        
        System.out.println("Testing getter of Tutor ID");
        Tutor tutor = new Tutor(1);
        Assert.assertEquals(1,tutor.getTutorID());
        
    }

    /**
     * Test of getStatus method, of class Tutor.
     */
    @Test
    public void testGetStatus() {
        
        System.out.println("Testing getter of Tutor status");
        String str = "current status is good.";
        Tutor tutor = new Tutor(1,str);
        //tutor.setStatus(str);
        Assert.assertEquals(str,tutor.getStatus());
    }

    /**
     * Test of getExperineceID method, of class Tutor.
     */
    @Test
    public void testGetExperineceID() {
        System.out.println("Testing getter of ID of Tutor experinece ");
        
        Tutor tutor = new Tutor(0,null,1);
        //tutor.setStatus(str);
        Assert.assertEquals(1,tutor.getExperineceID());
    }

    
    
    /**
     * Test of setTutorID method, of class Tutor.
     */
    @Test
    public void testSetTutorID() {
        System.out.println("Testing setter of Tutor ID");
        Tutor tutor = new Tutor();
        tutor.setTutorID(2);
        Assert.assertEquals(2,tutor.getTutorID());
    }

    /**
     * Test of setStatus method, of class Tutor.
     */
    @Test
    public void testSetStatus() {
        System.out.println("Testing setter of Tutor status");
        String str = "current status is good.";
        Tutor tutor = new Tutor();
        tutor.setStatus(str);
        Assert.assertEquals(str,tutor.getStatus());
    }

    /**
     * Test of setExperineceID method, of class Tutor.
     */
    @Test
    public void testSetExperineceID() {
        System.out.println("Testing setter of Id of Tutor experinece");
        
        Tutor tutor = new Tutor();
        tutor.setExperineceID(2);
        Assert.assertEquals(2,tutor.getExperineceID());
    }

    /**
     * Test of addCourse method, of class Tutor.
     */
    @Test
    public void testAddCourse() {
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
     * Test of deleteCourse method, of class Tutor.
     */
    @Test
    public void testDeleteCourse() {
        
         
    }

    /**
     * Test of getSelectCourseById method, of class Tutor.
     */
    @Test
    public void testGetSelectCourseById() {
           ArrayList<SelectCourse> a = new ArrayList<>();
         Course c1 = new Course("A001","java course level 1","This is the java course level 1");
          Tutor t1 = MemberBuilder.create()
                .studentID(2).lastName("james").firstName("mark").email("james@email.com").phoneNumber("613-457923")
                .tutorID(50).status("Strong").experineceID(90).build();
           
          
            t1.changeBehaviourTo(TutorCourseBehaviour.getInstance());
            t1.addTCourse(c1);
            a = (ArrayList) t1.getTSelectCourseById();
                      
                 Assert.assertEquals(1,a.size());
                 t1.deleteTCourse(c1);
                 Assert.assertEquals(0,a.size());
            
        
    }
    
    /**
     * Test of changeBehaviourTo method, of class Student.
     */
    @Test
    public void testChangeBehaviourTo() {
        
       System.out.println("Testing type of student and conversion");
       Tutor st = new Tutor();
       Assert.assertEquals("Student Behaviour",st.StudentBehaviourType()); 
       st.changeBehaviourTo(TutorCourseBehaviour.getInstance());
      
      Assert.assertEquals("Tutor Behaviour",st.StudentBehaviourType());
    }
    

}
