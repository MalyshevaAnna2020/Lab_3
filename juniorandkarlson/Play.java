package juniorandkarlson;

import java.util.ArrayList;
import java.util.List;

public final class Play {

    private static List<Human> notfamily;
    private static List<Human> family;

    public Play(){
        this.notfamily = new ArrayList();
        this.family = new ArrayList();
    }

    public void addNotFamily(Human var1){
        this.notfamily.add(var1);
    }

    public void addFamily(Human var1){
        this.family.add(var1);
    }

    public void play(){
        for (int i = 0; i < this.family.size(); i++){
            if ((family.get(i).hashCode() > 2000) && (family.get(i).getActivity())){
                family.get(i).Laugh();
            }
        }
        for (int i = 0; i < this.family.size(); i++){
            if ((family.get(i).hashCode() > 1000) && (family.get(i).hashCode() < 2000) && (family.get(i).getActivity())){
                family.get(i).Thoughts();
            }
        }
    }
    /*public static void main(String[] args) {
        Play var1 = new Play();
        var1.addFamily(new Mother("Мама Малыша", true));
        var1.addNotFamily(new Father("Папа Гуниллы"));
        var1.play();
    }
     */

    public static Human getMember(int i){
        return family.get(i);
    }
    public static Human getNotMember(int i){
        return notfamily.get(i);
    }
    public static int sizeFamily(){
        return family.size();
    }
    public static int sizeNotFamily(){
        return notfamily.size();
    }

}
