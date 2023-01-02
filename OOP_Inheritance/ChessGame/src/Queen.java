public class Queen extends Piece {

    boolean isValidMove(Position newPosition) {
        boolean isBoundriesOk = super.isValidMove(newPosition);
        boolean canQueenGo;
        if (newPosition.column == this.position.column || newPosition.row == this.position.row || Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row)){
            canQueenGo = true;
        } else {
            canQueenGo = false;
        }
        return canQueenGo && isBoundriesOk;
    }
}
