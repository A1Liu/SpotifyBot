package bot;

import java.util.ArrayList;

/**
 * Represents a song in spotify. Contains methods to compare a given song to another given song
 * @author aliu
 *
 */
public class Song {

	private String songName;
	private ArrayList<String> writers;
	private int seconds;
	
	public Song(String title, String time, ArrayList<String> writers) {
		this.writers = writers;
		this.songName = title;
		this.seconds = Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);//Should I add a check for hours? Nah probably not
	}
	
	public Song(String title, String time, String... writers) {
		this.writers = new ArrayList<String>();
		for (String writer : writers) {
			this.writers.add(writer);
		}
		this.songName = title;
		this.seconds = Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);//Should I add a check for hours? Nah probably not
	}
	
	public Song(String title, String writers, String time) {
		this.writers = new ArrayList<String>();
		for (String elem : writers.trim().split(", ")) {
			this.writers.add(elem.trim());
		}
		this.songName = title;
		this.seconds = Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);//Should I add a check for hours? Nah probably not
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

}
