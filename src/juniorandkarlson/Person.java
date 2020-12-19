package juniorandkarlson;

public interface Person {
    void setAge(int var1);
    void setGender(Gender var1);
    void setPersonality(Personality var1);
    void setStatus(Status var1);
    boolean getActivity();
    boolean getLaugh();
    Status getStatus();
    Gender getGender();
    Personality getPersonality();
    void laughTrue();
    void laughFalse();
    int getAge();
}
