import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Atbash {

    private ArrayList<Character> alphabet = new ArrayList<>(
    Arrays.asList(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
        'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y', 'z'
        )
    );
    private ArrayList<Character> cypherAlphabet;
    public Atbash() {
        this.cypherAlphabet = new ArrayList(this.alphabet);
        Collections.reverse( this.cypherAlphabet);
    }
    String encode(String input) {
        StringBuilder sb = new StringBuilder();
        int spaceCount = 0;
        for(char c: input.trim().replace(" ","").toCharArray()){
            if(spaceCount == 5){sb.append(" ");spaceCount=0;}
            if(Character.isLetter(c)){
                sb.append(cypherAlphabet.get(alphabet.indexOf(Character.toLowerCase(c))));
            }else{
                if(!Character.isDigit(c)){
                    continue;
                }
                sb.append(c);
            }
            spaceCount ++;
        }
        return sb.toString().trim();
    }

    String decode(String input) {
        StringBuilder sb = new StringBuilder();
        
        for(char c: input.trim().replace(" ","").toCharArray()){
            if(Character.isLetter(c)){
                sb.append(alphabet.get(cypherAlphabet.indexOf(Character.toLowerCase(c))));
            }else{
                if(!Character.isDigit(c)){
                    continue;
                }
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

}
