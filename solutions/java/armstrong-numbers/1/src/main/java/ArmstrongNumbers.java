class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        if(numberToCheck == 0){return true;}
        String stringNumber = numberToCheck +"";
        char[] digitArray = stringNumber.toCharArray();
        int digitCount = digitArray.length;
        int count = 0;
        for(char c: digitArray){
            count += Math.pow(Character.getNumericValue(c), digitCount);
        }
        return numberToCheck==count;
        

    }

}
