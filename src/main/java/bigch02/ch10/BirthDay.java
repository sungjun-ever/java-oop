package bigch02.ch10;

public class BirthDay {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean validateDay(){
        return this.day > 0 && this.day < 32;
    }

    public boolean validateMonth(){
        return this.month > 0 && this.month < 13;
    }

    public boolean validateBirthDay(){
        return this.validateDay() && this.validateMonth();
    }

    public void showDate(){
        isValid = validateBirthDay();

        if(isValid){
            System.out.println(year + "년" + month + "월" + day + "일");
        } else {
            System.out.println("유효하지 않은 생일입니다.");
        }
    }
}
