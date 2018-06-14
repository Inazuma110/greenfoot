import java.awt.*;
import javax.swing.*;

public class Actor{
  private int x, y;
  double direction = 0;
  JPanel p;
  ImageIcon icon;
  JLabel label;
  Container contentPane;

  public Actor(int x, int y){
    this.x = x;
    this.y = y;
    // p = new JPanel();
    icon = new ImageIcon("./pict/pica.png");
    label = new JLabel(icon);// JlabelにImageIconをセット
    // p.setLayout(null);
    label.setBounds(x, y, 100, 100);
    World.p.add(label);// JpanelにJlabelを張り込む
    // contentPane.add(p, BorderLayout.CENTER);
    //
  }

  public void act(){

  }

  public int getX() throws java.lang.IllegalStateException{
    return x;
  }

  public int getY() throws java.lang.IllegalStateException{
    return y;
  }

  public boolean isAtEdge(){
    if(x <= 0 || x >= 600 || y <= 0 || y >= 400) return true;
    else return false;
  }

  public void setRocation(int x, int y){
    label.setLocation(x, y);
  }

  public void moveObj(int d){
    int nx = (int)(d * Math.cos(direction));
    int ny = (int)(d * Math.sin(direction));
    if(!isAtEdge()){
      x = nx;
      y = ny;
    }
    label.setLocation(nx, ny);
  }

  public void turn (int amount){

  }

  public World getWorld(){
    return null;
  }

  // protected <A> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
  //   return null;
  // }
  //
  // protected boolean isTouching (Java.lang.Class<Actor> cls){
  //   return false;
  // }
}
