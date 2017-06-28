import java.io.*;

import java.util.*;

class integer{
public static void main(String[] args){
int n,i=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
while(n>0)
{
n=n/10;
i++;
}
System.out.println(i);


}
}
