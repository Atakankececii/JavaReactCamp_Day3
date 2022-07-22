public class StudentManager extends UserManager{



    @Override
    public void login(User user) {
        System.out.println("Hoşgeldiniz öğrenci " + user.getFullName() + " giriş yapılıyor.");
    }

    public void joinCourses(){
        System.out.println("Kursa katılındı.");
    }
}
