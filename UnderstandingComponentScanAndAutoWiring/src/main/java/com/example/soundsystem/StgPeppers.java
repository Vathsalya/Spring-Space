package com.example.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Component; Spring identifies this as a component class and specifies that a
 * bean should be created for this class
 * 
 * @author Vathsalya
 *
 */
//@Component("namedStgPeppers") //Named bean
@Component
public class StgPeppers implements CompactDisk {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public String play() {
		return ("Playing " + title + " by " + artist);
	}

}
