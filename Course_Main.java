package Courses;

public class Course_Main {
    public static void main(String[] args) {
        Course B = new DesignCourse("Basics", 10, "Designing platform", 50);
        Course A = new MarketingCourse("Marketing class", 20, "Marketing website", 40);
        Course C = new ProgrammingCourse("Programming class", 10, "LeetCode", 20);
        B.getCourseDetails();
        A.getCourseDetails();
        C.getCourseDetails();

    }
}
