package juniorandkarlson;

public class Mother extends Parent{

    public Mother(String name, int age) {
        super(name, age);
        setGender(Gender.FEMALE);
    }

    public Mother(String name) {
        super(name);
        setGender(Gender.FEMALE);
    }

    public Mother(String name, boolean b) {
        super(name, b);
        setGender(Gender.FEMALE);
    }

}