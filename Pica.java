import java.awt.*;
import javax.swing.*;
import java.util.List;
class Pica extends Actor{
  public Pica(int x, int y){
    super(x, y);
    icon = new ImageIcon("./pict/pica.png");
    label = new JLabel(icon);// JlabelにImageIconをセット
    label.setBounds(x, y, 100, 100);
    World.p.add(label);// JpanelにJlabelを張り込む
  }

  @Override
  public void act(){
    // moveObj(5);
    if(isTouching(Actor.class)) System.out.println("YES");
    if(!super.isAtEdge() && !super.isTouching(Actor.class)) super.moveObj(2);
    else super.turn(100);
    // List<Actor> l = getIntersectingObjects(Actor.class);
    // if(l.size() != 0) System.out.println(l.size());
    // for(Actor a : l) System.out.println(a.getX());
    // super.moveObj(1);
    // super.turn(90);
    // super.moveObj(1);
  }
}
