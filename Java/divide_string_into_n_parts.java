#Divides the string into n equal parts
public class DivideString {

 public static void main(String[] args) {

 String str = “abcdefghi”;

 int n = 3;

 int len = str.length();

 int partLength = len / n;

 int extraChars = len % n;

 int start = 0;

 for (int i = 0; i < n; i++) {

 int end = start + partLength + (i < extraChars ? 1 : 0);

 String part = str.substring(start, end);

 System.out.println(“Part ” + (i + 1) + “: ” + part);

 start = end;

 }

 }

}
