import java.time.ZonedDateTime;

/**
 * @author dong
 * @date 2020/8/22 17:27
 */
public class test {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();  //默认时区
        System.out.println(now);
    }
}
