import com.phone.Phone;
public class Main {
    public static void main(String[] args) {
        Phone p = new Phone();
        Phone p1 = new Phone();
        String str = "3452_";
        System.out.println(str.indexOf("_ds"));
//        String str1 = new String("3452_");
        String str1 ="3452_";
        System.out.println(str1 == str);
        System.out.println(str1.equals(str));
    }
}
