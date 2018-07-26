import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

class World extends JFrame{
  static JPanel p;
  static Container contentPane;
  static int WORLDX = 600, WORLDY = 400;

  static List<Actor> actorList = new ArrayList<Actor>();

  public World(String title){
    setTitle(title);
    setBounds(100, 100, WORLDX, WORLDY);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    contentPane = getContentPane();
    p = new JPanel();
    p.setLayout(null);
    contentPane.add(p, BorderLayout.CENTER);
  }

  public static void addObject(Actor object){
    actorList.add(object);
  }

  public void sleep(long t) throws InterruptedException{
    Thread.sleep(t);
  }

  public void act(){
    while(true){
      for(Actor a : actorList){
        a.act();
        try{
          sleep(5);
        }catch(InterruptedException ie){
          ie.printStackTrace();
        }
      }
    }
  }
}
