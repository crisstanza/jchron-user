package io.github.crisstanza;

import io.github.crisstanza.jchron.JChron;

public final class Main {

	private Main() {
	}

	public static final void main(final String[] args) {
		System.out.println("[start]");
		JChron jc = new JChron();
		jc.start();
		sleep(1.5);
		jc.stop();
		System.out.println("	" + jc.read());
		System.out.println("[/start]");
	}

	private static final void sleep(double seconds) {
		try {
			Thread.sleep((long) (seconds * 1000));
		} catch (InterruptedException exc) {
			// nothing to do!
		}
	}

}
