public class UserManager {
    public void show(User user){
    System.out.println(user.getFullName());
    }
    public void register(User user){
        if (user.getPassword().length()< 4){
            System.out.println("Parolanızı güçlendirmeniz gerekir.");
        }else{
            System.out.println("Başarılı");
        }
    }
    public void login(User user){
        System.out.println("Hoşgeldiniz " + user.getFullName() +" giriş yapılıyor.");
    }

    public void update(User user){
        System.out.println(user.getId() + " numaralı kullanıcı bilgileriniz güncellendi.");
    }


}
