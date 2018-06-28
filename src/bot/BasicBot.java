package bot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static debug.Debug.*;
import static bot.Const.*;

/**
 * Contains methods to do things on spotify
 * @author aliu
 *
 */
public class BasicBot {
	
	/**
	 * Table of contents: <br>
	 * 1. {@link BasicBot#publicAPI()} <br>
	 * 2. {@link BasicBot#protectedWrapperUtility()} <br>
	 * 3. {@link BasicBot#privateWrapper()} <br>
	 * 4. {@link BasicBot#privateUtility()} <br>
	 * 5. {@link BasicBot#gettersSetters()} <br>
	 * 
	 */
	@SuppressWarnings("unused")
	private void toc() {publicAPI();protectedWrapperUtility();privateWrapper();privateUtility();gettersSetters();}

	private boolean shuffle;
	private int loopState;
	private Song current;
	private int explicitWait;
	private WebDriver webDriver;
	private int loginTime;
	private int implicitWait;
	
	public BasicBot() {
		this(new ChromeDriver(), 5, 30);
	}
	
	public BasicBot(WebDriver webDriver, int explicitWait, int loginTime) {
		this.webDriver = webDriver;
		this.explicitWait = explicitWait;
		this.loginTime = loginTime;
		this.implicitWait = 5;
	}
	
/*
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------   Public API Methods --------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	
	private void publicAPI() {}
	
	/**
	 * Logs in. Waits for a specific amount of time so that the user can handle captcha requests
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		webDriver.get(SPOTIFY);
		this.findElement(By.id("has-account")).click();
		this.driverWait().until(ExpectedConditions.urlContains("accounts.spotify.com"));
		WebElement loginField = this.findElement(By.id("login-username"));
		loginField.clear();
		loginField.sendKeys(username);
		this.findElement(By.id("login-password")).sendKeys(password);
		this.findElement(By.id("login-button")).click();
		slp(5);
		this.driverWait(loginTime).until(ExpectedConditions.urlContains("https://open.spotify.com/"));
		slp(5);
		update();
	}
	
	/**
	 * 
	 */
	public void update() {//TODO:
		String songname = webDriver.findElement(NOW_PLAYING_SONG_NAME).getText();
		ArrayList<String> writers = new ArrayList<String>();
		List<WebElement> artists = webDriver.findElement(NOW_PLAYING_SONG_ARTISTS).findElements(By.xpath("./span"));
		for (WebElement elem : artists)
			writers.add(elem.findElement(By.xpath("./span")).getText());
		current = new Song(songname, findElement(NOW_PLAYING_PLAYBACK_SONG_LENGTH).getText(), writers);
		
	}
	
	/**
	 * 
	 * @param song
	 */
	public void play(Song song) {
		search(song.getSongName());
	}
	
	public void playFrom(String playlistName) {
		
	}
	
	public void shuffleOn() {
		
	}
	
	public void shuffleOff() {
			
	}
	
	public void noLoop() {
		
	}
	
	public void loop() {
			
	}
	
	public void loopSong() {
		
	}
	
	public void skip() {
		
	}
	
	public void restart() {
		
	}
	
	public void lastSong() {
		
	}
/*
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------   Protected Wrapper/Utility Methods -----------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	
	private void protectedWrapperUtility() {}
	
	protected void toggleShuffle() {
		
	}

	protected void toggleLoop() {
		
	}
	
	/**
	 * Goes to the search screen and searches for something
	 * @param search
	 */
	protected void search(String search) {
		findElement(NAV_BAR_SEARCH).click();
		WebElement searchBar = findElement(Const.SEARCH);
		searchBar.sendKeys(search);
		searchBar.submit();
	}
	
	
/*
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------   Private Wrapper Methods ---------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	
	private void privateWrapper() {}
	
	/**
	 * Returns a list of the user's playlists
	 * @return
	 */
	private List<PlaylistElement> getPlaylists() {
		return null;
	}
	
	/**
	 * Opens a playlist
	 * @param name
	 */
	private void openPlaylist(String name) {
		
	}
	
	/**
	 * Opens the page of a certain playlist
	 * @param p
	 */
	private void openPlaylist(PlaylistElement p) {
		
	}
	
	/**
	 * gets the song assicated with a certain row of the table
	 * @param songRow
	 * @return
	 */
	private Song getSong(WebElement songRow) {//TODO: move this method to the SongElement class
		return null;
	}
	
	/**
	 * Searches through the list the bot is looking at to find the song it 
	 * @param song
	 * @return
	 */
	private SongElement searchFor(Song song) {
		return null;
	}
	
	

/*
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------   Private Utility Methods ---------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	
	private void privateUtility() {}
	
	private void setup() {
		webDriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
	}
	
	/**
	 * Find an element using the webDriver
	 * @param identifier how to find the element
	 * @return the element
	 */
	private WebElement findElement(By identifier) {
		return webDriver.findElement(identifier);
	}
	
	/**
	 * Find a list of elements using the webDriver
	 * @param identifier how to find the element
	 * @return the element
	 */
	private List<WebElement> findElements(By identifier) {
		return webDriver.findElements(identifier);
	}
	
	/**
	 * Waits for an element to be clickable for as long as the explicit wait variable is set for
	 * @param identifier what to look for
	 * @return the element
	 */
	private WebElement waitForElement(By identifier) {
		return waitForElement(explicitWait, identifier);
	}
	
	/**
	 * Waits for an element to be clickable for a specified amount of time
	 * @param time how long to wait for
	 * @param identifier what to look for
	 * @return the element
	 */
	private WebElement waitForElement(long time,By identifier) {
		return driverWait(time).until(ExpectedConditions.elementToBeClickable(identifier));
	}
	
	/**
	 * returns a new WebDriverWait Object for however much time the explicit wait variable is set for
	 * @return a WebDriverWait Object
	 */
	private WebDriverWait driverWait() {
		return driverWait(explicitWait);
	}
	
	/**
	 * returns a new WebDriverWait Object for a specified amount of time
	 * @param time how long to wait
	 * @return a WebDriverWait Object
	 */
	private WebDriverWait driverWait(long time) {
		return new WebDriverWait(webDriver,time);
	}
	
/*
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------   Getters and Setters -------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	
	private void gettersSetters() {}

	public String getLoopState() {
		switch(loopState) {
		case 0:
			return "Not in loop.";
		case 1:
			return "Loop playlist.";
		default:
			return "Loop song.";
		}
	}

	public boolean isShuffle() {
		return shuffle;
	}

	/**
	 * @return the current
	 */
	public Song getCurrent() {
		return current;
	}

	/**
	 * @param current the current to set
	 */
	public void setCurrent(Song current) {
		this.current = current;
	}

	/**
	 * @return the explicitWait
	 */
	public int getExplicitWait() {
		return explicitWait;
	}

	/**
	 * @param explicitWait the explicitWait to set
	 */
	public void setExplicitWait(int explicitWait) {
		this.explicitWait = explicitWait;
	}

	/**
	 * @return the webDriver
	 */
	protected WebDriver getWebDriver() {
		return webDriver;
	}

	/**
	 * @param webDriver the webDriver to set
	 */
	protected void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	/**
	 * @return the loginTime
	 */
	public int getLoginTime() {
		return loginTime;
	}

	/**
	 * @param loginTime the loginTime to set
	 */
	public void setLoginTime(int loginTime) {
		this.loginTime = loginTime;
	}
	
	

}
