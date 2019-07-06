/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.test;


import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import tutoring.DTO.SelectCourse;

/**
 *
 * @author feng
 */
public class SelectCourseTest {
    
    public SelectCourseTest() {
    }

    /**
     * Test of getId method, of class SelectCourse.
     */
    @Test
    public void testGetId() {
        
         System.out.println("Testing getter of student course selection ID");
        SelectCourse se = new SelectCourse();
        se.setId(1);
        Assert.assertEquals(1,se.getId());
        
    }

    /**
     * Test of getCourseId method, of class SelectCourse.
     */
    @Test
    public void testGetCourseId() {
        
         System.out.println("Testing getter of student course ID");
        SelectCourse se = new SelectCourse();
        se.setCourseId("001");
        Assert.assertEquals("001",se.getCourseId());
    }

    /**
     * Test of setId method, of class SelectCourse.
     */
    @Test
    public void testSetId() {
         System.out.println("Testing setter of student course selection ID");
         SelectCourse se = new SelectCourse();
        se.setId(1);
        Assert.assertEquals(1,se.getId());
    }

    /**
     * Test of setCourseId method, of class SelectCourse.
     */
    @Test
    public void testSetCourseId() {
        System.out.println("Testing setter of student course ID");
        SelectCourse se = new SelectCourse();
        se.setCourseId("001");
        Assert.assertEquals("001",se.getCourseId());
    }
    
}
