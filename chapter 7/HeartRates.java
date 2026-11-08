import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;

    public HeartRates(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }

    public void setMonth(int month) { this.month = month; }
    public int getMonth() { return month; }

    public void setDay(int day) { this.day = day; }
    public int getDay() { return day; }

    public void setYear(int year) { this.year = year; }
    public int getYear() { return year; }

    public int getAge() {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - year;
        if (today.getMonthValue() < month ||
            (today.getMonthValue() == month && today.getDayOfMonth() < day))
            age--;
        return age;
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public double getTargetHeartRateLow()  { return getMaximumHeartRate() * 0.50; }
    public double getTargetHeartRateHigh() { return getMaximumHeartRate() * 0.85; }
}