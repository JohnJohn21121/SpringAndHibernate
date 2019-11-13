package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {
	// create the object
    Coach theTCoach = new TrackCoach();
    Coach theBcoach = new BaseballCoach();

    //Use The object
        System.out.println(theTCoach.getDailyWorkout());
        System.out.println(theBcoach.getDailyWorkout());
    }
}
