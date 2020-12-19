package juniorandkarlson;

public class Child extends Human implements LoveChild{
    // Child
    public Child(String name, int age){
        super(name, age);
        this.setСhild();
    }
    public Child(String name){
        super(name);
        this.setСhild();
    }
    public Child(String name, boolean b) {
        super(name, b);
        this.setСhild();
    }
    public Child(String name, int age, boolean b) {
        super(name, age, b);
        this.setСhild();
    }

    public void setСhild(){
        this.setStatus(Status.CHILD);
        this.setGender(Gender.MALE);
        if (this.getAge() < 13) {
            this.setPersonality(Personality.GOOD);
        }
    }


    public String thoughts() {
        return "Да и вообще е" + himHer() + "больше всего хотелось жить вмсете с ";
    }

    public void husbandWife() {
        System.out.println(", а не с какой-то там женой.");
    }

    public String himHer() {
        return "му ";
    }

    public String sigh() {
        return "Ну, тогда я ни на ком не женюсь, - вздохнул " + this.toString() + ".\n";
    }



    public String pause(){
        return this.toString() + " задумался. ";
    }

    public String think(){
        return "Он думал о том, что ему";
    }

    public String doubt(){
        return ", наверное,";
    }

}
