/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: StudentCourseBehaviour.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.BusinessObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;


/**
 *class to deal with student course
 * @author feng
 */
public class StudentCourseBehaviour implements StudentBehaviour {
    
   private ArrayList<SelectCourse> ls;

   private StudentCourseBehaviour(){
   
         ls = new ArrayList();
   
   }
   
   private static StudentCourseBehaviour s = new StudentCourseBehaviour();
   /**
    * the singleton structure for return only instance
    * @return only instance of the StudentCourseBehaviour class
    */
   public static StudentCourseBehaviour getInstance(){
   
       return s;
   }
   
   /**
      * Add a course for the student
      * @param selectcourse the object contains the course and student id
      * 
      */
  
    @Override
    public void addCourse(SelectCourse selectcourse) {
        
        
	          ls.add(selectcourse);
    }
/**
 * Delete a course for the student
 * @param seletcourse the object contains the course and student id
 */
    @Override
    public void deleteCourse(SelectCourse seletcourse) {
        
        ls.remove(seletcourse);
    }
/**
 * Update a course for the student
 * @param seletcourse the object contains the course and student id
 */
    @Override
    public void updateCourse(SelectCourse seletcourse) {
        
    }
/**
 * Get a list of all courses of select of student
 * @return List the object contains the course and student id
 */
    @Override
    public List<SelectCourse> getAllCourses() {
        return ls;
    }
/**
 * Get a list of all courses of the student added
 * @param id student id
 * @return List of all courses of the student
 */
     @Override
    public List<SelectCourse> getSelectCourseById(int id) {
        
        ArrayList<SelectCourse> ss = new ArrayList<>();
        
        for(SelectCourse se:ls){
            if(se.getId() == id){
                ss.add(se);
            
            }
        
        }
        
        return ss;
    }
/**
 * Get the student behavior type
 * @return student behavior type
 * 
 */
     @Override
    public String StudentBehaviourType() {
        return "Student Behaviour";
    }

   
   
    
    
}
