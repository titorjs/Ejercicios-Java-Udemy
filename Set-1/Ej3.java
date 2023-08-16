public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        if (hours >= 0)
            return hours * 60;
        else
            return -1;
    }
    
    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        if (days >= 0)
            return days * 24 * 60;
        else
            return -1;
    }
}