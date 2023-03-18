package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
     public static void main(String[] args) {
        AliquotNumbers g = new AliquotNumbers();
        g.isFirstAliquot(40,10);
    }
    
    public void isFirstAliquot(int first, int second) {
        if(second%first == 0){
            System.out.println("Aliquot");
        }else{
            System.out.println("Not aliquot");
        }
    }
}
