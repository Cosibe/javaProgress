public class Multadd {
    public static double multadd(double a, double b, double c){
        double m = a * b + c;
        System.out.println(m);
        return m;
    }
    public static void main(String[] args){
        multadd(1.0, 2.4, 5.6);
        multadd(0.5, Math.cos(0.7855), Math.sin(0.7855));
        multadd(1.0, Math.log(10), Math.log(20));
        expsum(0.0);
    }

    public static void expsum(double t){
        double x = t;
        double e = Math.exp(-t);
        double q = Math.sqrt(1 - e);
        double g =  multadd(x, e, q);
        System.out.println(g);
    }
}
