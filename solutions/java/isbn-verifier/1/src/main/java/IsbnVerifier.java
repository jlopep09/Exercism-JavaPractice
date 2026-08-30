class IsbnVerifier {
    
    boolean isValid(String stringToVerify) {
        char[] codeArray = stringToVerify.replace("-","").trim().toCharArray();
        if(codeArray.length != 10){
            return false;
        }
        int tempMultiplier = 10;
        long operationResult = 0;
        for(int i = 0; i<codeArray.length; i++){
            if(i<9 && !Character.isDigit(codeArray[i])){return false;}
            if(i==9 && !(Character.isDigit(codeArray[i]) || codeArray[i]=='X')){return false;}
            if(i==9 && codeArray[i]=='X'){               
                operationResult += 10 * tempMultiplier;
            }else{                
                operationResult += Integer.valueOf(codeArray[i]+"") * tempMultiplier;
            }
            tempMultiplier -= 1;
        }
        operationResult %= 11;
        return operationResult == 0;
    }

}
