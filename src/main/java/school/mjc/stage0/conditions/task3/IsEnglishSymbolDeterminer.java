package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public static void main(String[] args) {
        IsEnglishSymbolDeterminer g = new IsEnglishSymbolDeterminer();
        g.isEnglishSymbol((char)100);
    }
    
    public void isEnglishSymbol(char symbol) {
        if((char)symbol >= 32 && (char)symbol <= 126){
            System.out.println("English");
        }else{
            System.out.println("Non English");
        }
    }
}
