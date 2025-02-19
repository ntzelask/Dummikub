package model;

public class Chip {
	private char color;
	private int num;

	public Chip(int num, char color) {
		setNum(num);
		setColor(color);
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
