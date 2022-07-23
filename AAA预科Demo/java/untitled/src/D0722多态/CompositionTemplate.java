package D0722多态;

import java.util.Calendar;

public abstract class CompositionTemplate {

    Calendar ca = Calendar.getInstance();
    int year = ca.get(Calendar.YEAR);
    int month = ca.get(Calendar.MONTH);
    int day = ca.get(Calendar.DAY_OF_MONTH);
    public final void write(){
        System.out.println("<<我的老师>>");
        body();
        System.out.println("啊~ 这就是我的老师");
        System.out.println("\n\n\n\t\t\t"+year+"年"+ month+"月"+day+"日");
    }
    public abstract void body();
}
