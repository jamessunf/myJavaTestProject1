/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: Course.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.DTO;

/**
 *class to transfer courses data between different layer
 * @author feng
 */
public class Course {
    
    private String courseCode;
    private String courseName;
    private String courseDecription;
 /**
  * This constructor accepts course code, name and description
  * @param c course code
  * @param n course name
  * @param d course description
  */   
    public Course(String c,String n,String d){
        
        this.courseCode = c;
        this.courseName = n;
        this.courseDecription = d;
    
    }
/**
 * the default constructor
 */
    public Course() {
       this(null,null,null);
    }
/**
 * a getter get back the course code
 * @return course code
 */
    public String getCourseCode() {
        return courseCode;
    }
/**
 * a getter get back the course name
 * @return course name
 */
    public String getCourseName() {
        return courseName;
    }
/**
 * a getter get back the course description
 * @return course description
 */
    public String getCourseDecription() {
        return courseDecription;
    }
/**
 * a setter accepts course code
 * @param courseCode String value accept for setting
 */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
/**
 * a setter accepts course name
 * @param courseName String value accept for setting
 */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
/**
 * a setter accepts course description
 * @param courseDecription String value accept for setting
 */
    public void setCourseDecription(String courseDecription) {
        this.courseDecription = courseDecription;
    }
    
    
    
}
