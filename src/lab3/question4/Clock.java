package lab3.question4;
public class Clock {
    int hours;
    int minutes;
    int second;
    String day;
    String month;
    int year;
    Clock(int hours,int minutes,int second,String day,String month,int year)
    {
        this.hours=hours;
        this.minutes=minutes;
        this.second=second;
        this.year=year;
        this.day=day;
        this.month=month;
    }
    void displaytime()
    {
        System.out.println("Kathamndu,Nepal");
    System.out.println(+hours+":"+minutes+":"+second);
    System.out.println("Day:"+day+"Month:"+month+"Year:"+year);  
    }
    void display(){
        System.out.println("NewDelhi,India");
        System.out.println(+hours+":"+minutes+":"+second);
        System.out.println("Day:"+day+"Month:"+month+"Year:"+year);  
    }
}
