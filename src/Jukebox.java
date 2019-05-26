
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements Runnable, ActionListener {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());
	}
JButton instanceB = new JButton("Three Beat Slide - Journey (Official Music Video) (1).mp3");
		JButton funN = new JButton("National Anthem of USSR.mp3");
		JPanel panel = new JPanel();
		JButton discoB = new JButton("Abba - Dancing Queen.mp3");
		JButton historyB = new JButton("Boney M. - Rasputin.mp3");
		JButton napoleonB = new JButton("Abba - Waterloo.mp3");
		JButton classicB = new JButton("a-ha - Take On Me (Official Music Video) (1).mp3");
		JButton MissisipiB = new JButton("Culture Club - Karma Chameleon (Official Video).mp3");
		JButton LifeB = new JButton("Dead Or Alive - You Spin Me Round (Like a Record) (Official Video).mp3");
		JButton elementsB = new JButton("Earth, Wind & Fire - September (Official Music Video).mp3");
		JButton rabbitB = new JButton("Echo and the Bunnymen - The Killing Moon (Official Music Video) (1).mp3");
		JButton newtownB = new JButton("Lipps Inc - Funky Town (1).mp3");
		JButton rapB = new JButton("MC Hammer - U Can't Touch This.mp3");
		JButton asiaB = new JButton("Murray Head - One Night In Bangkok From CHESS 2.mp3");
		JButton eightB = new JButton("Rick Astley - Never Gonna Give You Up (Video).mp3");
		JButton wakeB = new JButton("Wham! - Wake Me Up Before You Go-Go (Official Music Video).mp3");
		JButton russiaB = new JButton("Dschinghis Khan - Moskau 1979.mp3");
		JButton blackB = new JButton("ACDC - Back In Black (Official Music Video).mp3");
		JButton hellB = new JButton("ACDC - Highway to Hell (Official Video).mp3");
		JButton shookB = new JButton("ACDC - You Shook Me All Night Long (Official Video).mp3");
		JButton underB = new JButton("Men At Work - Down Under (Video).mp3");
		JButton loveB = new JButton("ABC - The Look Of Love.mp3");
		JButton pieB = new JButton("American Pie.mp3");
		JButton casbahB = new JButton("The Clash - Rock the Casbah (Official Video).mp3");
		JButton ruleB = new JButton("Tears For Fears - \"Everybody Wants To Rule The World\" - ORIGINAL VIDEO.mp3");
Song instance = new Song("Three Beat Slide - Journey (Official Music Video) (1).mp3");
		Song fun = new Song("National Anthem of USSR.mp3");
		Song disco = new Song("Abba - Dancing Queen.mp3");
		Song history = new Song("Boney M. - Rasputin.mp3");
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
		Song wake = new Song("Wham! - Wake Me Up Before You Go-Go (Official Music Video).mp3");
		Song Rave = new Song("Noisestorm - Crab Rave [Monstercat Release] (1).mp3");
		Song under = new Song("Men At Work - Down Under (Video).mp3");
		Song love = new Song("ABC - The Look Of Love.mp3");
		Song pie = new Song("American Pie.mp3");
		Song casbah = new Song("The Clash - Rock the Casbah (Official Video).mp3");
		Song rule = new Song("Tears For Fears - \"Everybody Wants To Rule The World\" - ORIGINAL VIDEO.mp3");

	public void run() {

		// 3. Find an mp3 on your computer or on the Internet.

		// 4. Create a Song
		
		// 5. Play the Song

		/*
		 * 6. Create a user interface for your Jukebox so that the user can to choose
		 * which song to play. You can use can use a different button for each song, or
		 * a picture of the album cover. When the button or album cover is clicked, stop
		 * the currently playing song, and play the one that was selected.
		*/
JFrame forbuttons = new JFrame();
instanceB.addActionListener(this);
		funN.addActionListener(this);
		discoB.addActionListener(this);
		historyB.addActionListener(this);
		napoleonB.addActionListener(this);
		classicB.addActionListener(this);
		MissisipiB.addActionListener(this);
		LifeB.addActionListener(this);
				elementsB.addActionListener(this);
		rabbitB.addActionListener(this);
		newtownB.addActionListener(this);
		rapB.addActionListener(this);
		asiaB.addActionListener(this);
		eightB.addActionListener(this);
		russiaB.addActionListener(this);
		blackB.addActionListener(this);
		hellB.addActionListener(this);
		shookB.addActionListener(this);

		wakeB.addActionListener(this);

		wakeB.addActionListener(this);

		loveB.addActionListener(this); 
		pieB.addActionListener(this);
		casbahB.addActionListener(this);
		forbuttons.add(panel);
		panel.add(instanceB);
		panel.add(funN);
		panel.add(discoB);
		panel.add(historyB);
		panel.add(napoleonB);
		panel.add(classicB);
		panel.add(MissisipiB);
		panel.add(LifeB);
		panel.add(elementsB);
		panel.add(rabbitB);
		panel.add(newtownB);
		panel.add(rapB);
		panel.add(asiaB);
		panel.add(eightB);
		panel.add(russiaB);
		panel.add(blackB);
		panel.add(hellB);
		panel.add(shookB);
		panel.add(wakeB);
		panel.add(underB);
		panel.add(loveB);
		panel.add(pieB);
		panel.add(casbahB);
		panel.add(ruleB);
		
		forbuttons.setVisible(true);
		forbuttons.pack();

	}

	private void Jlabel(String string) {
		// TODO Auto-generated method stub

	}

	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	JButton pressed = (JButton) e.getSource();
	if(pressed == instanceB) { instance.play();}
	if(pressed == funN) {fun.play();}
	if(pressed == historyB) {history.play();
	if(pressed == discoB) {disco.play();}
	if(pressed == napoleonB) {napoleon.play();}
	if(pressed == classicB)  {classic.play();}
	if(pressed == MissisipiB) {Missisipi.play();
	if(pressed == LifeB)  {Life.play();}
	if(pressed == elementsB) {elements.play();}
	if(pressed == rabbitB) {rabbit.play();}
	if(pressed == newtownB) {newtown.play();
	if(pressed == rapB) {rap.play();}
	if(pressed == asiaB) {asia.play();}
	if(pressed == eightB) {eight.play();}
	if(pressed == russiaB) {russia.play();}
	if(pressed ==   )
	}
	}
	panel.add(discoB);
	panel.add(historyB);
	panel.add(napoleonB);
	panel.add(classicB);
	panel.add(MissisipiB);
	panel.add(LifeB);
	panel.add(elementsB);
	panel.add(rabbitB);
	panel.add(newtownB);
	panel.add(rapB);
	panel.add(asiaB);
	panel.add(eightB);
	panel.add(russiaB);
	panel.add(blackB);
	panel.add(hellB);
	panel.add(shookB);
	panel.add(wakeB);
	panel.add(underB);
	panel.add(loveB);
	panel.add(pieB);
	panel.add(casbahB);
	panel.add(ruleB);
	// TODO Auto-generated method stub

	}

}

class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet addresses.
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
