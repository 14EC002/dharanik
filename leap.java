import java.io.*;

import java.util.*;

class leap{

 public static void main(String[] args) {
int a;

  Scanner s = new Scanner(System.in);
       a= s.nextInt();

if((a%4==0)||(a%400==0)||(a%100==0))

{

System.out.println("leap year");

}

else 

{

System.out.println("not a leap year");

}
}
}
