package oop_2;

public class m_1 {
    public static void main(String[] args) {
        Car car = new Car("qizil","Captiva",200000,"avtomat");
        car.shovinfo();
        System.out.println("rangi "+car.getrang());
        System.out.println("model " + car.getModel());
        System.out.println("narxi " +car.getNarxi());
        System.out.println("turi "+car.getturi());
    }
}
class Car{
 private   String rangi;
  private String model;
  private int narxi;
   private String avto_mexanik;
  public Car(String rangi,String model,int narxi,String avto_mexanik){
      this.rangi = rangi;
      this.model = model;
      this.narxi = narxi;
      this.avto_mexanik = avto_mexanik;
  }
  public void shovinfo(){
      System.out.println("rangi " + rangi + " model " + model +
              " narxi " + narxi + " avto_maxanik " + avto_mexanik);
  }
  public String getrang(){
      return  rangi;
  }
  public String getModel(){
      return model;
  }
  public int getNarxi(){
      return  narxi;
  }
  public String getturi(){
      return avto_mexanik;
  }
}
