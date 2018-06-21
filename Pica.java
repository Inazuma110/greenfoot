import java.awt.*;
import javax.swing.*;

class Pica extends Actor{
  int nx = 0, ny = 0;
  public Pica(int x, int y){
    super(x, y);
  }

  @Override
  public void act(){
    if(!super.isAtEdge()) super.moveObj(1);
    // super.moveObj(1);
    else super.turn(100);
    // super.turn(90);
    // super.moveObj(1);
  }
}
