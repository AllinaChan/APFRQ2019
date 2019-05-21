public class APCalendar
{
    private static boolean isLeapYear(int year)
    {
        if (year % 4 == 0)
        {
            return true;
        }
        return false;
    }
    public static int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;
       for (int x = year1; x <= year2+year1; x++)
       {
           if(isLeapYear(x))
           {
               count++;
           }
       }
       return count;
    }
    private static int firstDayOfYear(int year)
    {
        int start = 0;
        int start2=0;
        int start3= 0;
        start = 5* ((year -1) % 4);
        start2=  4 * ((year-1) % 100);
        start3=  6 * ((year-1) % 400);
        return (1+start +start2 + start3)%7;
    }
private static int dayOfYear(int month, int day, int year)
{
    int count = 0;
    if (month >1)
    {
        count = month *30 + day;
    }
    else
        {
        count = day;
        }
    return count;
}
public static int dayOfWeek(int month, int day, int year)
{
    int count = firstDayOfYear(year) + dayOfYear(month,day,year)-1;
    if (count > 6)
    {
        count = count%7;
    }
    return count;
}
public static void main (String [] args)
{
    System.out.println(numberOfLeapYears(1998,2008));
    System.out.println(firstDayOfYear(2008));
    System.out.println(dayOfYear(2,1,1998));
    System.out.println(dayOfWeek(1,1,10));
}
}
