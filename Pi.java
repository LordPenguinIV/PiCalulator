public class Pi
 {
   public static void main (String [] args)
   {
     double a=1;
     double b;
     double c=0;
     double d=0;
     int x = 0;
     while (1 < 2)
     {
       b = Math.pow(-1,a+1)/((2*a)-1);
       c = c+b;
       d = 4*c;
       a = a+1;
       x = x+1;
       System.out.print(d);
       System.out.println("    " + x);
       if (d == Math.PI)
       {
         System.exit(0);
       }
     }
   }
 }
 