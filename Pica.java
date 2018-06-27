import java.awt.*;
import javax.swing.*;
import java.util.List;
class Pica extends Actor{
  int nx = 0, ny = 0;
  public Pica(int x, int y){
    super(x, y);
  }

  @Override
  public void act(){
    if(!super.isAtEdge() && !super.isTouching(Actor.class)) super.moveObj(1);
    else super.turn(100);
    // List<Actor> l = getIntersectingObjects(Actor.class);
    // if(l.size() != 0) System.out.println(l.size());
    // for(Actor a : l) System.out.println(a.getX());
    // super.moveObj(1);
    // super.turn(90);
    // super.moveObj(1);
  }
}
