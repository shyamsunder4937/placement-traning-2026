package day3;

public class methods {
	public static void main(String[] args) {

        String str = "Hello World";
        String str2 = "hello world";

        
        System.out.println("1. " + str.charAt(1)); 

       
        System.out.println("2. " + "Apple".compareTo("Banana")); 

      
        System.out.println("3. " + "HELLO".compareToIgnoreCase("hello")); // 0

        
        System.out.println("4. " + "Hello".concat(" Java"));

        // 5. contains()
        System.out.println("5. " + str.contains("World"));

        System.out.println("6. " + str.contentEquals("Hello World"));

        
        char[] arr = {'J','A','V','A'};
        System.out.println("7. " + String.copyValueOf(arr));

        
        System.out.println("8. " + str.endsWith("World"));

        
        System.out.println("9. " + str.equals(str2));

        System.out.println("10. " + str.equalsIgnoreCase(str2));

        
        System.out.println("11. " + str.indexOf("World"));

        System.out.println("12. " + "".isEmpty());

        System.out.println("13. " + String.join("-", "Java", "Python", "C"));

        String s = "banana";
        System.out.println("14. " + s.lastIndexOf('a'));

        System.out.println("15. " + "12345".matches("\\d+"));

        System.out.println("16. " + str.replace("World", "Java"));

        System.out.println("17. " + "a1b2c3".replaceAll("\\d", "*"));

        System.out.println("18. " + "one one one".replaceFirst("one", "1"));

        String text = "Java,Python,C";
        String[] parts = text.split(",");
        System.out.println("19.");
        for(String p : parts){
            System.out.println(p);
        }

      
        System.out.println("20. " + str.startsWith("Hello"));

    
        System.out.println("21. " + str.subSequence(0,5));

    
        System.out.println("22. " + str.substring(6));

     
        char[] ch = str.toCharArray();
        System.out.println("23.");
        for(char c : ch){
            System.out.print(c + " ");
        }
        System.out.println();

        
        System.out.println("24. " + str.toLowerCase());

       
        System.out.println("25. " + str.toUpperCase());


        System.out.println("26. " + str.toString());

 
        String space = "   Java   ";
        System.out.println("27. " + space.trim());

        
        int num = 100;
        String result = String.valueOf(num);
        System.out.println("28. " + result);
    }

}
