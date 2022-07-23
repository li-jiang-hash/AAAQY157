package D0722Exercises;

public class Dog extends Pet{
    private String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void KanMen(){
        System.out.println(species+","+super.getName()+"年龄"+super.getAge()+"在抓老鼠");
    }
}
