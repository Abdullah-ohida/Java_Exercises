package Exercise_4;

public class HeartRates {
    private String firstName;
    private String lastName;
    //Date of Birth
    private int  age;
    private double MaxHeart;

//    private int UserAge;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMaxHeart(double maxHeart) {
        MaxHeart = maxHeart;
    }

    public double getMaxHeart() {
        return MaxHeart;
    }

    public HeartRates(String firstName, String lastName, int yearBirth){
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = getBirthday(yearBirth);
       this.MaxHeart = getMaxHeartRate(getBirthday(yearBirth));
    }

//    Get date of birth
    public int getBirthday(int yearBirth){
        int age;
        age = 2020 - yearBirth;
        return age;
    }
    public double getMaxHeartRate(double age){
        double heartRate = 220 - age;

//        double interval_1 = heartRate * (64 / 100);
        double interval= heartRate * 0.76;
        interval = Math.abs((int) Math.round(interval));
        return interval;
    }

    public String getName(String fname, String lname){
        String fullName = fname + " " + lname;
        return  fullName;
    }


}
