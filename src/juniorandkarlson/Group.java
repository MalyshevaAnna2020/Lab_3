package juniorandkarlson;

public interface Group {
    void addnotfamily(Human var1);
    void addfamily(Human var1);
    Child[] makechildren();
    Parent[] makeparents();
    String ifthen(Parent parent);
    String talk(Child couple, Child themain);
    Child findcouple(Human h);
    String sighelse(Child couple, Child themain);
    void enumerate(Human h);
    String reason(Child couple);
}
