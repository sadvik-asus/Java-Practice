class Digits {
    private int num;

    public Digits(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Given number : " + num;
    }

    public int reverseNumber(int num) {
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse;
    }

    public void printDigits() {

        int reverse = reverseNumber(num);

        System.out.println("Digits of number:");

        while (reverse > 0) {
            int digit = reverse % 10;
            System.out.println(digit);
            reverse = reverse / 10;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Digits d = new Digits(123);
        System.out.println(d);
        d.printDigits();
    }
}