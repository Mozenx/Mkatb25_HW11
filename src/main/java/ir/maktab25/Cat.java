package ir.maktab25;

public class Cat extends Animal {

    private BreedType breed;

    public Cat() {
        super();
    }

    public Cat(String name){
        setName(name);
    }

    public String  getBreed() {
        return breed.toString();
    }

    public BreedType getBreedInBreedType(){
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

    @Override
    public boolean equals(Object obj) {
        Cat c = (Cat) obj;

        if(c.getName().equals(this.getName()))
            return true;

        else return false;
    }
}//end of class
