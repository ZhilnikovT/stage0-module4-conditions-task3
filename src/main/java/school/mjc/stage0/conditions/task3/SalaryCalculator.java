package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void main(String[] args) {
        SalaryCalculator g = new SalaryCalculator();
        g.calculateSalary(1000);
    }
    
    public void calculateSalary(int salary) {
        if(salary < 0){
            System.out.println("wrong input!");
        }else{
            if(salary > 20000){
                System.out.println((float)(salary * 0.8));
            }else{
                if(salary <= 20000 && salary > 10000){
                    System.out.println((float)(salary * (1 - 0.18)));
                }else{
                    System.out.println((float)(salary * (1 - 0.15)));
                }
            }
        }
    }
}
