private Space[][] board;

public int getPointsForRow(int targetRow){
  int sum;
  Boolean isSame=true;
  for(int c=0; c<board[targetRow].length;c++){
    if(!board[targetRow][c].getColor().equals(board[targetRow][0].getColor())){
      isSame=false;
    }
    sum+=board[targetRow][c].getPionts();
  }
  if(isSame){
    return sum*2;
  }
  return sum;
}
