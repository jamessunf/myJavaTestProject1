/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: MemberBuilderTest.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.test;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import tutoring.BusinessObjects.MemberBuilder;
import tutoring.DTO.Student;
import tutoring.DTO.Tutor;

/**
 *The test class to test MemberBuilder class in all public methods
 * @author feng
 */
public class MemberBuilderTest {
    /**
     * Test to MemberBuilder class
     */
    public MemberBuilderTest() {
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
     * Test of create method, of class MemberBuilder.
     */
    @Test
    public void testCreate() {
         Student s1 = MemberBuilder.create()
                .studentID(16).lastName("Tom").firstName("John").email("tom@email.com").phoneNumber("613-995477").build();
         Assert.assertEquals("Tom",s1.getLastName());
    }

    /**
     * Test of studentID method, of class MemberBuilder.
     */
    @Test
    public void testStudentID() {
        Student s1 = MemberBuilder.create()
                .studentID(16).lastName("Tom").firstName("John").email("tom@email.com").phoneNumber("613-995477").build();
         Assert.assertEquals(16,s1.getStudentID());
    }

    /**
     * Test of firstName method, of class MemberBuilder.
     */
    @Test
    public void testFirstName() {
        Student s1 = MemberBuilder.create()
                .studentID(16).lastName("Tom").firstName("John").email("tom@email.com").phoneNumber("613-995477").build();
         Assert.assertEquals("John",s1.getFirstName());
    }

    /**
     * Test of lastName method, of class MemberBuilder.
     */
    @Test
    public void testLastName() {
        Student s1 = MemberBuilder.create()
                .studentID(16).lastName("Tom").firstName("John").email("tom@email.com").phoneNumber("613-995477").build();
         Assert.assertEquals("Tom",s1.getLastName());
    }

    /**
     * Test of phoneNumber method, of class MemberBuilder.
     */
    @Test
    public void testPhoneNumber() {
        Student s1 = MemberBuilder.create()
                .studentID(16).lastName("Tom").firstName("John").email("tom@email.com").phoneNumber("613-995477").build();
         Assert.assertEquals("613-995477",s1.getPhoneNumber());
    }

    /**
     * Test of email method, of class MemberBuilder.
     */
    @Test
    public void testEmail() {
         Student s1 = MemberBuilder.create()
                .studentID(16).lastName("Tom").firstName("John").email("tom@email.com").phoneNumber("613-995477").build();
         Assert.assertEquals("tom@email.com",s1.getEmail());
    }

    /**
     * Test of tutorID method, of class MemberBuilder.
     */
    @Test
    public void testTutorID() {
         Tutor t1 = MemberBuilder.create()
                .studentID(17).lastName("James").firstName("mark").email("james@email.com").phoneNumber("613-457923")
                .tutorID(205).status("Strong").experineceID(90).build();
         Assert.assertEquals(205,t1.getTutorID());
    }

    /**
     * Test of status method, of class MemberBuilder.
     */
    @Test
    public void testStatus() {
         Tutor t1 = MemberBuilder.create()
                .studentID(17).lastName("James").firstName("mark").email("james@email.com").phoneNumber("613-457923")
                .tutorID(205).status("Strong").experineceID(90).build();
         Assert.assertEquals("Strong",t1.getStatus());
    }

    /**
     * Test of experineceID method, of class MemberBuilder.
     */
    @Test
    public void testExperineceID() {
         Tutor t1 = MemberBuilder.create()
                .studentID(17).lastName("James").firstName("mark").email("james@email.com").phoneNumber("613-457923")
                .tutorID(205).status("Strong").experineceID(90).build();
         Assert.assertEquals(90,t1.getExperineceID());
    }

    /**
     * Test of build method, of class MemberBuilder.
     */
    @Test
    public void testBuild() {
        Student s1 = MemberBuilder.create()
                .studentID(16).lastName("Tom").firstName("John").email("tom@email.com").phoneNumber("613-995477").build();
         Assert.assertEquals("Tom",s1.getLastName());
    }
    
}
