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
    public String Sigh() {
        return "Ну, тогда я ни за кого не выйду замуж, - вздохнула " + this.toString() + ".\nЕ";
    }

    @Override
    public String SighElse(){
        return "Ну, тогда я выйду замуж за " + FindCouple().toString() + ", - вздохнула " + this.toString() + ". – Ведь надо же мне будет выйти замуж за кого-нибудь!\n";
    }

    @Override
    public String Pause(){
        return "И " + this.toString() + "задумалась. ";
    }

    @Override
    public String Think(){
        return "Она думала о том, что ей";
    }

    @Override
    public Human FindCouple(){
        Human h = null;
        for (int i = 0; i < Play.sizeNotFamily(); i++){
            if (Play.getNotMember(i).getGender() == Gender.MALE){
                h = Play.getNotMember(i);
            }
            break;
        }
        return h;
    }
    public void HimHer(){
        System.out.print("й ");
    }
    public void HusbandWife(){
        System.out.print(", а не с каким-то там мужем.");
    }

}
