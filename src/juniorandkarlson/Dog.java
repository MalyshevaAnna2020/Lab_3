package juniorandkarlson;

public class Dog extends Human{


    public Dog(String name){
        super(name);
        this.setGender(Gender.ANIMAL);
        this.setStatus(Status.DOG);
    }

    @Override
    public void Laugh() {

    }

    @Override
    public void Thoughts() {

    }
}
