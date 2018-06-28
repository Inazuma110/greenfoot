class Main{
  public static void main(String[] args) {
    World w = new World("step3");
    // Pica pica = new Pica(30, 30);
    // w.addObject(pica);
    // Pica pica1 = new Pica(120, 230);
    // w.addObject(pica1);
    Wambat1 w1 = new Wambat1(30, 30);
    w.addObject(w1);
    Wambat2 w2 = new Wambat2(120, 130);
    w.addObject(w2);
    w.setVisible(true);
    w.act();
  }
}
