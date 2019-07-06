/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.BusinessObjects;

import java.util.List;
import tutoring.DTO.Course;
import tutoring.DTO.SelectCourse;

/**
 *
 * @author feng
 */
public interface StudentBehaviour {
    
    public void addCourse(SelectCourse seletcourse);
    public void deleteCourse(SelectCourse seletcourse);
    public void updateCourse(SelectCourse seletcourse);
    public List<SelectCourse> getAllCourses();
    public  SelectCourse getSelectCourseById(int id);
    public String StudentBehaviourType();
   
    
    
    
    
}
