/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.BusinessObjects;

import java.util.ArrayList;
import java.util.List;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;

/**
 *
 * @author feng
 */
public class TutorCourseBehaviour implements StudentBehaviour{

     ArrayList ls;

   TutorCourseBehaviour(){
   
         ls = new ArrayList();
   
   }
   
   private static TutorCourseBehaviour t = new TutorCourseBehaviour();
   
   public static TutorCourseBehaviour getInstance(){
   
       return t;
   }
     
     
    
    @Override
    public void addCourse(SelectCourse selectcourse) {
        
	ls.add(selectcourse);
    }


    @Override
    public void deleteCourse(SelectCourse seletcourse) {
        ls.remove(seletcourse);
    }

    @Override
    public void updateCourse(SelectCourse seletcourse) {
        
    }

    @Override
    public List<SelectCourse> getAllCourses() {
        return ls;
    }

    @Override
    public SelectCourse getSelectCourseById(String id) {
        
        return null;
    }

    @Override
    public String StudentBehaviourType() {
        return "Tutor Behaviour";
    }

   
    
}
