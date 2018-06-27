import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.util.List;
import java.util.ArrayList;

public class Actor{
  private int x, y;
  double direction = 0;
  ImageIcon icon;
  JLabel label;

  public Actor(int x, int y){
    this.x = x;
    this.y = y;
    // p = new JPanel();
    icon = new ImageIcon("./pict/pica.png");
    label = new JLabel(icon);// JlabelにImageIconをセット
    // p.setLayout(null);
    label.setBounds(x, y, 100, 100);
    World.p.add(label);// JpanelにJlabelを張り込む
  }

  public void act(){
    // 子クラスにオーバーライドされる

  }

  public int getX() throws java.lang.IllegalStateException{
    return x;
  }

  public int getY() throws java.lang.IllegalStateException{
    return y;
  }

  public boolean isAtEdge(){
  if(x < 0 || x > 525 || y < 0 || y > 300) return true;
    else return false;
  }

  public void setLocation(int x, int y){
    this.x = x;
    this.y = y;
    label.setBounds(x, y, 100, 100);
    World.p.add(label);// JpanelにJlabelを張り込む
  }

  public void moveObj(int d){
    try{
      double nx = Math.round(d * Math.cos(Math.toRadians(direction)));
      double ny = Math.round(d * Math.sin(Math.toRadians(direction)));
      x += nx;
      y += ny;
      sleep(5);
      this.setLocation(x, y);
    }catch (InterruptedException ie) {

    }
  }

  public void turn(int rotation)
  {
    // System.out.println(direction);
    direction += rotation;
    if(direction >= 360) direction -= 360;
    moveObj(10);
  }

  public World getWorld(){
    return null;
  }

  protected java.util.List<Actor> getIntersectingObjects(java.lang.Class<Actor> cls){
    List<Actor> l = new ArrayList<>();
    for(Actor a : World.actorList){
      if(Math.abs(a.x - this.x) + Math.abs(a.y - this.y) <= 10 && (a.x != this.x && a.y != this.y)){
        l.add(a);
      }
    }
    // if(l.size() != 0) this.moveObj(15);
    return l;
  }

  protected boolean isTouching(java.lang.Class<Actor> cls){
    List<Actor> l = new ArrayList<>();
    l = getIntersectingObjects(Actor.class);
    if(l.size() != 0) return true;
    else return false;
  }

  public void sleep(long t) throws InterruptedException{
    Thread.sleep(t);
  }
}
