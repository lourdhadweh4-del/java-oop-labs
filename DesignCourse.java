package Courses;

public class DesignCourse extends Course {

    public DesignCourse(String name1, double duration1, String platform1, double fee1 ) {
        super(name1, duration1, platform1, fee1);

    }
    @Override
    void getCourseDetails() {
        System.out.println("Design course details ");
        System.out.println("Course name " + super.name);
        System.out.println("Course duration " + super.duration);
        System.out.println("Course platform " + super.platform);
        System.out.println("Course fee " + super.fee);

    }
}

