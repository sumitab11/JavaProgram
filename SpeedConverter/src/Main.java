public class Main {
    public static void main(String[] args) {
        double kilometersPerHour=10.5;
        long miles = SpeedConverter.toMilesPerHour(kilometersPerHour);
        System.out.println("miles = " + miles);
        SpeedConverter.printConversion(kilometersPerHour);
    }
}
