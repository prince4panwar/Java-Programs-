//Java method to find all twin prime numbers less than 100.
class twinprime 
{
    public static void main(String[] a) {
                int limit = 100;
        
                System.out.println("Unique Twin Prime Numbers less than " + limit + ":");
                for (int number = 3; number < limit; number += 2) {
                    if (isTwinPrime(number)) {
                        System.out.println(number + " and " + (number + 2));
                        number += 2; 
                    }
                }
            }
        
            public static boolean isPrime(int num) {
                if (num <= 1) {
                    return false;
                }
                if (num <= 3) {
                    return true;
                }
                if (num % 2 == 0 || num % 3 == 0) {
                    return false;
                }
                int sqrtNum = (int) Math.sqrt(num);
                for (int i = 5; i <= sqrtNum; i += 6) {
                    if (num % i == 0 || num % (i + 2) == 0) {
                        return false;
                    }
                }
                return true;
            }
        
            public static boolean isTwinPrime(int num) {
                return isPrime(num) && (isPrime(num + 2) || isPrime(num - 2));
    }
}