class CollatzCalculator {

    int computeStepCount(int start) {
        int tempVal = start;
        int steps = 0;
        if(start <= 0){throw new IllegalArgumentException("Only positive integers are allowed");}
        while (tempVal != 1 ){
            if(tempVal %2 == 0){
                tempVal /= 2;
            }else{
                tempVal = tempVal*3 + 1;
            }
            steps++;
        }
        return steps;
    }

}
