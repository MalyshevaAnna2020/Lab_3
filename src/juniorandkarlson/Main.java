package juniorandkarlson;

public class Main {

    public static void main(String[] args){
        Play p = new Play();
        Mother mother = new Mother("Мама", true);
        Father father = new Father("Папа");
        Boy junior = new Boy("Малыш", 8, true);
        Boy Bosse = new Boy("Боссе", 15);
        Girl Betan = new Girl("Бетан", 14);
        Girl Gunilla = new Girl("Гунилла");
        Dog dog = new Dog("Бимбо");

        p.addfamily(mother);
        p.addfamily(father);
        p.addfamily(junior);
        p.addfamily(Bosse);
        p.addfamily(Betan);
        p.addfamily(dog);
        p.addnotfamily(Gunilla);


        p.play();
    }
}
