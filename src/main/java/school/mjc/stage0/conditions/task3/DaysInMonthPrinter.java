package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
   
    public static void main(String[] args) {
        DaysInMonthPrinter g = new DaysInMonthPrinter();
        g.amountOfDays(11);
    }
    public void amountOfDays(int month) {
        int[] c = new int[] {31,20,31,30,31,30,31,31,30,31,30,31};
        if(month >= 1 && month < 13) {System.out.println(c[month-1]);}
        else{System.out.println("wrong number!");}
    }
}
