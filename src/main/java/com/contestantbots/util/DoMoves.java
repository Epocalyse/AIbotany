package com.contestantbots.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.scottlogic.hackathon.game.Direction;
import com.scottlogic.hackathon.game.GameState;
import com.scottlogic.hackathon.game.Move;
import com.scottlogic.hackathon.game.Player;

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

}
