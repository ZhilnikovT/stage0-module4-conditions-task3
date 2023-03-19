package school.mjc.stage0.conditions.task3;

public class Divider {
     public static void main(String[] args) {
        Divider g = new Divider();
        g.isDividableBy5And11(1000);
    }
    public void isDividableBy5And11(int number) {
        if(number == 0){
            System.out.println("cannot divide by zero");
        }else{
            if((number%5 + number%11) == 0){
                System.out.println("Dividable");
            }else{
                System.out.println("Non-dividable");
            }
        }
    }
}

