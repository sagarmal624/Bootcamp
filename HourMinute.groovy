/**
 * Created by sagar on 2/4/16.
 */
class HourMinute {
    int hours;
    int min;
HourMinute plus(int hours,int min)
{
    return new HourMinute(hours:this.hours+hours,min:this.min+min)

}
public static void main(arg){

    HourMinute time1=new HourMinute(hours:4,min:20 );
    HourMinute time2=new HourMinute(hours:5,min:20 );
    //HourMinute time3=new HourMinute(hours:4,min:20 );
    def totalhour=time1.hours+time2.hours;
    def totalmin=time1.min+time2.min;
    println("Total Hour:"+totalhour)
    println("Total Min:"+totalmin)

  }
}
