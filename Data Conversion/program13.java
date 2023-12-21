 //How to convert String to Object
 class prog13{
    public static void main(String[] args) {
        // Convert String to Integer
        String intStr = "123";
        int intValue = Integer.parseInt(intStr);
        System.out.println("Converted Integer: " + intValue);

        // Convert String to Double
        String doubleStr = "3.14";
        double doubleValue = Double.parseDouble(doubleStr);
        System.out.println("Converted Double: " + doubleValue);

        // Convert String to Boolean
        String boolStr = "true";
        boolean boolValue = Boolean.parseBoolean(boolStr);
        System.out.println("Converted Boolean: " + boolValue);

        // Convert String to Custom Object (using Constructor)
        String customStr = "Hello, World!";
        CustomObject customObject = new CustomObject(customStr);
        System.out.println("Converted Custom Object: " + customObject.getData());
    }

    // Example Custom Object
    static class CustomObject {
        private String data;

        public CustomObject(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }
    }
}