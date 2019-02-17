/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements Runnable {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());
	}

           public void run() {

		// 3. Find an mp3 on your computer or on the Internet.
        	   
		// 4. Create a Song
        	    Song instance = new Song("Three Beat Slide - Journey (Official Music Video) (1).mp3") ; 
        	    Song fun = new Song("National Anthem of USSR.mp3");
        	    Song disco = new Song("Abba - Dancing Queen.mp3");
        	    Song history = new Song("Boney M.- Rasputin.mp3");
        	    Song napoleon = new Song("Abba - Waterloo.mp3");
        	    Song classic = new Song("a-ha - Take On Me (Official Music Video) (1).mp3");
        	    Song Missisipi = new Song("Culture Club - Karma Chameleon (Official Video).mp3");
        	    Song Life = new Song("Dead Or Alive - You Spin Me Round (Like a Record) (Official Video).mp3");
        	    Song elements = new Song("Earth, Wind & Fire - September (Official Music Video).mp3");
        	    Song rabbit = new Song("Echo and the Bunnymen - The Killing Moon (Official Music Video) (1).mp3");
        	    	Song newtown = new Song("Lipps Inc - Funky Town (1).mp3");
        	    Song rap = new Song("MC Hammer - U Can't Touch This.mp3");
        	    Song asia = new Song("Murray Head - One Night In Bangkok From CHESS 2.mp3");
        	    Song eight = new Song("Rick Astley - Never Gonna Give You Up (Video).mp3");
        	    Song russia = new Song("Dschinghis Khan - Moskau 1979.mp3");
        	    Song black = new Song("ACDC - Back In Black (Official Music Video).mp3");
        	    Song hell = new Song("ACDC - Highway to Hell (Official Video).mp3");
        	    Song shook = new Song("ACDC - You Shook Me All Night Long (Official Video).mp3");
        	   
        	    // 5. Play the Song
        	     
        	    disco.play();
		/*
		 * 6. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 */
          }
	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}

class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet
	 * addresses.
	 * 
	 * Examples: <code> 
	 * 		new Song("everywhere.mp3"); 	//from default package 
	 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	 * </code>
	 */
	public Song(String songAddress) {
		this.songAddress = songAddress;
	}

	public void play() {
		loadFile();
		if (songStream != null) {
			loadPlayer();
			startSong();
		} else
			System.err.println("Unable to load file: " + songAddress);
	}

	public void setDuration(int seconds) {
		this.duration = seconds * 100;
	}

	public void stop() {
		if (mp3Player != null)
			mp3Player.close();
	}

	private void startSong() {
		Thread t = new Thread() {
			public void run() {
				try {
					if (duration > 0)
						mp3Player.play(duration);
					else
						mp3Player.play();
				} catch (Exception e) {
				}
			}
		};
		t.start();
	}

	private void loadPlayer() {
		try {
			this.mp3Player = new AdvancedPlayer(songStream);
		} catch (Exception e) {
		}
	}

	private void loadFile() {
		if (songAddress.contains("http"))
			this.songStream = loadStreamFromInternet();
		else
			this.songStream = loadStreamFromComputer();
	}

	private InputStream loadStreamFromInternet() {
		try {
			return new URL(songAddress).openStream();
		} catch (Exception e) {
			return null;
		}
	}

	private InputStream loadStreamFromComputer() {
		try {
			return new FileInputStream(songAddress);
		} catch (FileNotFoundException e) {
			return this.getClass().getResourceAsStream(songAddress);
		}
	}
}

