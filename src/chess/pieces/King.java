package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		
		return "K";
		
	}
	
	private boolean canMove(Position position) {
		
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
		
	}

	@Override
	public boolean[][] possibleMoves() {
		
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		//Above the Piece
		p.setValues(position.getRow() - 1, position.getColumn());
		if(getBoard().positionExists(p) && canMove(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//Below the Piece
		p.setValues(position.getRow() + 1, position.getColumn());
		if(getBoard().positionExists(p) && canMove(p)) {
					
		mat[p.getRow()][p.getColumn()] = true;
					
		}
		
		//Left the Piece
		p.setValues(position.getRow(), position.getColumn() - 1);
		if(getBoard().positionExists(p) && canMove(p)) {
					
		mat[p.getRow()][p.getColumn()] = true;
					
		}
		
		//Right the Piece
		p.setValues(position.getRow(), position.getColumn() + 1);
		if(getBoard().positionExists(p) && canMove(p)) {
					
		mat[p.getRow()][p.getColumn()] = true;
					
		}
		
		//NW the Piece
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		if(getBoard().positionExists(p) && canMove(p)) {
					
		mat[p.getRow()][p.getColumn()] = true;
					
		}
		
		//NE the Piece
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if(getBoard().positionExists(p) && canMove(p)) {
					
		mat[p.getRow()][p.getColumn()] = true;
					
		}
		
		//SW the Piece
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if(getBoard().positionExists(p) && canMove(p)) {
					
		mat[p.getRow()][p.getColumn()] = true;
					
		}
		
		//SE the Piece
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		if(getBoard().positionExists(p) && canMove(p)) {
					
		mat[p.getRow()][p.getColumn()] = true;
					
		}
		
		return mat;
		
	}

}
