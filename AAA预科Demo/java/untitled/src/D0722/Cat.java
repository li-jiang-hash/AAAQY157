package D0722;

public class Car extends Pet {
    public int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void name (){
        System.out.println(",体重为"+weight+"Kg,"+getName()+"抓老鼠");
    }
    
}
