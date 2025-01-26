package day06.problem_statement.ride_hailing;


// Interface GPS for managing vehicle location
public interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
