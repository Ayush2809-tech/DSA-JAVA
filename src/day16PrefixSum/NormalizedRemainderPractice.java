package day16PrefixSum;

public class NormalizedRemainderPractice {
    public static void main(String[] args) {
        int sum = -12;
        int k = 5;
        int remainder = ((sum%k)+k)%k;
        System.out.println("Remainder  is: "+ remainder);
    }
}
