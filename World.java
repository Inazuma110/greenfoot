import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
class World extends JFrame {
  static JPanel p;
  static Container contentPane;

  static List<Actor> actorList = new ArrayList<Actor>();

  public World(String title){
    setTitle(title);
    setBounds(100, 100, 600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    contentPane = getContentPane();
    p = new JPanel();
    p.setLayout(null);
    // p.add(label);// JpanelにJlabelを張り込む
    contentPane.add(p, BorderLayout.CENTER);
  }

  public void addObject(Actor object){
    actorList.add(object);
  }

  public void act(){
    while(true){
      for(Actor a : actorList){
        a.act();
      }
    }
  }
}
