class Main{
  public static void main(String[] args) {
    World w = new World("step3");
    Pica pica = new Pica(30, 30);
    w.addObject(pica);
    Pica pica1 = new Pica(120, 230);
    w.addObject(pica1);
    w.setVisible(true);
    w.act();
  }
}
