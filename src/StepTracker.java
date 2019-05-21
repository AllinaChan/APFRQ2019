import java.util.ArrayList;

public class StepTracker {
    private int min;
    private ArrayList<Integer> days;

    public StepTracker(int min)
    {
        this.min=min;
        days= new ArrayList<Integer>();
    }

    public int activeDays()
    {
        int num=0;
        for (Integer day: days)
        {
            if(day >= min)
            {
                num++;
            }
        }
        return num;
    }

    public double averageSteps()
    {
        double sum=0.0;
        for(Integer day: days)
        {
            sum+= day;
        }
        return sum/days.size();
    }

    public void addDailySteps(int steps)
    {
        days.add(steps);
    }
}
