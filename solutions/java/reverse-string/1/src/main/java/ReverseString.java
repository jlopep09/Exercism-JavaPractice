class ReverseString {

    String reverse(String inputString) {
        char[] inputArray = inputString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c: inputArray){
            sb.insert(0, c);
        }
        return sb.toString();
    }
  
}
