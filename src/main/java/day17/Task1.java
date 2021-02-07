package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece whitePawn = ChessPiece.PAWN_WHITE;
        ChessPiece blackRook = ChessPiece.ROOK_BLACK;

        String[] arrayOfChessPieces = new String[8];

        for (int i = 0; i < arrayOfChessPieces.length; i++){
            if (i < 4)
                arrayOfChessPieces[i] = whitePawn.getRepresentation();

            else
                arrayOfChessPieces[i] = blackRook.getRepresentation();
        }

        for (int j = 0; j < arrayOfChessPieces.length; j++){
            System.out.print(arrayOfChessPieces[j] + " ");
        }

    }
}