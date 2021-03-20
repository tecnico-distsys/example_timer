package pt.tecnico.timer;

import java.util.Timer;

/** Main program class. */
public class Main {

	/** The program starts with this method. */
	public static void main(String[] args) throws Exception {

		System.out.println(Main.class + " starting...");

		// Create arguments for timer. 
		// In this program it is just an arbitrary value.
		Object argument = Integer.valueOf(22);

		// Create timer object.
		// Set it as a daemon so the JVM does not wait for it when quitting.
		Timer timer = new Timer(/*isDaemon*/ true);

		// Create timer task object.
		MyTimerTask myTimerTask = new MyTimerTask(argument);

		timer.schedule(myTimerTask, /*delay*/ 0 * 1000, /*period*/ 3 * 1000);

		// Sleep 10 seconds, then finish.
		Thread.sleep(10 * 1000);

		System.out.println(Main.class + " finished.");
	}

}
