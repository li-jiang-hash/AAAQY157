public class Foundation {
    public static double fundMoney = 1000;
    public double addFund(double addMoney){
        fundMoney += addMoney;
        System.out.println("新增慈善基金"+addMoney+"元。");
        return fundMoney;
    }
}
