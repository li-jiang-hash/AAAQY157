package D0720.Game;

public class UserClass {
    private String UserName;
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total += total;
    }
    public int userChoice(int UserId){
        switch (UserId){
            case 1:
                System.out.println("您出拳:石头");
                break;
            case 2:
                System.out.println("您出拳:剪刀");
                break;
            case 3:
                System.out.println("您出拳:布");
                break;
        }
        return UserId;
    }
}
