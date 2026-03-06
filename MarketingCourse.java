package Courses;

public class MarketingCourse extends Course {

    public MarketingCourse (String name1, double duration1, String platform1, double fee1 ) {
        super(name1, duration1, platform1, fee1);

    }
    @Override
    void getCourseDetails() {
        System.out.println("Marketing course details ");
        System.out.println("Marketing course details ");
        System.out.println("Course name " + name);
        System.out.println("Course duration " + duration);
        System.out.println("Course platform " + platform);
        System.out.println("Course fee " + fee);
    }
}

