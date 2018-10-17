package com.contestantbots.util;

import com.scottlogic.hackathon.game.Route;

public class RouteImpl implements Comparable<Route> {

	@Override
	public int compareTo(Route o) {
		// TODO Auto-generated method stub
		return 0;
	}
	// private final Player player;
	// private final Position destination;
	// private final int distance;
	//
	// public RouteImpl(Player player, Position destination, int distance) {
	// this.player = player;
	// this.destination = destination;
	// this.distance = distance;
	// }
	//
	// public Player getPlayer() {
	// return player;
	// }
	//
	// public Position getDestination() {
	// return destination;
	// }
	//
	// public int getDistance() {
	// return distance;
	// }
	//
	// @Override
	// public int compareTo(Route o) {
	// return distance - ((RouteImpl) o).getDistance();
	// }
	//
	// private List<Route> generateRoutes(final GameState gameState, Set<Player> players, Set<Position> destinations) {
	// List<Route> routes = new ArrayList<>();
	// for (Position destination : destinations) {
	// for (Player player : players) {
	// int distance = gameState.getMap().distance(player.getPosition(), destination);
	// Route route = new Route(player, destination, distance);
	// routes.add(route);
	// }
	// }
	// return routes;
	// }
	//
	// private List<Move> assignRoutes(final GameState gameState, final Map<Player, Position> assignedPlayerDestinations, final List<Position> nextPositions, List<Route> routes) {
	// return routes.stream().filter(route -> !assignedPlayerDestinations.containsKey(route.getPlayer()) && !assignedPlayerDestinations.containsValue(route.getDestination())).map(route -> {
	// Optional<Direction> direction = gameState.getMap().directionsTowards(route.getPlayer().getPosition(), route.getDestination()).findFirst();
	// if (direction.isPresent() && canMove(gameState, nextPositions, route.getPlayer(), direction.get())) {
	// assignedPlayerDestinations.put(route.getPlayer(), route.getDestination());
	// return new MoveImpl(route.getPlayer().getId(), direction.get());
	// }
	// return null;
	// }).filter(move -> move != null).collect(Collectors.toList());
	// }
}