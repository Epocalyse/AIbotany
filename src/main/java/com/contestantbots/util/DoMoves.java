package com.contestantbots.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.scottlogic.hackathon.game.Direction;
import com.scottlogic.hackathon.game.GameState;
import com.scottlogic.hackathon.game.Move;
import com.scottlogic.hackathon.game.Player;
import com.scottlogic.hackathon.game.Position;

public class DoMoves {
	UUID playerID;
	GameState gameState;

	public DoMoves(final GameState gameState, UUID playerID) {
		this.playerID = playerID;
		this.gameState = gameState;
	}

	@SuppressWarnings("unused")
	private List<Move> doExplore() {
		List<Move> exploreMoves = new ArrayList<>();

		exploreMoves.addAll(gameState.getPlayers().stream().map(player -> new MoveImpl(player.getId(), Direction.NORTH)).collect(Collectors.toList()));

		System.out.println(exploreMoves.size() + " players exploring");
		return exploreMoves;
	}

	public List<Move> goEast() {

		List<Move> eastMoves = new ArrayList<>();

		for (Player bot : this.gameState.getPlayers()) {
			if (bot.getOwner() == this.playerID) {
				eastMoves.add(new MoveImpl(bot.getId(), Direction.EAST));
			}
		}

		return eastMoves;
	}

	public List<Move> goRandom() {
		List<Move> randomMoves = new ArrayList<>();

		for (Player bot : this.gameState.getPlayers()) {
			if (bot.getOwner() == this.playerID) {

				MoveImpl nextMove = new MoveImpl(bot.getId(), Direction.random());
				Direction move = Direction.random();

				Position nextPosition = gameState.getMap().getNeighbour(bot.getPosition(), move);

				int moveTimeout = 50;
				int moveTries = 0;

				while (!(gameState.getPlayerAt(nextPosition).isEmpty()) && moveTries != moveTimeout) {
					nextMove = new MoveImpl(bot.getId(), Direction.random());
					moveTries++;

				}

				randomMoves.add(nextMove);

			}
		}

		return randomMoves;
	}

}
