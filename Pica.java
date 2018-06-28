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
    if(isTouching(Actor.class)) System.out.println("YES");
    if(!super.isAtEdge() && !super.isTouching(Actor.class)) super.moveObj(2);
    else super.turn(100);
  }
}
