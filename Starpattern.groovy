/**
 * Created by sagar on 2/4/16.
 */
class Starpattern {
public static void main(arg)
{
    int i,j,k;
    for(i=1; i<=5; i++)
    {
        for(j=4; j>=i; j--)
        {
            print(" ");
        }
        for(k=1; k<=(2*i-1); k++)
        {
            print("*");
        }
        println("");

       }
    }
}
