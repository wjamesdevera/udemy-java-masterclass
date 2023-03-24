public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(12000));
        System.out.println(getDurationString(60, 12000));
    }

    public static String getDurationString(int second) {
        int hour = second/3600;
        int minute = (second%3600)/60;
        second = minute%60;
        return (hour + "h " + minute + "m " + second + "s");
    }

    public static String getDurationString(int minute, int second) {
        int hour = (minute/60 + second/3600);
        minute = (second%3600)/60 + minute%60;
        second = second%60;
        return (hour + "h " + minute + "m " + second + "s");
    }
}