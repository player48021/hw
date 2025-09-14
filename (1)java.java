public class MainString {
    public static void main(String[] args) {
        String s = "AaBbCcDd";

        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) upper.append(ch);
            else if (Character.isLowerCase(ch)) lower.append(ch);
        }

        System.out.println("Заглавные: " + upper);
        System.out.println("Строчные: " + lower);
    }
}
