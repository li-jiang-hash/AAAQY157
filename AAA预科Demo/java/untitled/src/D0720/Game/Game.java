package D0720.Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Computer pc = new Computer();
        UserClass uc = new UserClass();
        Scanner sc = new Scanner(System.in);
//        int id = Co.PCChoice();
//        System.out.println(id);
        System.out.println("----------迎进入游戏界面----------");
        System.out.println("\t\t*************\t\t\t");
        System.out.println("\t\t**猜拳，开始**\t\t\t");
        System.out.println("\t\t*************\t\t\t");
        System.out.print("请选择您想和谁对战[1.刘备][2.孙权][3.曹操]:");
        int userSelectPcId = sc.nextInt();
        int isNum=0;
        for (int i=0;i==0;){
            switch (userSelectPcId){
                case 1:
                    pc.setPcHero("刘备");
                    break;
                case 2:
                    pc.setPcHero("孙权");
                    break;
                case 3:
                    pc.setPcHero("曹操");
            }
            System.out.println();
            System.out.print("要开始吗？(y/n):");
            String userSelectYN= sc.next();
            isNum++;
            switch (userSelectYN){
                case "y":
                    System.out.print("请出拳:[1.石头][2.剪刀][3.布]:");
                    int userSelectId = sc.nextInt();
                    int userEnterId = uc.userChoice(userSelectId);
                    int pcId = pc.PCChoice();
                    int GameId = userEnterId -pcId;
                    System.out.println(pcId);
                    switch (GameId){
                        case -1:
                        case 2:
                            System.out.println("此局:恭喜，您赢了！");
                            uc.setTotal(1);
                            break;
                        case 0:
                            System.out.println("和局:嘿嘿，等着瞧吧！");
                            pc.setIsEqual(1);
                            break;
                        case 1:
                        case -2:
                            pc.setTotal(1);
                            System.out.println("此局:抱歉，您输了！");
                            break;

                    }
                    break;
                case "n":
                    System.out.println(pc.getPcHero()+"\tVS\t玩家");
                    System.out.println("对战次数: "+isNum+"; 出拳一样的情况有 "+pc.getIsEqual()+" 次");
                    int pcVictory = pc.getTotal();
                    int userVictory = uc.getTotal();
                    if (pcVictory==userVictory){
                        System.out.println("真厉害，等着瞧吧！");
                    } else if (pcVictory>userVictory) {
                        System.out.println("不不好意思，您输了！！");
                    }else {
                        System.out.println("恭喜恭喜，您赢了！！");
                    }
                    i++;
                    break;
                default:
                    System.out.println("输入有误自动退出！！");
                    i++;
                    break;
            }
        }
    }
}
