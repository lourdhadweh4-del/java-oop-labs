package Courses;

public class Course {
    protected String name;
    double duration;
    String platform;
    double fee;

    public Course(String name1, double duration1, String platform1, double fee1) {
        this.name = name1;
        this.duration = duration1;
        this.platform = platform1;
        this.fee = fee1;
    }
    void getCourseDetails() {
        System.out.println("General course details ");

    }
}
