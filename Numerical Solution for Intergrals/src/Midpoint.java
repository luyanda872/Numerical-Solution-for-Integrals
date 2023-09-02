public class Midpoint{
    public static double  n = 1000;

    public static void main(String args[]){
        int a = 0;
        int b = 1;
        double col = 0;

        for(int i = 0; i <= n-1; i++){
            double x = xi(a,b,i);
            col = col+function(x);

        }
        System.out.println("Appoximation for the intergral is: ");
        double appro = ((b-a)/n)*col;
        System.out.println(appro);
        System.out.println("the absolute error");
        System.out.println(Math.abs(Math.PI - appro));


    }

    public static double function(double x){
        double f = 4/(1 + Math.pow(x,2));
        return f;
    }

    public static double xi(int a, int b, int i){
        double del_x = (b - a)/n;
        return a + (del_x * i) + (del_x)/2.0;

    }

}