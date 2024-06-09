package Lecture9;

public class Exercise {
    public static void main(String[] args) {
        /*
        Person tsveti = new Person("Tsveti", "orthodox","Bulgarian", "Bulgarian","Female", "1343304865",false, "MCOT", "Bulgaria");
        System.out.println(tsveti.getCountry());
        System.out.println(tsveti.getSex());
        System.out.println(tsveti.getAge());
        System.out.println(tsveti.getBirthDate());
        tsveti.setCountry("Italy");
        System.out.println(tsveti.getCountry());
        System.out.println("Can take a loan: " + tsveti.canTakeLoan());
        System.out.println("Is adult: " + tsveti.isAdult());
        tsveti.celebrateEaster();
        tsveti.sayHello();
        System.out.println("Child part:");
        Child kid = new Child("Alexandar","orthodox","Bulgarian", "Bulgarian","Female", "1343304865",false, null, "Bulgaria");
        kid.sayHello();
        System.out.println("Can take a loan: " + kid.canTakeLoan());
        System.out.println("Is adult: " + kid.isAdult());
        kid.celebrateEaster();
        kid.play("car");
        kid.play("laptop");
        kid.setHasJob(true);
         */

        Bulgarian Daniela = new Bulgarian("Daniela", "orthodox","Bulgarian", "Bulgarian","Female", "9801014865",true, "teacher", "Bulgaria");
        System.out.println(Daniela.getCountry());
        Daniela.sayHello();
        System.out.println("Is adult: " + Daniela.isAdult());

        American John = new American("John", "orthodox","English", "American","Male", "0551036688",true, "waiter", "America");
        System.out.println(John.getCountry());
        John.sayHello();
        System.out.println("Is adult: " + John.isAdult());

        Italian Giuseppe = new Italian("Giuseppe", "catholic","Italian", "Italian","Male", "9802036688",true, "lawyer", "Italia");
        System.out.println(Giuseppe.getCountry());
        Giuseppe.sayHello();
        System.out.println("Is adult: " + Giuseppe.isAdult());
        Daniela.sayBye();
        Daniela.sing();
        John.sayBye();
        John.sing();
        Giuseppe.sayBye();
        Giuseppe.sing();
    }


}
