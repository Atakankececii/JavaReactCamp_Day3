public class InstructorManager extends UserManager {

    @Override
    public void login(User user) {
        System.out.println("Hoşgeldiniz eğitmen "+ user.getFullName() + " giriş yapılıyor.");
    }

    public void deleteStudent(){
        System.out.println("Öğrenci siliniyor.");
    }

    public void addCourse(){
        System.out.println("Kurs açıldı.");
    }
}

