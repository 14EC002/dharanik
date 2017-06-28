import java.io.*;

import java.util.*;

class prime{
public static void main(String[] args){
int n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
if((n%2==0)||(n%3==0)||(n%5==0)||(n%7==0))
{
System.out.println("not a prime number");
}
else
{

System.out.println(" a prime number");
}
}}
