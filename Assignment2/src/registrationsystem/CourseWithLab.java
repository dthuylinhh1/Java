/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationsystem;

/**
 *
 * @author Linh
 */
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.DayOfWeek;

/**
 * CourseWithLab is a sub-class
 * Course is a super class
 * @author Linh
 */
public class CourseWithLab extends Course {
    private Instructor labTech;
    private String labClassRoom;
    private DayOfWeek labDay;
    private LocalTime labTime;
    
    
    /**
     * Constructor without prerequisiteSubject
     * @param instructor
     * @param courseNumber
     * @param courseName
     * @param classroom
     * @param classDay
     * @param classTime
     * @param classSize
     * @param labTech
     * @param labClassRoom
     * @param labDay
     * @param labTime 
     */
    public CourseWithLab(Instructor instructor, String courseNumber, String courseName, String classroom,
            DayOfWeek classDay, LocalTime classTime, int classSize, Instructor labTech, 
            String labClassRoom, DayOfWeek labDay, LocalTime labTime){
        super(instructor, courseNumber, courseName, classroom, classDay, classTime, classSize);
        //Check if lab instructor is able to host the lab or not
        if(labTech.canTeach(courseNumber)==false){
            throw new IllegalArgumentException("The Lab Tech is not qualified to host the lab");
        }
        //Validate lab time
        if(LocalTime.parse("08:00").isAfter(labTime) || 
                LocalTime.parse("18:00").isBefore(labTime)){
            throw new IllegalArgumentException("The lab start time must be between 08:00-18:00");
        }
        this.labTech = labTech;
        this.labClassRoom = labClassRoom;
        this.labDay = labDay;
        this.labTime = labTime;
    }
    
    /**
     * Constructor with prerequisiteSubject
     * @param instructor
     * @param courseNumber
     * @param courseName
     * @param classroom
     * @param classDay
     * @param classTime
     * @param classSize
     * @param prerequisiteSubject
     * @param labTech
     * @param labClassRoom
     * @param labDay
     * @param labTime 
     */
    public CourseWithLab(Instructor instructor, String courseNumber, String courseName, String classroom,
            DayOfWeek classDay, LocalTime classTime, int classSize, String prerequisiteSubject, Instructor labTech, 
            String labClassRoom, DayOfWeek labDay, LocalTime labTime){
        super(instructor, courseNumber, courseName, classroom, classDay, classTime, classSize, prerequisiteSubject);
        if(labTech.canTeach(courseNumber)==false){
            throw new IllegalArgumentException("The Lab Tech is not qualified to host the lab");
        }
        //Validate lab time
        if(LocalTime.parse("08:00").isAfter(labTime) || 
                LocalTime.parse("18:00").isBefore(labTime)){
            throw new IllegalArgumentException("The lab start time must be between 08:00-18:00");
        }
        this.labTech = labTech;
        this.labClassRoom = labClassRoom;
        this.labDay = labDay;
        this.labTime = labTime;
    }
    
    /**
     * Setter & Getter
     * @param labTech 
     */
    public void setLabTech(Instructor labTech){
        this.labTech = labTech;
    }
    
    public Instructor getLabTech(){
        return labTech;
    }
    
    /**
     * Setter & Getter
     * @param labClassRoom 
     */
    public void setLabClassRoom(String labClassRoom){
        if(labClassRoom.matches("[0-9 a-z A-Z_]+")){
            this.labClassRoom = labClassRoom;
            
        }else{
            throw new IllegalArgumentException("Please enter valid Lab room!!");
        }
    }
    
    public String getLabClassRoom(){
        return labClassRoom;
    }
    
    /**
     * Setter & Getter
     * @param labDay 
     */
    public void setLabDay(DayOfWeek labDay){
        this.labDay = labDay;
    }
    
    public DayOfWeek getLabDay(){
        return labDay;
    }
    
    /**
     * Setter & Getter
     * @param labTime 
     */
    public void setLabTime(LocalTime labTime){
        this.labTime = labTime;
    }
    
    public LocalTime getLabTime(){
        return labTime;
    }
    /**
     * 
     * @return Lab course number and course name
     */
    @Override
    public String toString(){
        return getCourseNumber() + "-" + getCourseName()+ " with lab";
    }
    
    /**
     * method to
     * @return lab class room, lab day and lab time
     */
    public String getLabClassAndTime(){
        return "room: " + getLabClassRoom()+ ", " + getLabDay()+ " starting at " + getLabTime();
    }
    
    
}
