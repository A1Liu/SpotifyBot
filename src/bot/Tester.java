package bot;

import static bot.Const.*;
import static debug.Debug.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import runner.Runner;

public class Tester extends Runner {

	BasicBot bot;
	
	public static void main(String...args) {
		launch(args);
	}
	

	@Override
	public void start(String... args) throws Exception {
		bot = new BasicBot();
		bot.login(USERNAME1, PASSWORD1);
		bot.search("hello");
		slp(5);
		
		
	}

}
