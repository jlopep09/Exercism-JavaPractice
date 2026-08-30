
class BirdWatcher {
    private final int[] birdsPerDay;
    private static int[] lastWeekBirds = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return lastWeekBirds;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;;
    }

    public boolean hasDayWithoutBirds() {
        for(int dayCount: birdsPerDay){
            if (dayCount == 0){return true;}
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for(int i = 0; i< numberOfDays && i< birdsPerDay.length; i++){
            count+= birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for(int dayCount: birdsPerDay){
            if (dayCount >= 5){count++;}
        }
        return count;
    }
}
