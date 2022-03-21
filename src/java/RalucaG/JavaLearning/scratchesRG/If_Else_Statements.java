import java.io.BufferedReader;
import java.io.InputStreamReader;

class Scratch {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int WeekDay = Integer.parseInt(reader.readLine());
        String dayDisplay = "No such day of the week";

        if (WeekDay == 1)
        {
            dayDisplay = "Monday";
        }
        if (WeekDay == 2)
        {
            dayDisplay = "Tuesday";
        }
        if (WeekDay == 3)
        {
            dayDisplay = "Wednesday";
        }
        if (WeekDay == 4)
        {
            dayDisplay = "Thursday";
        }
        if (WeekDay == 5)
        {
            dayDisplay = "Friday";
        }
        if (WeekDay == 6)
        {
            dayDisplay = "Saturday";
        }
        if (WeekDay == 7)
        {
            dayDisplay = "Sunday";
        }
        System.out.println(dayDisplay);
        
    }
}