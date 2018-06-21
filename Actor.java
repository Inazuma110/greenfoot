import java.awt.*;
import javax.swing.*;
import java.lang.*;

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
  if(x < 0 || x > 500 || y < 0 || y > 300) return true;
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
      sleep(4);
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

  protected <Actor> java.util.List<Actor> getIntersectingObjects(java.lang.Class<Actor> cls){
    return null;
  }

  protected boolean isTouching(java.lang.Class<Actor> cls){
    return false;
  }

  public void sleep(long t) throws InterruptedException{
    Thread.sleep(t);
  }
}
