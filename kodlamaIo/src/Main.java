public class Main {
    public static  void main(String[] args){

    Instructor instructor1 = new Instructor();
    instructor1.setId(1);
    instructor1.setFirstName("Engin");
    instructor1.setLastName("Demirog");
    instructor1.setEmail("engin@gmail.com");
    instructor1.setPassword("123456");

    Student student1 = new Student();
    student1.setStudentNumber("1000000");
    student1.setEmail("atakan@gmail.com");
    student1.setFirstName("Atakan ");
    student1.setLastName("Kececi");
    student1.setId(1);
    student1.setPassword("123456");

    Course course1 = new Course();
    course1.setCourseId(1);
    course1.setCourseName("Java kampı");
    course1.setCourseDetail("Bu bir Java kampıdır.");

    InstructorManager instructorManager = new InstructorManager();
    instructorManager.show(instructor1);
    instructorManager.register(instructor1);

    StudentManager studentManager = new StudentManager();
    studentManager.show(student1);
    studentManager.update(student1);



    }
}
