import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class HighScores {
    List<Integer> highScores;
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        return this.highScores.get(this.highScores.size()-1);
    }

    Integer personalBest() {
        int best = 0;
        for(int score: highScores){
            best = score>best? score: best;
        }
        return Integer.valueOf(best);
    }

    List<Integer> personalTopThree() {
        ArrayList<Integer> top3 = new ArrayList<Integer>();
        for(int score: highScores){
            if(top3.size()<3){
                top3.add(score);
            }else{
                Collections.sort(top3);
                if(top3.get(0)<score){
                    top3.remove(0);
                    top3.add(0,Integer.valueOf(score));
                }
            }
        }
        Collections.sort(top3, Collections.reverseOrder());
        return top3;
    }

}
