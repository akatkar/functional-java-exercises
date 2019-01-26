package com.akatkar.functional.exercises.samples.optionalgps;

import java.util.Optional;

/**
 *
 * @author Ali Katkar
 */
public class GPSData {

    private Position position;

    public GPSData() {
    }

    public GPSData(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
    
    private static String getDirection(GPSData gpsData){
        
        return Optional .ofNullable(gpsData)
			.map(GPSData::getPosition)
			.flatMap(Position::getLatitude)
			.map(Latitude::getDirection)
			.orElse("None");
    }
    
    public static void main(String[] args) {
        
        GPSData gps = null;
        System.out.println(getDirection(gps));
        
        gps = new GPSData(new Position());
        System.out.println(getDirection(gps));
        
        Position position = new Position();
        gps.setPosition(position);
        System.out.println(getDirection(gps));
        
        Latitude latitude = new Latitude();
        gps.getPosition().setLatitude(latitude);
        System.out.println(getDirection(gps));
    }
}

class Position {
    private Latitude latitude;

    public Position(Latitude latitude) {
        this.latitude = latitude;
    }

    public Position() {
    }

    public Optional<Latitude> getLatitude() {
        
        return Optional.ofNullable(latitude);
    }

    public void setLatitude(Latitude latitude) {
        this.latitude = latitude;
    }
}

class Latitude {
    private String direction = "this way";

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
