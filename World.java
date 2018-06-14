import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
class World extends JFrame {
  // JPanel p;
  // ImageIcon icon1;
  // JLabel label;
  static JPanel p;
  ImageIcon icon;
  JLabel label;
  Container contentPane;

  List<Actor> actorList = new ArrayList<Actor>();

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

  // public void sleep(long t) throws InterruptedException{
  //   Thread.sleep(t);
  // }

  // } catch(InterruptedException ie) {


  public void act(){
    for(Actor a : actorList){
      a.act();
    }
  }
}
