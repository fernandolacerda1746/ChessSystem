package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece{

	public Knight(Board board, Color color) {
		
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		
		return "C"; //Refer to "C"to Cavalry instead "K" for Knight, because K is used in King Piece
		
	}
	
	private boolean canMove(Position position) {
		
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
		
	}

	@Override
	public boolean[][] possibleMoves() {
		
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		//L Movement Left (1 Row and 2 Columns) Above
		p.setValues(position.getRow() - 1, position.getColumn() - 2);
		if(getBoard().positionExists(p) && canMove(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//L Movement Left (2 Rows and 1 Column) Above
		p.setValues(position.getRow() - 2, position.getColumn() - 1);
		if(getBoard().positionExists(p) && canMove(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//L Movement Left(1 Row and 2 Columns) Below
		p.setValues(position.getRow() - 1, position.getColumn() + 2);
		if(getBoard().positionExists(p) && canMove(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//L Movement Left(2 Rows and 1 Column) Below
		p.setValues(position.getRow() - 2, position.getColumn() + 1);
		if(getBoard().positionExists(p) && canMove(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//L Movement Right(1 Row and 2 Columns) Above
		p.setValues(position.getRow() + 1, position.getColumn() - 2);
		if(getBoard().positionExists(p) && canMove(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//L Movement Right(2 Rows and 1 Column) Above
		p.setValues(position.getRow() + 2, position.getColumn() - 1);
		if(getBoard().positionExists(p) && canMove(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//L Movement Right(1 Row and 2 Columns) Below
		p.setValues(position.getRow() + 1, position.getColumn() + 2);
		if(getBoard().positionExists(p) && canMove(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//L Movement Right(2 Rows and 1 Column) Below
		p.setValues(position.getRow() + 2, position.getColumn() + 1);
		if(getBoard().positionExists(p) && canMove(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		return mat;
		
	}
	
	

}
