import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
class World extends JFrame {
  JPanel p;
  ImageIcon icon1;
  JLabel label;
  Container contentPane;

  int nx = 0, ny = 0;

  List<Actor> actorList = new ArrayList<Actor>();

  public World(String title){
    setTitle(title);
    setBounds(100, 100, 600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p = new JPanel();

    icon1 = new ImageIcon("./pict/pica.png");

    label = new JLabel(icon1);// JlabelにImageIconをセット

    p.setLayout(null);
    label.setBounds(nx, ny, 100, 100);

    p.add(label);// JpanelにJlabelを張り込む

    contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }


  public void addObject(Actor object, int x, int y){
    actorList.add(object);
  }

  public void sleep(long t) throws InterruptedException{
    Thread.sleep(t);
  }

  public void moveObj(int x, int y){
    try {
      while(true){
        System.out.println(nx);
        System.out.println(ny);
        nx += 10;
        if (nx > x || ny > y){
          nx = 0;
          ny = 0;
        }
        label.setLocation(nx, ny);
        sleep(100);
      }
    } catch(InterruptedException ie) {

    }
  }

  public void act(){
    for(Actor a : actorList){
      // a.moveObj(10, 10);
    }
  }
}
