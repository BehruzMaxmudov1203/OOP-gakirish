package oop_vazifa_3;

public class masala_1 {

}
class MathFunctions{
    private  double PI;
    private  double E;

    public MathFunctions(double PI,double E){
        this.PI = PI;
        this.E = E;
    }
    // daraja
    public  double daraja(double a){
        return Math.pow(E,a);
    }
    // yuzini hisoblash
    public double yuzi(double R){
        return PI * R * R;
    }
    public double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Geron formulasi
    }

    public double getPI() {
        return PI;
    }
    public double getE(){
        return  E;
    }

    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions(3.1415,2.7182);
        System.out.println(mathFunctions.daraja(2));
        System.out.println(mathFunctions.yuzi(2));
        System.out.println(mathFunctions.triangleArea(3,4,5));
        System.out.println(mathFunctions.getPI());
        System.out.println(mathFunctions.getE());

    }
}
