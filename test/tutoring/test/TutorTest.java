/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.test;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import tutoring.BusinessObjects.TutorCourseBehaviour;
import tutoring.DTO.Student;
import tutoring.DTO.Tutor;

/**
 *
 * @author feng
 */
public class TutorTest {
    
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
