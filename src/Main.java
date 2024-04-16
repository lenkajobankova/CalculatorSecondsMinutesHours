public class Main {
    public static void main(String[] args) {

    System.out.println(getDurationString(7236));
}

    public static String getDurationString(int seconds){
        if (seconds >= 0) {

            int minutes = seconds / 60;
            int calculatedSeconds;

            if (seconds >= 60) {
                calculatedSeconds = seconds % 60;
            } else {
                calculatedSeconds = seconds;
            }

            return getDurationString(minutes, calculatedSeconds);
        } else {
            return "Invalid input";
        }
    }
    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {

            int calculatesSeconds = seconds;
            int calculatedMinutes = minutes;
            int calculatedHours;

            calculatedHours = calculatedMinutes / 60;
            calculatedMinutes = calculatedMinutes % 60;

            return calculatedHours + "h " + calculatedMinutes + "m " + calculatesSeconds + "s";
        } else {
            return "Invalid input";
        }
    }
}
