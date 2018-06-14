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
    // else super.setLocation(100,100);
    // super.moveObj(1);

  }
}
