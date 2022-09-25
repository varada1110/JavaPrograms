public class Main {
    public static void main(String[] args) {

        int val = 5;
        float val1 = 5.25f;
        double val2 = 5.25d;
        System.out.println("Integer value is " + val);
        System.out.println("Float value is " + val1);
        System.out.println("Double value is " + val2);

        System.out.println("\n************Integer range************\n");

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Minimum value of integer data type =" + minValue);
        System.out.println("Maximum value of integer data type =" + maxValue);


        System.out.println("\n************Byte range************\n");


        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Minimum value of byte data type =" + minByte);
        System.out.println("Maximum value of byte data type =" + maxByte);


        System.out.println("\n************Float range************\n");


        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Minimum value of float data type = " + minFloat);
        System.out.println("Maximum value of float data type = " + maxFloat);


        System.out.println("\n************Double range************\n");


        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Minimum value of double data type = " + minDouble);
        System.out.println("Maximum value of double data type = " + maxDouble);


        System.out.println("\n************Character range************\n");


        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println("Minimum value of character data type  = " + minChar);
        System.out.println("Maximum value of character data type  = " + maxChar);
        char exampleChar = 'D';
        char example2 = '\u0044';
        System.out.println("Example of character data type D = " + exampleChar);
        System.out.println("Example of character data type unicode(D-0044) = " + example2);


        System.out.println("\n************String Data type************\n");


        String mystr =  "Hello";
        System.out.println( mystr + " Welcome to India!");
        String mystr1 = "10";
        int value = 50;
        mystr1 = mystr1 + value;
        System.out.println(mystr1);


        System.out.println("\n************Type Casting************\n");


        int pounds = 1;
        float poundsFloat = (float) (pounds);
        float kilograms = poundsFloat/2.205f;
        System.out.println("1 pound = " + kilograms +" Kilograms");


        System.out.println("\n************LOGICAL OPERATORS************\n");

        int age = 18;
        if (age>5 && age<20) {
            System.out.println("Age between 5 and 20");
        }

        int age2 = 30;
        if (age2==18|| age2==30) {
            System.out.println("Hi");
        }


    }
}