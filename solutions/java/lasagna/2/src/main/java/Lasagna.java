public class Lasagna {
    private static final int TIME_PER_LAYER = 2;
    private static final int DEFAULT_MINUTES_IN_OVEN = 40;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){return DEFAULT_MINUTES_IN_OVEN;}
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int MinutesInOven){return expectedMinutesInOven() - MinutesInOven;}
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return (this.TIME_PER_LAYER * layers);
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven){
        return (preparationTimeInMinutes(layers) + minutesInOven);
    }
}
