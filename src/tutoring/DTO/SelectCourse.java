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
public class SelectCourse {
    private int id;
    private String courseId;
    
    public SelectCourse(int id, String cid){
       
        this.id = id;
        this.courseId = cid;
    
    }

    public SelectCourse() {
       this(-1,null);
    }

   
    public int getId() {
        return id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    
    
    
    
}
