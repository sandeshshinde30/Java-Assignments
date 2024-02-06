import java.util.*;

public class hour {
    int second;
    int minute=0;
    int hour=0;

    Scanner sc = new Scanner(System.in);

    void setSeconds()
    {
        System.out.println("Enter Seconds : ");
        second = sc.nextInt();
    }

    void convertHour()
    {
        hour = (second/3600);
        minute = (second - (hour*3600))/60;
        second = (second - (hour*3600)-(minute*60));
    }

    void getData()
    {
        System.out.println("Hour : "+hour+"\tMinute : "+minute+"\tSeconds : "+second);
    }

    public static void main(String args[])
    {
        hour h = new hour();
        h.setSeconds();
        h.convertHour();
        h.getData();
    }
}
