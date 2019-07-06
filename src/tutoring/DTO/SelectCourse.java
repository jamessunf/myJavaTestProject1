/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: SelectCourse.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.DTO;

/**
 *class to transfer student select courses data between different layer
 * @author feng
 */
public class SelectCourse {
    private int id;
    private String courseId;
    /**
     * This constructor accepts id for the student id or tutor id and cid for the course id
     * @param id
     * @param cid 
     */
    public SelectCourse(int id, String cid){
       
        this.id = id;
        this.courseId = cid;
    
    }
/**
 * This is the default constructor 
 */
    public SelectCourse() {
       this(-1,null);
    }
/**
 * a getter return the id of student or tutor
 * @return student or tutor id
 */
   
    public int getId() {
        return id;
    }
/**
 * a getter return the course id
 * @return course id
 */
    public String getCourseId() {
        return courseId;
    }
/**
 * a setter accepts the student or tutor id
 * @param id the student or tutor id
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * a setter accepts the id of course
 * @param courseId 
 */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    
    
    
    
}
