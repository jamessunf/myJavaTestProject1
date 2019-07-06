/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: TutorCourseBehaviour.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.BusinessObjects;

import java.util.ArrayList;
import java.util.List;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;

/**
 *class to deal with tutor course 
 * @author feng
 */
public class TutorCourseBehaviour implements StudentBehaviour{

     ArrayList<SelectCourse> ls;

   TutorCourseBehaviour(){
   
         ls = new ArrayList();
   
   }
   
   private static TutorCourseBehaviour t = new TutorCourseBehaviour();
   /**
    * the singleton structure for return only instance
    * @return only instance of the TutorCourseBehaviour class
    */
   public static TutorCourseBehaviour getInstance(){
   
       return t;
   }
     
     /**
      * Add a course for the tutor
      * @param selectcourse the object contains the course and tutor id
      * 
      */
    
    @Override
    public void addCourse(SelectCourse selectcourse) {
        
         
            ls.add(selectcourse);
    }
/**
 * Delete a course for the tutor
 * @param seletcourse the object contains the course and tutor id
 */

    @Override
    public void deleteCourse(SelectCourse seletcourse) {
        ls.remove(seletcourse);
    }
/**
 * Update a course for the tutor
 * @param seletcourse the object contains the course and tutor id
 */
    @Override
    public void updateCourse(SelectCourse seletcourse) {
        
    }
/**
 * Get a list of all courses of select of tutor
 * @return List the object contains the course and tutor id
 */
    @Override
    public List<SelectCourse> getAllCourses() {
        return ls;
    }
/**
 * Get a list of all courses of the tutor added
 * @param id tutor id
 * @return List of all courses of the tutor
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
 */
    @Override
    public String StudentBehaviourType() {
        return "Tutor Behaviour";
    }

   
    
}
