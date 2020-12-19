package juniorandkarlson;

public class Girl extends Child{
    public Girl(String name, int age) {
        super(name, age);
        setGender(Gender.FEMALE);
    }

    public Girl(String name) {
        super(name);
        setGender(Gender.FEMALE);
    }

    public Girl(String name, int i, boolean b) {
        super(name, i, b);
        this.setGender(Gender.FEMALE);
    }

    @Override
    public String sigh() {
        return "Ну, тогда я ни за кого не выйду замуж, - вздохнула " + this.toString() + ".\n";
    }

    @Override
    public String pause(){
        return "И " + this.toString() + "задумалась. ";
    }

    @Override
    public String think(){
        return "Она думала о том, что ей";
    }

    @Override
    public String himHer(){
        return "й ";
    }
    @Override
    public void husbandWife(){
        System.out.print(", а не с каким-то там мужем.");
    }

}
