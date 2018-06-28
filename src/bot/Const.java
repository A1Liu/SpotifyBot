package bot;

import org.openqa.selenium.By;

public class Const {

	private Const() {

	}

	public final static String USERNAME1 = "user@gmail.com";
	public final static String PASSWORD1 = "password1";
	public final static String USERNAME2 = "user2@gmail.com";
	public final static String PASSWORD2 = "password2";

	public final static String SPOTIFY = "https://open.spotify.com/browse";

	public final static By TOP_CONTAINER = By.xpath("//div[@id='main']/div/div[4]");

		//Items on left bar
		public final static By NAV_BAR_CONTAINER = By.xpath("//div[@id='main']/div/div[4]/div[1]/nav");
		public final static By NAV_BAR_SEARCH = By.xpath("//div[@id='main']/div/div[4]/div[1]/nav/div[1]/ul/li[1]");
		public final static By NAV_BAR_HOME = By.xpath("//div[@id='main']/div/div[4]/div[1]/nav/div[1]/ul/li[2]");
		public final static By NAV_BAR_LIBRARY = By.xpath("//div[@id='main']/div/div[4]/div[1]/nav/div[1]/ul/li[3]");

		//Stuff in center
		public final static By MAIN_CONTAINER = By.xpath("//div[@id='main']/div/div[4]/div[2]");
		public final static By SEARCH = By.xpath("//div[@id='main']/div/div[4]/div[2]/div[1]/section/span/span/div/div/div/input");
		public final static By CONTENT = By.xpath("//div[@id='main']/div/div[4]/div[2]/div[1]/section");//Stuff under
			public final static By CONTENT_NAV = By.xpath("//div[@id='main']/div/div[4]/div[2]/div[1]/section/nav/ul");//Content Navigation, items are li elements
			public final static By CONTENT_ITEMS = By.xpath("//div[@id='main']/div/div[4]/div[2]/div[1]/section/div/div");//Songs
			public final static By CONTENT_TRACKLIST = By.xpath("//div[@id='main']/div/div[4]/div[2]/div[1]/section/div/div/section/section/ol");//elements are div
			public final static By PLAYLIST = By.xpath("//div[@id='main']/div/div[4]/div[2]/div[1]/div/section/div/div/div[2]/section/ol");//Elements are divs


	//Bottom Bar
	public final static By NOW_PLAYING_BAR = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']");


		//Left part
		public final static By NOW_PLAYING_LEFT = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[1]/div");
			public final static By NOW_PLAYING_INFO = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[1]/div/div");
			public final static By NOW_PLAYING_SONG_NAME = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[1]/div/div/div[1]");
			public final static By NOW_PLAYING_SONG_ARTISTS = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[1]/div/div/div[2]");//elements are spans, each one contains a span
			public final static By NOW_PLAYING_IN_LIBRARY = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[1]/div/button");

		public final static By NOW_PLAYING_CENTER = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div");
			public final static By NOW_PLAYING_BUTTONS = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div/div[1]");
				public final static By NOW_PLAYING_SHUFFLE = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div/div[1]/button[1]");
				public final static By NOW_PLAYING_PREVIOUS = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div/div[2]");
				public final static By NOW_PLAYING_PLAYPAUSE = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div/div[3]");
				public final static By NOW_PLAYING_NEXT = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div/div[4]");
				public final static By NOW_PLAYING_LOOP = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div/div[5]");

			public final static By NOW_PLAYING_PLAYBACK = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div/div[2]");
				public final static By NOW_PLAYING_PLAYBACK_PROGRESS = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div/div[2]/div[1]");
				public final static By NOW_PLAYING_PLAYBACK_BAR = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div/div[2]/div[2]");
				public final static By NOW_PLAYING_PLAYBACK_SONG_LENGTH = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[2]/div/div[2]/div[3]");

		public final static By NOW_PLAYING_RIGHT = By.xpath("//div[@id='main']/div/div[5]/span/span/footer/div[@class='now-playing-bar']/div[3]");




	public final static String NULL8 = "";
	public final static String NULL9 = "";
	public final static String NULL0 = "";
	public final static String NULL11 = "";
	public final static String NULL12 = "";
	public final static String NULL13 = "";


}
