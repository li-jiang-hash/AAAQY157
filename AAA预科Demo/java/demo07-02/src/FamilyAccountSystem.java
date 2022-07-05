class FamilyAccountSystem {
    public static void main(String[] args) {

//        生命本金
        int balance = 10000;

        String details= "收支\t\t\t账户金额\t\t\t收支金额\t\t\t说   明\n";
        while (true){
            System.out.println("--------------------家庭收支记账系统--------------------");
            System.out.println("                      1 收支明细");
            System.out.println("                      2 登记收入");
            System.out.println("                      3 登记支出");
            System.out.println("                      4 退   出\n");
            System.out.println("                    请选择(1-4):");

            char select = Utilty.readMenuSelection();
            if(select == '1'){
//                System.out.println("1 收支明细");
                System.out.println("--------------------当前收支明细记录--------------------");
                System.out.println(details);
//                System.out.println(); //换行
                System.out.println("-----------------------------------------------------");
            }else if(select == '2'){
//                System.out.println("2 登记收入");
                System.out.println("本次收入金额：");
                int money = Utilty.readNumber();

                balance = balance + money;


                System.out.println("本次收入说明：");
                String info = Utilty.readString();

                details = details + ("收入\t\t\t"+ balance +"\t\t\t"+ money +"\t\t\t\t"+ info + "\n");

                System.out.println("------------------------登记完成-----------------------");
            }else if(select == '3'){
//                System.out.println("3 登记支出");
                System.out.println("本次支出金额：");
                int money = Utilty.readNumber();

                balance = balance -money;

                System.out.println("本次支出说明：");
                String info = Utilty.readString();

                details = details + ("支出\t\t\t"+ balance +"\t\t\t"+ money +"\t\t\t\t"+ info + "\n");

                System.out.println("------------------------登记完成-----------------------");
            }else if(select == '4'){
                System.out.println("确认是否退出(Y/N):");
                char exit = Utilty.readConfirmSelection();
                if(exit == 'Y'){
                    break;
                }else{
                    System.out.println("---------------------用户取消了操作---------------------");
                }
            }
        }
    }
}
