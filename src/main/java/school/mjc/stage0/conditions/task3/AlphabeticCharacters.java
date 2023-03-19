package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public char[] c = new char[] {65,69,73,79,85,97,101,105,108,117,121};
    public static void main(String[] args) {
        AlphabeticCharacters g = new AlphabeticCharacters();
        g.vowelDeterminer(g, (char)85);
    }
    public void vowelDeterminer(AlphabeticCharacters g, char character) {
        if(isEnglishSymbol(character)){
            if(g.isVowelSymbol(g, character)){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");  
            }
        }else{
                System.out.println("wrong alphabet!");
        }
    
    }
    
    public boolean isEnglishSymbol(char symbol) {
        if((char)symbol >= 32 && (char)symbol <= 126){
            return true;
        }else{
            return false;
        }
    }
    public boolean isVowelSymbol(AlphabeticCharacters g, char symbol) {
        for(int i = 0; i < g.c.length; i++){
            if((char)symbol == g.c[i]){
                return true;
            }
        }
        return false;
    }
   
}
