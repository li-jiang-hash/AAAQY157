package Exercises;

public class Pet {
    String breed;
    String color;
    int weight;
    public Pet(String breed,String color, int weight){
        this.breed =breed;
        this.color = color;
        this.weight = weight;
    }
    public void printInfo(){
        System.out.println("宠物种类:"+breed);
        System.out.println("宠物颜色:"+color);
        System.out.println("宠物体重:"+weight+"Kg");
    }
    public void  feed(String feed){
        System.out.println("给宠物—"+breed+"—喂了"+feed+"食物");
    }
}
