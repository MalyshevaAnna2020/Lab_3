package juniorandkarlson;

public class Father extends Parent {
    public Father(String name, int age) {
        super(name, age);
        setGender(Gender.MALE);
    }

    public Father(String name) {
        super(name);
        setGender(Gender.MALE);
    }

    public Father(String name, boolean b) {
        super(name, b);
        setGender(Gender.MALE);
    }

    @Override
    public void laugh() {
        this.laughTrue();
        System.out.print("Тут папа рассмеялся " + say() + "\nРаз ");
    }


}
