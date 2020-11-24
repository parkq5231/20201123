package Interfaces;

import java.rmi.Remote;

public class RemoteControlExample {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Television tv = new Television();

		audio.turnOn();
		audio.turnOff();

		tv.turnOn();
		tv.turnOff();

		RemoteControl rc = audio;
		rc.turnOn();
		rc.turnOff();

		rc = tv;
		rc.turnOn();
		rc.turnOff();
		
		
		
		
	}// end of main
}// end of class