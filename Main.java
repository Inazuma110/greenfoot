class Main{
  public static void main(String[] args) {
    World w = new World("step3");
    Wambat1 w1 = new Wambat1(30, 30);
    World.addObject(w1);
    Wambat2 w2 = new Wambat2(120, 130);
    World.addObject(w2);
    w.setVisible(true);
    w.act();
  }
}
