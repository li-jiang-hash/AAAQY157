package D0722Exercises;

public class Test {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        dog.setName("警犬");
        dog.setColor("灰色");
        dog.setAge(76);
        dog.playWithOwner();
        if (dog instanceof Dog){
            Dog dog2=(Dog) dog;
            Cat cat1=(Cat) cat;
            dog2.setSpecies("中华田园犬");
            dog2.setAge(12);
            dog2.KanMen();

            cat1.setWeight(20);
            cat1.setColor("白色");
            cat1.setName("TomCat");
            cat1.ZhuaLaoShu();
        }
    }
}
