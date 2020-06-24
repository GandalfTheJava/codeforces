import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
public class HelpfulMaths
{
    public static void main(String args[])
    {
        Scanner z = new Scanner(System.in);
        String x=z.next();
        int i,j;
        StringBuilder sb=new StringBuilder(x);
        int ii=(x.length()/2)+1;
        int[] a=new int[ii];
        for(i =0,j=0;i<sb.length()&&j<a.length;i+=2,j++)
        {
            a[j]=Character.getNumericValue(sb.charAt(i));
        }
        Arrays.sort(a);
        StringBuilder sb1=new StringBuilder();
        for(i=0;i<a.length;i++)
        {
            if(i<a.length-1)
            {
                sb1.append(a[i]);
                sb1.append('+');
            }
            else if(i==a.length-1)
                sb1.append(a[i]);
        }
        System.out.println(sb1);
    }
}