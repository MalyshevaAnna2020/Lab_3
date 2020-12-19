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

    @Override
    public String say() {
        String s = "";
        if (this.getLaugh()){
            s = "и сказала:";
            laughFalse();
        }
        return s;
    }

    @Override
    public void laugh() {
        this.laughTrue();
        System.out.print("Тут мама рассмеялась " + say() + "\nРаз ");
    }

    @Override
    public String good(){
        return "хорошая.";
    }

    @Override
    public String bad(){
        return "плохая.";
    }
}