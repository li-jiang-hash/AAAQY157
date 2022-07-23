package D0722Exercises;

public class Pet {
    private String name;
    private int age;
    private String color;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void playWithOwner(){
        System.out.println(color+"的"+name+age+"岁再陪主人玩");
    }
}
