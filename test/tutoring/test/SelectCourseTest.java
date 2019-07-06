/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: SelectCourseTest.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.test;


import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import tutoring.DTO.SelectCourse;

/**
 *The test class to test SelectCourse class in all public methods
 * @author feng
 */
public class SelectCourseTest {
    /**
     * Test to SelectCourse class
     */
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
