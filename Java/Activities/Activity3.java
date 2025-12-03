package activities;

public class Activity3 {

 
    public static final double EARTH_YEAR_SECONDS = 31557600;

    public static void main(String[] args) {

        double seconds = 1_000_000_000;

        System.out.println("Age on Earth:   " + ageOnPlanet(seconds, 1.0));
        System.out.println("Age on Mercury: " + ageOnPlanet(seconds, 0.2408467));
        System.out.println("Age on Venus:   " + ageOnPlanet(seconds, 0.61519726));
        System.out.println("Age on Mars:    " + ageOnPlanet(seconds, 1.8808158));
        System.out.println("Age on Jupiter: " + ageOnPlanet(seconds, 11.862615));
        System.out.println("Age on Saturn:  " + ageOnPlanet(seconds, 29.447498));
        System.out.println("Age on Uranus:  " + ageOnPlanet(seconds, 84.016846));
        System.out.println("Age on Neptune: " + ageOnPlanet(seconds, 164.79132));
    }

   
    public static double ageOnPlanet(double seconds, double orbitalPeriodInEarthYears) {
        double age = seconds / (EARTH_YEAR_SECONDS * orbitalPeriodInEarthYears);
        return Math.round(age * 100.0) / 100.0; 
    }
}
