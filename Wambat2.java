import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.util.List;
public class Wambat2 extends Actor implements Janken

{
  public int id = IDGenerator.getID();
  public Wambat2(int x, int y){
    super(x, y);
    icon = new ImageIcon("./pict/mokou.png");
    label = new JLabel(icon);// JlabelにImageIconをセット
    label.setBounds(x, y, 100, 100);
    World.p.add(label);// JpanelにJlabelを張り込む
  }
  @Override
  public void act()
  {
    if(super.isTouching(Actor.class)){
      List<Actor> l = getIntersectingObjects(Actor.class);
      Actor aite = l.get(0);
      if(aite instanceof Janken){
        Random rand = new Random();
        int result = 0;
        while(result == 0){
          int r1 = rand.nextInt(3);
          JankenHand jh1 = judgeHand(r1);
          result = ((Janken)(aite)).katta(id, r1);
        }
        if(result == 1){
          turn(100);
        }
      }else{
        turn(100);
      }
    }else if (isAtEdge()){
      turn(100);
    }else{
      moveObj(1);
    }
  }

  public int katta(int id, int jhNum1){
    if(this.id > id){
      moveObj(11);
      return -1;
    }
    Random rand = new Random();
    int jhNum2 = rand.nextInt(3);
    System.out.println("Wambat2: " + judgeHand(jhNum2));

    System.out.println("aite: " + judgeHand(jhNum1));
    if (jhNum1 == jhNum2){
      System.out.println("aiko!! one more!!");
      return 0;
    }else if(jhNum1 < jhNum2 || (jhNum1 == 2 && jhNum2 == 0)){
      return 1;
    }else{
      turn(100);
      return 2;
    }
  }

  public JankenHand judgeHand(int jhNum){
    switch (jhNum){
      case 0:
      return JankenHand.goo;
      case 1:
      return JankenHand.choki;
      default:
      return JankenHand.pa;
    }
  }

}
