
//How to convert Decimal to Binary



 class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNumber =9;
        System.out.println("Number is:"+decimalNumber);
       
        StringBuilder binary = new StringBuilder();
        
        if (decimalNumber == 0) {
            binary.append(0);
        } else {
            
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binary.insert(0, remainder);
                decimalNumber = decimalNumber / 2;
            }
        }
        
        System.out.println("Binary representation: "+ binary.toString());
    }
}


