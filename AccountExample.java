import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    public static final String ACCOUNT_REGEX="^[_a-z0-9]{6,}$";
    //{6,} nghĩa là tối thiếu 6 ký tự!
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh"};
    public static final String[] invalidAccount = new String[]{ ".@", "12345", "1234_", "abcde"};


    public AccountExample() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
