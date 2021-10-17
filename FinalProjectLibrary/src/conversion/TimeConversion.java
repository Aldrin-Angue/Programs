
package conversion;

public class TimeConversion {
//7
    public int WeekToDay(int a){
     int day = a * 7;
     return day;
    
}   
//8
 public double DayToWeek (double a){
     double week = a / 7;
     return week;
 }
 //9
 public double YearToWeek (double a){
     double week = a * 52.143;
     return week;
 }
 //10
 public double WeekToYear (double a){
     double year = a / 52.143;
     return year;
 }
 //11
 public int CenturyToYear (int a){
     int year = a * 100;
     return year;
 }
 //12
 public double YearToCentury (double a){
     double century = a / 100;
     return century;
 }
 //13
 public int DecadeToMonth (int a){
     int month = a * 120;
     return month;
 }
 //14
 public double MonthToDecade (double a){
     double decade = a / 120;
     return decade;
 }
}
