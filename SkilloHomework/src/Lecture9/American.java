package Lecture9;

public class American extends Person {
    public American(String name, String religion, String language, String nationality, String sex, String egn, boolean hasJob, String jobTitle, String country) {
        super(name, religion, language, nationality, sex, egn, hasJob, jobTitle, country);
    }
    @Override
    public String getCountry () {
        return "America";
    }
    @Override
    public void sayHello () {
        System.out.println("Hi!");
    }
    @Override
    public boolean isAdult() {
        return this.getAge() >= 21;
    }
    public void sayBye() {
        System.out.println("Bye!");
    }
    public void sing() {
        System.out.println("Na-na-na");
    }
}
