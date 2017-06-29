import java.io.*;
import java.util.*;
class distinct {                                                                     
public static void main(String args[])
{ 
int a[]=new int[],sum=0,f=0,n;
for(int i=0;i<=n;i++)
Scanner in=new Scanne(System.in);
n=in.nextInt();
{
f=0;
for(int j=i+1;j<=7;j++)
{
if(a[i]==a[j]){
f=1;
break;
}

}
if(f==0)
sum++;
}
System.out.println(sum);
}}
