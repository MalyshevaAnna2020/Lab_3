package juniorandkarlson;

public abstract class Human implements Person{

    private String name = "noname";
    private int age = 20;
    private Gender gender = Gender.MALE;
    private Personality personality = Personality.BAD;
    private Status status = Status.CHILD;
    private boolean activity = false;
    private boolean laugh = false;

    public Human (String var1, int var2, boolean a){
        this.name = var1;
        setAge(var2);
        this.activity = a;
    }

    public Human (String var1, int var2){
        this.name = var1;
        this.setAge(var2);
    }

    public Human(){
    }

    public Human(String var1){
        this.name = var1;
    }

    public Human(String var1, boolean a){
        this.name = var1;
        this.activity = a;
    }

    public Human(int var1){
        this.setAge(var1);
    }

    public void setAge(int var1){
        if (var1 < 0){
            var1 = 20;
        }

        if (var1 > 99){
            var1 = 99;
        }
        this.age = var1;
    }

    public void setGender(Gender var1){
        if (var1 == null){
            var1 = Gender.MALE;
        }
        this.gender = var1;
    }

    public void setPersonality(Personality var1){
        if (var1 == null){
            var1 = Personality.BAD;
        }
        this.personality = var1;
    }

    public void setStatus(Status var1){
        if (var1 == null){
            var1 = Status.CHILD;
        }
        this.status = var1;
    }

    @Override
    public boolean getActivity(){
        return(this.activity);
    }

    @Override
    public boolean getLaugh() {
        return this.laugh;
    }

    @Override
    public Status getStatus(){ return this.status; }

    @Override
    public Gender getGender(){ return this.gender;}

    @Override
    public Personality getPersonality(){
        return this.personality;
    }

    @Override
    public void LaughTrue(){
        this.laugh = true;
    }

    @Override
    public void LaughFalse(){
        this.laugh = false;
    }

    @Override
    public int getAge(){ return this.age; }

    @Override
    public int hashCode(){
        int a = this.age;
        if (this.gender == Gender.FEMALE){
            a += 100;
        }
        if (this.gender == Gender.MALE){
            a += 200;
        }
        if (this.status == Status.CHILD){
            a += 1000;
        }
        if (this.status == Status.PARENT){
            a += 2000;
        }
        return a;
    }

    @Override
    public boolean equals(Object h){
        return (h.hashCode() == this.hashCode());
    }

    @Override
    public String toString(){
        return (this.status + " " + this.name);
    }

}
