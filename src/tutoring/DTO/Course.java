/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.DTO;

/**
 *
 * @author feng
 */
public class Course {
    
    private String courseCode;
    private String courseName;
    private String courseDecription;
    
    public Course(String c,String n,String d){
        
        this.courseCode = c;
        this.courseName = n;
        this.courseDecription = d;
    
    }

    public Course() {
       this(null,null,null);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDecription() {
        return courseDecription;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDecription(String courseDecription) {
        this.courseDecription = courseDecription;
    }
    
    
    
}
