public class JavaFunction {
    public static void main(String[] args) {

        String str = new String("netbeans");


        // length() --> length function in String
        int len = str.length();
        System.out.println(len);
        System.out.println(str.length());


        // toUpperCase()
        String strToUpperCase = str.toUpperCase();
        System.out.println(strToUpperCase);



        // toLowerCase()
        String strToLowerCase = str.toLowerCase();
        System.out.println(strToLowerCase);



        // trim()
        /*
            * it is used for removing leading and trailing whitespace from a  string
         */
        String strTrim = " netbeans    ";
        String strMakingTrim = str.trim();
        System.out.println(strMakingTrim);



        // substring()
        /*
            * to extract a protion of a string and return it as a new string
            * two way
            * substring(int beginIndex);
            * substring(int beginIndex, int endIndex);
         */
        String strForString = "Welcome";
        String subString1 = strForString.substring(2);
        String subString2 = strForString.substring(2, 5);
        System.out.println(subString1);
        System.out.println(subString2);


        // replace(char old, int end)
        /*
            to create a new string by replacing all occurences of a specified character or sbstring with new content
         */
        String strReplace0 = "Welcome every one";
        String strReplace1 = strReplace0.replace(' ', '$');
        String strReplace2 = strReplace0.replace('e', 'k');
        System.out.println(strReplace0);
        System.out.println(strReplace1);
        System.out.println(strReplace2);



        // startsWith(string s)
        String strStartsWith = "Hello Every one in alone";
        boolean strStartsWithHello = strStartsWith.startsWith("Hello");
        boolean strStartsWithEvery = strStartsWith.startsWith("Every");
        System.out.println(strStartsWithHello);
        System.out.println(strStartsWithEvery);



        // endsWith(string s)
        String strEndsWith = "Hello Everyone Is Alone";
        boolean strEndsWithAlone = strEndsWith.endsWith("Alone");
        boolean strEndsWithIs = strEndsWith.endsWith("Is");
        // boolean strEndsWithGarbage = strEndsWith.endsWith("shfklashkshh");  // it has nothing meaning
        System.out.println(strEndsWithAlone);
        System.out.println(strEndsWithIs);
        // System.out.println(strEndsWithGarbage);



        // char charAt(int index)
        /*
            * to access a single character at a specific, zero-based index within a string
         */
        String strCharAt = "Hello_Everyone";
        char charOfStrCharAt = strCharAt.charAt(3);
        System.out.println(strCharAt.charAt(5));
        System.out.println(charOfStrCharAt);


        // indexOf(string s)
        /*
            * to find the index(position) of the first occurence of a specified character or a substring within a larger string
            * it is asigned by int
         */
        String strIndexOf = "Welcome to Java programming";
        int IndexOfStrIndexOf1 = strIndexOf.indexOf('o');
        int IndexOfStrIndexOf2 = strIndexOf.indexOf("Java");
        System.out.println(IndexOfStrIndexOf1);
        System.out.println(IndexOfStrIndexOf2);
        int IndexOfStrIndexOf3 = strIndexOf.indexOf("sdfsfava");
        System.out.println(IndexOfStrIndexOf3);  // it gives output -1 (because it cannot find that)


        // lastIndexOf(String s)
        /*
            * to find the index (position) of the occurence of a specified character or substring within a given string
         */
        String strLastIndexOf = "Hello world, world is a great place";
        int indexOfStrLastIndexOf0 = strLastIndexOf.lastIndexOf("World");  // here it is not present it given output -1
        int indexOfStrLastIndexOf1 = strLastIndexOf.lastIndexOf("world");
        int indexOfStrLastIndexOf2 = strLastIndexOf.lastIndexOf("a", 7);
        System.out.println("Last index of \"world\": " + indexOfStrLastIndexOf0);
        System.out.println("Last index of \"world\": " + indexOfStrLastIndexOf1);
        System.out.println("Last index of 'a': " + indexOfStrLastIndexOf2);



        // equals(string s)
        /*
            * to compare the content(sequence of characters) of two strings
            * function having boolean return type
         */
        String strCompare1 = "Hello";
        String strCompare2 = "Hello";
        String strCompare3 = new String("Hello");
        String strCompare4 = "World";
        // method - 1
        System.out.println(strCompare1.equals(strCompare2));
        System.out.println(strCompare2.equals(strCompare3)); // true (contents are the same, despite different memory locations)

        System.out.println(strCompare1.equals(strCompare3)); // true (contents are the same, despite different memory locations)

        System.out.println(strCompare1.equals(strCompare4));
        System.out.println(strCompare3.equals(strCompare4));
        // method - 2
        System.out.println(strCompare1 == strCompare2);   // true (Java reuses same object for literals in the string pool)
        System.out.println(strCompare2 == strCompare3); // false (str3 is a new object in memory)

        System.out.println(strCompare1 == strCompare3);
        System.out.println(strCompare1 == strCompare4);
        System.out.println(strCompare3 == strCompare4);



        // equalsIgnoreCase(string s);
        /*
            * to compare two string for content equality while ignoring the  case (upper or lower) of the characters
            * default it is boolean return type
         */
        String strEqualsIgnoreCase0 = "Hello World";
        String strEqualsIgnoreCase1 = "hello world";
        String strEqualsIgnoreCase2 = "JAVA";
        String strEqualsIgnoreCase3 = "java";
        String strEqualsIgnoreCase4 = "JAVA!";

        System.out.println("\n equalsIgnoreCase(string s)");

        boolean result1StrEqualsIgnoreCase = strEqualsIgnoreCase0.equalsIgnoreCase(strEqualsIgnoreCase1);

        System.out.println(result1StrEqualsIgnoreCase);
        System.out.println(strEqualsIgnoreCase2.equalsIgnoreCase(strEqualsIgnoreCase3)); // true in output
        System.out.println(strEqualsIgnoreCase2.equalsIgnoreCase(strEqualsIgnoreCase4));



        // compareTo()
        /*
            * to perform a lexigraphical comparison(dictionary order) between two strings
         */
    }
}
