//Create a class that acts as a blueprint for a College Course
public class CollegeCourse {
    private int courseReferenceNumber;
    private int courseNumber;

//Default constructor
    public CollegeCourse(){

    }

//Constructor that takes two arguments
    public CollegeCourse(int inputCourseReferenceNumber, int inputCourseNumber){
        this.courseReferenceNumber = inputCourseReferenceNumber;
        this.courseNumber = inputCourseNumber;
    }

//Setters and Getters for each state
    public void setCourseReferenceNumber(int inputCourseReferenceNumber){
        this.courseReferenceNumber = inputCourseReferenceNumber;
    }

    public int getCourseReferenceNumber(){
        return courseReferenceNumber;
    }

    public void setCourseNumber(int inputCourseNumber) {
        this.courseNumber = inputCourseNumber;
    }

    public int getCourseNumber(){
        return courseNumber;
    }
}
