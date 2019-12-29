import java.util.Calendar;

public class SimpleDate{
    private int year;
    private int month;
    private int date;

    public static Calendar cal = Calendar.getInstance();

    static{
        System.out.println(new SimpleDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)).toString());
    }
    
    {
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        date = cal.get(Calendar.DATE);
    }

    //--　yは閏年か
    public static boolean isLeap(int y){
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    //-- コンストラクター
    public SimpleDate(){}
    public SimpleDate(int year){
        this.year = year;
    }
    public SimpleDate(int year, int month){
        this(year);
        if(month < 1){
            this.month = 1;
        }else if (month > 12){
            this.month = 12;
        }else{
            this.month = month;
        }
    }
    public SimpleDate(int year, int month, int date){
        this(year, month);
        if(date < 1){
            this.date = 1;
        }else if(this.month == 2 && !isLeap(year) && date > 28){
            this.date = 28;
        }else if(this.month == 2 && isLeap(year) && date > 29){
            this.date = 29;
        }else if((this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) && date > 30){
            this.date = 30;
        }else if((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) && date > 31){
            this.date = 31;
        }else{
            this.date = date;
        }
    }
    public SimpleDate(SimpleDate d){
        this(d.year, d.month, d.date);
    }

    //--　年月日のゲッター
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDate(){
        return date;
    }

    //--　年月日のセッター
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        if(month < 1){
            this.month = 1;
        }else if (month > 12){
            this.month = 12;
        }else{
            this.month = month;
        }
    }
    public void setDate(int date){
        if(date < 1){
            this.date = 1;
        }else if(month == 2 && !isLeap(year) && date > 28){
            this.date = 28;
        }else if(month == 2 && isLeap(year) && date > 29){
            this.date = 29;
        }else if((month == 4 || month == 6 || month == 9 || month == 11) && date > 30){
            this.date = 30;
        }else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date > 31){
            this.date = 31;
        }else{
            this.date = date;
        }
    }
    public void set(int year, int month, int date){
        this.year = year;  

        if(month < 1){
            this.month = 1;
        }else if (month > 12){
            this.month = 12;
        }else{
            this.month = month;
        }

        if(date < 1){
            this.date = 1;
        }else if(this.month == 2 && !isLeap(year) && date > 28){
            this.date = 28;
        }else if(this.month == 2 && isLeap(year) && date > 29){
            this.date = 29;
        }else if((this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) && date > 30){
            this.date = 30;
        }else if((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) && date > 31){
            this.date = 31;
        }else{
            this.date = date;
        }
    }

    //--　曜日を求める
    public int weekDay(){
        int y = year;
        int m = month;
        if(m == 1 || m == 2){
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }

    //--　年月日の等価性をチェック
    public boolean isEqualTo(SimpleDate d){
        return year == d.year && month == d.month && date == d.date;
    }
    public boolean isBefore(SimpleDate d){
        return (year < d.year || (year == d.year && month < d.month) || (year == d.year && month == d.month && date < d.date));                      
    }
    public boolean isAfter(SimpleDate d){
        return (year > d.year || (year == d.year && month > d.month) || (year == d.year && month == d.month && date > d.date));  
    }

    //--　文字列表現
    public String toString(){
        String[] wd = {"日","月","火","水","木","金","土",};
        return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[weekDay()]);
    }
}