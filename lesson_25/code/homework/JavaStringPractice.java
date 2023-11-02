package homework;

public class JavaStringPractice {
    public static void main(String[] args) {
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        char lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar);

        int position = str.indexOf("Java");
        System.out.println(position);

        boolean containsJava = str.contains("Java");
        System.out.println(true);

        String replacedStr = str.replace("o", "a");
        System.out.println(replacedStr);

        String upperCaseStr = str.toUpperCase();
        System.out.println(upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println(lowerCaseStr);

        String substring = str.substring(position, position + 4);
        System.out.println(substring);

        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println(true);

        boolean startsWithImProud = str.startsWith("I'm proud");
        System.out.println(true);

    }
}
