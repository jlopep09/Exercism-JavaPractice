import java.math.BigInteger;

class Grains {
    private static final int TOTAL_BOARD_CELLS = 64;

    BigInteger grainsOnSquare(final int square) {
        if(square <=0 || square > TOTAL_BOARD_CELLS){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return calculateGrainsAndCount(square)[0];
    }

    BigInteger grainsOnBoard() {
        return calculateGrainsAndCount(TOTAL_BOARD_CELLS)[1];
    }

    private BigInteger[] calculateGrainsAndCount(int square){
        BigInteger[] result = new BigInteger[2];
        BigInteger count = BigInteger.valueOf(1);
        BigInteger lastCellCount = BigInteger.valueOf(1);
        for(int i = 1; i<square; i++){
            count = count.add(lastCellCount.add(lastCellCount));
            lastCellCount = lastCellCount.add(lastCellCount);
        }
        result[0] = lastCellCount;
        result[1] = count;
        return result;
    }
    

}
