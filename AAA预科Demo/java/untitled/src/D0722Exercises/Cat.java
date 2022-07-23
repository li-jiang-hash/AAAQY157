package D0722Exercises;

public class Cat extends Pet{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void ZhuaLaoShu(){
        System.out.println("体重"+weight+"Kg"+super.getColor()+"的"+super.getName()+"在抓老鼠");
    }
}
