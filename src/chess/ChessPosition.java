package chess;

import boardgame.Position;

public class ChessPosition {
	
	private int row;
	private char column;
	public ChessPosition(char colum, int row) {
		if (colum < 'a' || colum > 'h' || row < 1 || row > 8 ) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
			 
		this.column = colum;
		this.row = row;
	}
	public char getColum() {
		return column;
	}
	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
