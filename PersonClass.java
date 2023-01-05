// Nmae : Hasnat Jani Rafin
//ID : 20172507
import java.util.*;
public class PersonClass {
    String name;
    String address;
    String phone_number;
    String email_address;
    public PersonClass(
            String n, String a, String p, String e) 
        {name = n;address = a;phone_number = p;email_address = e;}
    public String toString() {
        return  name + " Person";}
    }
    class Student0 extends PersonClass 
    {   final String s1 = "Freshman";
        final String s2 = "Sophomore";
        final String s3 = "Junior";
        final String s4 = "Senior";
    public Student0(String n, String a, String p, String e) {
        super(n, a, p, e);}
    public String toString() {
        return name + " Student";}}
    class Employee0 extends PersonClass 
    {   String office;
        double salary;
        Date date_hired = new Date();
    public Employee0(
            String n, String a, String p, String e, String o, double s) 
            {   super(n, a, p, e);
                this.office = o;this.salary = s;}
    public String toString() {
        return name + " Employee";}}
    class Faculty0 extends Employee0 {
    double work_hour; String rank;
    public Faculty0(
            String n, String a, String p, String e, String o, double s, double w, String r) {
        super(n, a, p, e, o, s);this.work_hour = w; this.rank = r;}
    public String toString() {
        return name + " Faculty";}}
    class Staff0 extends Employee0 {
    String title;
    public Staff0(String n, String a, String p, String e, String o, double s, String t) {
        super(n, a, p, e, o, s); title = t;}
    public String toString() {
        return name + " Staff";}
    public static void main(String[] args)
        {PersonClass p = new PersonClass("yuanwenqiang : ", "Hangzhou", "98720349", "yuanwenqiang1111@163.com ");
                        System.out.println(p.toString());
        Student0 s = new Student0("HasnatJaniRafin : ", "Hangzhou", "15153894", "hasnatjanirafin@hdu.edu.cn");
                        System.out.println(s.toString());
        Employee0 e = new Employee0("Mr.Aderson : ", "U.S.A", "5467890", "mr.aderson@gmail.com","room101", 399999);
                        System.out.println(e.toString());
        Faculty0 f = new Faculty0("TimCook : ", "U.S.A", "456789992", "timcook@apple.com",
                                "room201",1000000, 8, "leader");
                        System.out.println(f.toString());
        Staff0 sta = new Staff0("Mr.Joe : ", "9990874", "467547489", "joe778@google.com",
                                "room001", 29000, "monitor");
                        System.out.println(sta.toString());}
}