/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: CourseTest.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.test;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import tutoring.DTO.Course;

/**
 *The test class to test Course class in all public methods
 * @author feng
 */
public class CourseTest {
    /**
     * course test
     */
    public CourseTest() {
    }

    /**
     * Test of getCourseCode method, of class Course.
     */
    @Test
    public void testGetCourseCode() {
        System.out.println("Testing getter of course code");
        Course cs = new Course();
        cs.setCourseCode("001");
        Assert.assertEquals("001",cs.getCourseCode());
        
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("Testing getter of course name");
        Course cs = new Course();
        cs.setCourseName("Java Learning");
        Assert.assertEquals("Java Learning",cs.getCourseName());
    }

    /**
     * Test of getCourseDecription method, of class Course.
     */
    @Test
    public void testGetCourseDecription() {
            System.out.println("Testing getter of course decription");
        Course cs = new Course();
        cs.setCourseDecription("Java Learning is a book");
        Assert.assertEquals("Java Learning is a book",cs.getCourseDecription());   
    }

    /**
     * Test of setCourseCode method, of class Course.
     */
    @Test
    public void testSetCourseCode() {
         System.out.println("Testing setter of course code");
        Course cs = new Course();
        cs.setCourseCode("001");
        Assert.assertEquals("001",cs.getCourseCode());
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseName() {
         System.out.println("Testing setter of course name");
        Course cs = new Course();
        cs.setCourseName("Java Learning");
        Assert.assertEquals("Java Learning",cs.getCourseName());
    }

    /**
     * Test of setCourseDecription method, of class Course.
     */
    @Test
    public void testSetCourseDecription() {
            System.out.println("Testing setter of course decription");
        Course cs = new Course();
        cs.setCourseDecription("Java Learning is a book");
        Assert.assertEquals("Java Learning is a book",cs.getCourseDecription());  
    }
    
}
