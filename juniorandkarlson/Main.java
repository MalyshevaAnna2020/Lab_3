package juniorandkarlson;

public class Main {

    public static void main(String[] args){
        Play p = new Play();
        Mother m = new Mother("Мама", true);
        Father f = new Father("Папа");
        Boy j = new Boy("Малыш", 8, true);
        Boy b = new Boy("Боссе", 15);
        Girl g = new Girl("Бетан", 14);
        Girl gu = new Girl("Гунилла");
        Dog dog = new Dog("Бимбо");

        p.addFamily(m);
        p.addFamily(f);
        p.addFamily(j);
        p.addFamily(b);
        p.addFamily(g);
        p.addFamily(dog);
        p.addNotFamily(gu);


        p.play();
    }
}
