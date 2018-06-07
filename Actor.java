import java.awt.*;
import javax.swing.*;

public class Actor{
  int x, y;
  double direction = 0;
  public Actor(int x, int y){
    this.x = x;
    this.y = y;
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

  public void setLocation(int x, int y){

  }

  public void moveObj(int d){
    int nx = (int)(d * Math.cos(direction));
    int ny = (int)(d * Math.sin(direction));
    if(!isAtEdge()){
      x = nx;
      y = ny;
    }
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
