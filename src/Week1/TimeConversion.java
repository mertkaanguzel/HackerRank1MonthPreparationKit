package Week1;

public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here
        String[] parts = s.split(":");
        boolean isAM = parts[2].contains("AM");
        int hour = Integer.parseInt(parts[0]);
        int newHour = 0;
        if (hour == 12) {
            newHour = isAM ? 0 : 12;
        } else {
            newHour = isAM ? hour : (hour + 12);
        }

        String formattedNewHour = newHour < 9 ? ("0" + newHour) : Integer.toString(newHour);

        return formattedNewHour + ":" + parts[1] + ":" + parts[2].substring(0, 2);
    }
}
