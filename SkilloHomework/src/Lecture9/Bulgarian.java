package Lecture9;

public class Bulgarian extends Person {
    public Bulgarian(String name, String religion, String language, String nationality, String sex, String egn, boolean hasJob, String jobTitle, String country) {
        super(name, religion, language, nationality, sex, egn, hasJob, jobTitle, country);
    }

    @Override
    public String getCountry() {
        String Country = "Bulgaria";
        return Country;
    }

    @Override
    public void sayHello() {
        System.out.println("Здравей!");
    }

    @Override
    public boolean isAdult() {
        return this.getAge() >= 18;
    }
    public void sayBye() {
        System.out.println("Довиждане!");
    }
    public void sing() {
        System.out.println("На-на-на");
    }

}
