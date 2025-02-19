package model;

import java.util.ArrayList;
import java.util.List;

public class Board {

	List<Chip> chipsInPlay;

	public Board() {
		chipsInPlay = new ArrayList<Chip>();
	}

	public boolean add(Chip chip) {
		return true;

	}

	public List<Chip> getBoard() {
		return chipsInPlay;
	}
}
