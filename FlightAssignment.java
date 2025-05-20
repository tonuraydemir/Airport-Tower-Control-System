package model;

public class FlightAssignment {
    private int id;
    private int flightId;
    private int controllerId;
    private String assignmentTime;

    public FlightAssignment(int id, int flightId, int controllerId, String assignmentTime) {
        this.id = id;
        this.flightId = flightId;
        this.controllerId = controllerId;
        this.assignmentTime = assignmentTime;
    }

    public int getId() { return id; }
    public int getFlightId() { return flightId; }
    public int getControllerId() { return controllerId; }
    public String getAssignmentTime() { return assignmentTime; }
}