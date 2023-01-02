public class Rock extends Piece {
    private String name;
    public Rock(){
        super();
        this.name = "rock";
    }
    boolean isValidMove (Position newPosition){
        if(!super.isValidMove(newPosition)){
            return false;
        }
        if(newPosition.column == this.position.column || newPosition.row == this.position.row){
            return true;
        } else {
            return false;
        }
    }
}
