import java.util.GregorianCalendar;
import javax.swing.Spring;

public class HeartRates{
    private String firstName;
    private String lastName;
    private int birthYear;

    HeartRates(String fName, String lName, int bYear){
        firstName = fName;
        lastName = lName;
        birthYear = bYear;
    }

    public String get_fName(){return firstName;}
    public String get_lName(){return lastName;}
    public int get_birthYear(){return birthYear;}

    public void set_firstName(String fName){firstName = fName;}
    public void set_lastName(String lName){lastName = lName;}
    public void set_birthYear(int bYear){birthYear = bYear;}

    public int get_Age(){
        return new GregorianCalendar().get(GregorianCalendar.YEAR) - birthYear;
    }

    public int maxHeartRate(){return 220 - get_Age();}

    public void targetHeartRate(){
        System.out.printf(" Target Heart Rate RAge : " + .5 * maxHeartRate()
                + " - " + .85 * maxHeartRate());
    }

}