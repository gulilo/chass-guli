package moves;

import pieces.Piece;

public class PieceMove extends Move
{

	public PieceMove(int from, int to)
	{
		super(from, to);
	}

	public void doit(Piece[][] board)
	{
		board[from / 8][from % 8].move(to, board);
	}
}
