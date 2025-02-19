package controller;

import java.util.ArrayList;
import java.util.List;

import model.Board;
import model.Chip;

public class Algorithm {
	private Board board;
	private ArrayList<Chip> playable;

	public Algorithm(Board board) {
		this.board = board;
		playable = new ArrayList<Chip>();
	}

	public Board mainAlg(List<Chip> hand) {
		isPlayable(hand);
		return null;

	}

	private void isPlayable(List<Chip> hand) {
		if (hand.isEmpty()) {
			return;
		} else if (board.getBoard().isEmpty()) {
			return;
		}

		for (int i = 0; i < hand.size(); i++) {
			Chip h = hand.get(i);
			
		}

//		for (int i = 0; i < hand.size(); i++) {
//			for (int j = 0; j < board.getBoard().size(); j++) {
//				Chip h = hand.get(i);
//				Chip b = board.getBoard().get(j);
//
//				if (h.getNum() == b.getNum() || h.getNum() == b.getNum() + 1 || h.getNum() == b.getNum() - 1) {
//					playable.add(h);
//				}
//			}
//		}
	}
}
