import java.awt.*;
import javax.swing.*;

class Pica extends Actor{
  int nx = 0, ny = 0;
  public Pica(int x, int y){
    super(x, y);
  }

  @Override
  public void act(){
    if(!isAtEdge())
    super.moveObj(1);
  }
}
