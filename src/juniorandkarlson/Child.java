package juniorandkarlson;

import java.util.ArrayList;
import java.util.List;

public class Child extends Human implements LoveChild, Person{
    public Child(String name, int age){
        super(name, age);
        this.setChild();
    }
    public Child(String name){
        super(name);
        this.setChild();
    }
    public Child(String name, boolean b) {
        super(name, b);
        this.setChild();
    }
    public Child(String name, int age, boolean b) {
        super(name, age, b);
        this.setChild();
    }

    public void setChild(){
        this.setStatus(Status.CHILD);
        this.setGender(Gender.MALE);
        if (this.getAge() < 13) {
            this.setPersonality(Personality.GOOD);
        }
    }

    @Override
    public void Laugh() {
    }

    @Override
    public void Thoughts() {
        Human h = FindCouple();
        if (h == null){
            System.out.println(Sigh());
        }else {
            System.out.print(SighElse() + Pause() + Think() + Doubt());
            System.out.print(" будет не очень приятно жить вместе с " + h.toString());
            if (h.getPersonality() == Personality.BAD) {
                if (h.getGender() == Gender.FEMALE) {
                    System.out.print(", потому что с ней трудно ладить. ");
                } else {
                    System.out.print(", потому что с ним трудно ладить. ");
                }
            } else {
                if (h.getGender() == Gender.FEMALE) {
                    System.out.print(", хотя с ней и дружу. ");
                } else {
                    System.out.print(", хотя с ним и дружу. ");
                }
            }
            System.out.print("Да и вообще е");
        }
        HimHer();
        System.out.print("больше всего хотелось жить вмсете с ");
        List l = new ArrayList();
        for (int i = 0; i < Play.sizeFamily(); i++){
            if (!Play.getMember(i).equals(this)){
                l.add(Play.getMember(i));
            }
        }
        if (l.size() > 1) {
            for (int i = 0; i < l.size()-2; i++) {
                System.out.print(l.get(i).toString());
                System.out.print(", ");
            }
            System.out.print(l.get(l.size()-2).toString() + " и " + l.get(l.size()-1).toString());
        }else{
            System.out.println(l.get(0).toString());
        }
        HusbandWife();

    }

    public void HusbandWife() {
        System.out.println(", а не с какой-то там женой.");
    }

    public void HimHer() {
        System.out.print("му ");
    }

    @Override
    public String Sigh() {
        return "Ну, тогда я ни на ком не женюсь, - вздохнул " + this.toString() + ".\nЕ";
    }

    @Override
    public String SighElse(){
        return "Ну, тогда я женюсь на " + FindCouple().toString() + ", - вздохнул " + this.toString() + ". – Ведь надо же мне будет на ком-нибудь жениться!\n";
    }

    @Override
    public Human FindCouple(){
        Human h = null;
        for (int i = 0; i < Play.sizeNotFamily(); i++){
            if (Play.getNotMember(i).getGender() == Gender.FEMALE){
                h = Play.getNotMember(i);
            }
            break;
        }
        return h;
    }

    @Override
    public String Pause(){
        return this.toString() + " задумался. ";
    }

    @Override
    public String Think(){
        return "Он думал о том, что ему";
    }

    @Override
    public String Doubt(){
        return ", наверное,";
    }

}
