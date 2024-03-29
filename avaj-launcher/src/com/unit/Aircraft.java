
package com.unit;

public class Aircraft {

	private static long idCounter;

	protected long id;
	protected String name;
	protected Coordinates coordinates;

	static {

		idCounter = 0;
	}

	protected Aircraft(String name, Coordinates coordinates) {

		this.id = nextId();
		this.name = name;
		this.coordinates = coordinates;
	}

	private long nextId() {

		return idCounter++;
	}

	protected void landMsg() {

		System.out.println(String.format("LANDING: %s (%d) landed at %d LO, %d LA",
			name, id, coordinates.getLongitude(), coordinates.getLatitude()));
	}
}
