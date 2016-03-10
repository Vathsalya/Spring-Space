package com.example.soundsystem.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.soundsystem.CDPlayerConfig;
import com.example.soundsystem.CompactDisk;
import com.example.soundsystem.MediaPlayer;

/**
 * A test method asserts that the cDisk property isn’t null. If it’s not null,
 * that means Spring was able to discover the CompactDisc class, automatically
 * create it as a bean in the Spring application context, and inject it into the
 * test.
 * 
 * @author Vathsalya
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

	@Autowired
	private MediaPlayer player;

	@Autowired
	CompactDisk cDisk;

	@Test
	public void test() {
		assertNotNull(cDisk);
	}

	@Test
	public void play() {
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" + " by The Beatles", player.play());
	}

}
