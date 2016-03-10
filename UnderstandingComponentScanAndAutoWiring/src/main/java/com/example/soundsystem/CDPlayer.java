package com.example.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CDPlayer implements MediaPlayer {

	@Autowired
	private CompactDisk cDisk;
	
	@Autowired
	public CDPlayer(CompactDisk cDisk){
		this.cDisk = cDisk;
	}
	@Override
	public String play() {
		return cDisk.play();
	}

}
