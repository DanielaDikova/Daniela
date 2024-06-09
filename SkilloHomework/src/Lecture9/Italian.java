package Lecture9;

public class Italian extends Person{
    public Italian(String name, String religion, String language, String nationality, String sex, String egn, boolean hasJob, String jobTitle, String country) {
        super(name, religion, language, nationality, sex, egn, hasJob, jobTitle, country);
    }
    @Override
    public String getCountry () {
        return "Italia";
    }
    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }
    @Override
    public boolean isAdult () {
        return this.getAge() >= 18;
    }
    public void sayBye() {
        System.out.println("Arrivederci!");
    }
    public void sing() {
        System.out.println("Na-na-na");
    }
}

