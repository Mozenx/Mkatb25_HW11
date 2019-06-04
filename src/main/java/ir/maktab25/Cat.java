package ir.maktab25;

public class Cat extends Animal {

    private BreedType breed;

    public Cat() {
        super();
    }

    public Cat(String name){
        setName(name);
    }

    public BreedType getBreed() {
        return breed;
    }

    public void setBreed(BreedType breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + getName() +
                " ,breed=" + breed +
                '}';
    }
}
