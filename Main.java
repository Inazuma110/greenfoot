class Main{
  public static void main(String[] args) {
    World w = new World("step3");
    Pica pica = new Pica(30, 30);
    w.addObject(pica);
    Pica pica1 = new Pica(120, 230);
    w.addObject(pica1);
    w.setVisible(true);
    // w.moveObj(100, 100);
    // for (int i = 0; i < 100000; i++) {
    //   w.act();
    // }
  }
}
