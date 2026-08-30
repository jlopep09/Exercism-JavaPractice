import java.util.List;
class SqueakyClean {
    static String clean(String identifier) {
        //Task 1 " " -> "-"
        if(identifier == null){throw new IllegalArgumentException("idetifier must not be null");}
        char[] indentifierArray = identifier.replace(" ", "_").toCharArray();
        for(int i = 0; i< indentifierArray.length;i++){
            if(indentifierArray[i]==('-') && i<indentifierArray.length-1){
                indentifierArray[i+1] = Character.toUpperCase(indentifierArray[i+1]);
                indentifierArray[i] = ' ';
            }
        }
        StringBuilder sb = new StringBuilder();
        List<Character> notLetterValidChars = List.of('0', '1', '2', '3', '4', '7', '!', '¡', '_');
        for(char c:indentifierArray ){
            if(Character.isLetter(c) || notLetterValidChars.contains(c)){
             sb.append(c);
            }
        }
        String tempResult = sb.toString();
        
        tempResult = tempResult
            .replace("0","o")
            .replace("1","l")
            .replace("3","e")
            .replace("4","a")
            .replace("7","t")
            .replace("!","")
            .replace("¡","");
        return tempResult;
    }
}
