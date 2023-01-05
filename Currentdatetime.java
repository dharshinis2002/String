import java.util.Formatter;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Currentdatetime {
    public static void main(String[] args) {
        SimpleDateFormat obj=new SimpleDateFormat();
        Date date=new Date();
        System.out.format(obj.format(date));
    }
}