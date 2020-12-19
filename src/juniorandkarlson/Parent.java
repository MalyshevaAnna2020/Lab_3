package juniorandkarlson;


public class Parent extends Human implements Love{

    //Parent
    public Parent(String name, int age){
        super(name, age);
        this.setStatus(Status.PARENT);
    }
    public Parent(String name){
        super(name);
        this.setStatus(Status.PARENT);
    }

    public Parent(String name, boolean b) {
        super(name, b);
        this.setStatus(Status.PARENT);
        this.setPersonality(Personality.GOOD);
    }


    public void laugh() {
        this.laughTrue();
        System.out.print("Тут родитель рассмеялся " + say() + "\nРаз ");
    }

    public String say() {
        String s = "";
        if (this.getLaugh()){
            s = "и сказал:";
            laughFalse();
        }
        return s;
    }

    public String good(){
        return "хороший.";
    }

    public String bad(){
        return "плохой.";
    }

}
