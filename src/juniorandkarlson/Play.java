package juniorandkarlson;

public class Play implements Group {

    private final Human[] notfamily1 = new Human[10];
    private final Human[] family1 = new Human[10];
    private int notfamily = 0;
    private int countfamily1 = 0;
    private int love = 0;

    public void addnotfamily(Human var1){
        notfamily1[notfamily] = var1;
        notfamily += 1;
    }

    public void addfamily(Human var1){
        family1[countfamily1] = var1;
        countfamily1 += 1;
    }

    public void play(){
        Parent[] parents = makeparents();
        Child[] children = makechildren();

        for (int i = 0; i < 2; i++){
            if (parents[i].getActivity()){
                for (int j = 0; j < countfamily1; j++) {
                    if (((family1[j].hashCode() > 2000) && (family1[j].getGender() != family1[i].getGender())) || ((family1[j].getStatus() == Status.CHILD) && (family1[j].getPersonality() == Personality.GOOD))) {
                        love += 1;
                    }
                }
                parents[i].laugh();
                System.out.println(ifthen(parents[i]));
                break;
            }
        }

        for (Child child : children) {
            if (child.getActivity()) {
                Child couple = findcouple(child);
                System.out.print(talk(couple, child) + child.thoughts());
                enumerate(child);
                child.husbandWife();
                break;
            }

        }
    }

    public Child[] makechildren() {
        int countparents = 0;
        Child[] makechildren = new Child [10];
        for (int i = 0; i< countfamily1; i++){
            if (family1[i].getStatus() == Status.CHILD) {
                makechildren[countparents] = (Child) family1[i];
                countparents ++;
            }
        }
        return makechildren;
    }

    public Parent[] makeparents() {
        int countparents = 0;
        Parent[] makeparents = new Parent [2];
        for (int i = 0; i< countfamily1; i++){
            if (family1[i].hashCode() > 2000){
                makeparents[countparents] = (Parent) family1[i];
                countparents ++;
            }
        }
        return makeparents;
    }

    public String ifthen(Parent parent) {
        String s = "";
        if (parent.getActivity()) {
            switch (love) {
                case 1:
                    s = "ты меня любишь, значит я ";
                    s += parent.good();
                    break;
                case 2:
                    s = "вы оба меня любите, значит я ";
                    s += parent.good();
                    break;
                case 0:
                    s = "никто меня не любит, значит я ";
                    s += parent.bad();
                    break;
                default:
                    s = "много людей меня любят, значит я ";
                    s += parent.good();
                    break;
            }
        }
        return s;
    }

    public String talk(Child couple, Child themain){
        String s = "";
        if (couple == null) {
            s = themain.sigh();
        } else {
            s += sighelse(couple, themain) + themain.pause() + themain.think() + themain.doubt() + " будет не очень приятно жить вместе с " + couple.toString() + reason(couple);

        }
        return s;
    }

    public String reason(Child couple) {
        String s = "";
        if (couple.getPersonality() == Personality.BAD) {
            if (couple.getGender() == Gender.FEMALE) {
                s += ", потому что с ней трудно ладить. ";
            } else {
                s += ", потому что с ним трудно ладить. ";
            }
        } else {
            if (couple.getGender() == Gender.FEMALE) {
                s += ", хотя с ней и дружу. ";
            } else {
                s += ", хотя с ним и дружу. ";
            }
        }
        return s;
    }

    public Child findcouple(Human h){
        Child abstract_human = null;
        for (int i = 0; i < notfamily; i++){
            if (notfamily1[i].getGender() != h.getGender()){
                abstract_human = (Child) notfamily1[i];
                break;
            }
        }
        return abstract_human;
    }

    public String sighelse(Child couple, Child themain){
        if (themain.getGender() == Gender.MALE) {
            return "Ну, тогда я женюсь на " + couple.toString() + ", - вздохнул " + themain.toString() + ". – Ведь надо же мне будет на ком-нибудь жениться!\n";
        }else{
            return "Ну, тогда я выйду замуж за " + couple.toString() + ", - вздохнула " + themain.toString() + ". – Ведь надо же мне будет выйти замуж за кого-нибудь!\n";
        }
    }

    public void enumerate(Human h){
        Human[] l = new Human[countfamily1];
        int k = 0;
        // Список всех, кого надо перечислить
        for (int j = 0; j < countfamily1; j++){
            if (!h.equals(family1[j])){
                l[k] = family1[j];
                k += 1;
            }
        }
        //Само перечисление
        if (k > 1) {
            for (int j = 0; j < k - 2; j++) {
                System.out.print(l[j].toString());
                System.out.print(", ");
            }
            System.out.print(l[k-2].toString() + " и " + l[k-1].toString());
        }else{
            System.out.println(l[0].toString());
        }
    }

}