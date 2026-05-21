Public class Bottle{
  private double ml;

  public Bottle(double ml){
    this.ml=ml;
  }

  public double updateAmount(double up){
    double temp =ml; 
    if(ml-up<(0.25*temp)){
      ml=temp;
    }else{
      ml=ml-up;
    }
    
    
  }
  
}
