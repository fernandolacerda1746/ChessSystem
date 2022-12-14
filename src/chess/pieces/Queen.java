package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece{

	public Queen(Board board, Color color) {
		
		super(board, color);
		
	}
	
	public String toString() {
		
		return "Q";
		
	}

	@Override
	public boolean[][] possibleMoves() {
		
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		//Above the Piece
		p.setValues(position.getRow() - 1, position.getColumn());
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
			
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//Left the Piece
		p.setValues(position.getRow(), position.getColumn() - 1);
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
			
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//Right the Piece
		p.setValues(position.getRow(), position.getColumn() + 1);
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
			
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//Below the Piece
		p.setValues(position.getRow() + 1, position.getColumn());
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
			
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//NW The Piece
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() - 1);
			
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//NE The Piece
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() + 1);
			
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//SE The Piece
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() +1, p.getColumn() + 1);
			
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//SW The Piece
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() - 1);
			
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}		
		
		return mat;
		
	}

}
