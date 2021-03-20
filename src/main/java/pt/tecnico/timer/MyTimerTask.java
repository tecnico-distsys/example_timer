package pt.tecnico.timer;

import java.util.TimerTask;

/** Timer task. */
public class MyTimerTask extends TimerTask {

	/** Placeholder for the task argument object. */
	Object argument;

	public MyTimerTask(final Object argument) {
		this.argument = argument;
	}

	/** The run method defines what the program does when the timer is activated. */
	@Override
	public void run() {
		System.out.println(this.getClass() + " running...");

		// Read argument (can be any object).
		final Integer arg = (Integer) this.argument;

		// Do something...
		System.out.println("Received argument: " + arg);
	}

}
