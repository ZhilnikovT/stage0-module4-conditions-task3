package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public int[] c = new int[] {31,20,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        DaysInMonthPrinter g = new DaysInMonthPrinter();
        g.amountOfDays(g, 11);
    }
    public void amountOfDays(DaysInMonthPrinter g, int month) {
        if(month >= 1 && month < 13) {System.out.println(g.c[month-1]);}
        else{System.out.println("wrong number!");}
    }
}
