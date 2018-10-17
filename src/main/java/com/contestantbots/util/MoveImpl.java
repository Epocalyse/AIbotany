package com.contestantbots.util;

import java.util.UUID;

import com.scottlogic.hackathon.game.Direction;
import com.scottlogic.hackathon.game.Move;

public class MoveImpl implements Move {
	private UUID playerId;
	private Direction direction;

	public MoveImpl(UUID playerId, Direction direction) {
		this.playerId = playerId;
		this.direction = direction;
	}

	@Override
	public UUID getPlayer() {
		return playerId;
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

	private boolean canMove(final GameState gameState, final List<Position> nextPositions, final Player player, final Direction direction) {
		Set<Position> outOfBounds = gameState.getOutOfBoundsPositions();
		Position newPosition = gameState.getMap().getNeighbour(player.getPosition(), direction);
		if (!nextPositions.contains(newPosition)
				&& !outOfBounds.contains(newPosition)) {
			nextPositions.add(newPosition);
			return true;
		} else {
			return false;
		}
	}
}