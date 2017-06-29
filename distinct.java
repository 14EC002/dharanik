import java.io.*;
import java.util.*;
class distinct {                                                                     
public static void main(String args[])
{ 
int a[]=new int[]{1,2,3,4,5,6,5,3,2},sum=0,f=0;
for(int i=0;i<=7;i++)
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
