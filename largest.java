import java.io.*;

import java.util.*;

class largest{

 public static void main(String[] args) {
int a,b,c;

  Scanner s = new Scanner(System.in);
       a= s.nextInt();
Scanner sh = new Scanner(System.in);
       b= sh.nextInt();
Scanner in = new Scanner(System.in);
       c= in.nextInt();
if((a>b)&&(a>c))

{

System.out.println(a+"is greatest");

}

else if((b>a)&&(b>c))

{

System.out.println(b+"is gratest");

}
else
{
System.out.println(c+"is gratest");
}

}
}
