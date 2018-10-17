package com.contestantbots.util;

import com.scottlogic.hackathon.game.Player;
import com.scottlogic.hackathon.game.Position;
import com.scottlogic.hackathon.game.Route;

public class RouteImpl implements Comparable<Route> {
	private final Player player;
	private final Position destination;
	private final int distance;

	public RouteImpl(Player player, Position destination, int distance) {
		this.player = player;
		this.destination = destination;
		this.distance = distance;
	}

	public Player getPlayer() {
		return player;
	}

	public Position getDestination() {
		return destination;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public int compareTo(Route o) {
		return distance - ((RouteImpl) o).getDistance();
	}
}