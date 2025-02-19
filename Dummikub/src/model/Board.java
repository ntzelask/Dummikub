package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Board {

	private static final int MAXIMUM_NUMBER_CHIPS = 106;
	private static Board singleton = null;

	private Map<Integer, Set<Character>> chipIndex;
	private List<Chip> chipsOnTable;

	public Board() {
		chipIndex = new HashMap<Integer, Set<Character>>(MAXIMUM_NUMBER_CHIPS);
		chipsOnTable = new ArrayList<Chip>();
	}

	public Map<Integer, Set<Character>> getBoard() {
		return chipIndex;
	}

	public static Board getInstance() {
		if (singleton == null) {
			singleton = new Board();
		}
		return singleton;
	}
	
	public boolean addChip(Chip chip) {
		chipsOnTable.add(chip);
		return true;
	}
}
