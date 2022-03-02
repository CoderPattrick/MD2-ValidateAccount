public class Main {
    private static AccountExample accountExample;
    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String acc:AccountExample.validAccount
             ) {
            boolean isValid = accountExample.validate(acc);
            System.out.println("Account "+acc+" is valid? "+isValid);
        }
        for (String acc:AccountExample.invalidAccount
             ) {
            boolean isValid = accountExample.validate(acc);
            System.out.println("Account "+acc+" is valid? "+isValid);
        }
    }
}
