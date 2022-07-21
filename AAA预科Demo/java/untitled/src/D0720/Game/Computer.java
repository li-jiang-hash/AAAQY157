package D0720.Game;

public class Computer {
    private int pcId = (int)(Math.random()*4);

    public void setPcId(int pcId) {
        this.pcId = pcId;
    }
    private String PcHeroName;
    private int isEqual;

    public int getIsEqual() {
        return isEqual;
    }

    public void setIsEqual(int isEqual) {
        this.isEqual += isEqual;
    }

    public String getPcHero() {
        return PcHeroName;
    }

    public void setPcHero(String pcHero) {
        PcHeroName = pcHero;

    }
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total += total;
    }

    public int PCChoice(){
        switch (pcId){
            case 1:
                System.out.println(PcHeroName+"出拳:石头");
                break;
            case 2:
                System.out.println(PcHeroName+"出拳:剪刀");
                break;
            case 3:
                System.out.println(PcHeroName+"出拳:布");
                break;
        }
            return pcId;
    }
}
