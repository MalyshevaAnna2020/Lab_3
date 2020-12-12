package juniorandkarlson;


public abstract class Parent extends Human implements Love, Person{

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

    @Override
    public void Thoughts() {
    }


    @Override
    public void Laugh() {
        this.LaughTrue();
        if (this.getGender() == Gender.FEMALE) {
            System.out.print("Тут мама рассмеялась ");
        }
        if (this.getGender() == Gender.MALE) {
            System.out.print("Тут папа рассмеялся ");
        }
        Say();
        IfThen();
    }


    @Override
    public void Say() {
        if (this.getLaugh()){
            if (this.getGender() == Gender.FEMALE) {
                System.out.println("и сказала:");
            }
            if (this.getGender() == Gender.MALE) {
                System.out.println("и сказал:");
            }
            LaughFalse();
        }
    }

    @Override
    public void IfThen() {
        if (this.getActivity()) {
            System.out.print("Раз ");
            int n = 0;
            Human h = null;
            for (int i = 0; i < Play.sizeFamily(); i++) {
                if ((Play.getMember(i).hashCode() > 2200) || ((Play.getMember(i).getStatus() == Status.CHILD) && (Play.getMember(i).getPersonality() == Personality.GOOD))) {
                    n += 1;
                    h = Play.getMember(i);
                }
            }
            switch (n) {
                case 1:
                    if (h.getActivity()) {
                        System.out.print("ты меня любишь, значит я ");
                    } else {
                        System.out.print("кто-то один меня любит, значит я ");
                    }
                    Good();
                    break;
                case 2:
                    System.out.print("вы оба меня любите, значит я ");
                    Good();
                    break;
                case 0:
                    System.out.print("никто меня не любит, значит я ");
                    Bad();
                    break;
                default:
                    System.out.print("много людей меня любят, значит я ");
                    Good();
                    break;
            }
            System.out.println();
        }
    }


    @Override
    public void Good(){
        if (this.getGender() == Gender.FEMALE) {
            System.out.print("хорошая");
        } else {
            System.out.print("хороший");
        }
    }
    public void Bad(){
        if (this.getGender() == Gender.FEMALE) {
            System.out.print("плохая");
        } else {
            System.out.print("плохой");
        }
    }

}
