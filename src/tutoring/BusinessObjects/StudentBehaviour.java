/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: StudentBehaviour.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.BusinessObjects;

import java.util.List;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;

/**
 *A interface define the student behaviors
 * @author feng
 */
public interface StudentBehaviour {
    /**
     * Add a course for the student
     * @param seletcourse Add a course for the student
     */
    public void addCourse(SelectCourse seletcourse);
    /**
 * Delete a course for the student
 * @param seletcourse the object contains the course and student id
 */
    public void deleteCourse(SelectCourse seletcourse);
    /**
 * Update a course for the student
 * @param seletcourse the object contains the course and student id
 */
    public void updateCourse(SelectCourse seletcourse);
    /**
 * Get a list of all courses of select of student
 * @return List the object contains the course and student id
 */
    public List<SelectCourse> getAllCourses();
    /**
 * Get a list of all courses of the student added
 * @param id student id
 * @return List of all courses of the student
 */
    public List<SelectCourse> getSelectCourseById(int id);
    /**
 * Get the student behavior type
 * @return student behavior type
 */
    public String StudentBehaviourType();
   
    
}
