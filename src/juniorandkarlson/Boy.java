package juniorandkarlson;

public class Boy extends Child{
    public Boy(String name, int age) {
        super(name, age);
        setGender(Gender.MALE);
    }

    public Boy(String name) {
        super(name);
        setGender(Gender.MALE);
    }
    public Boy(String name, boolean b) {
        super(name, b);
        setGender(Gender.MALE);
    }

    public Boy(String name, int age, boolean b) {
        super(name, age, b);
        setGender(Gender.MALE);
    }

}
