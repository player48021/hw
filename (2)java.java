public class MainArray {
    public static void main(String[] args) {
        char[] spisok = {'0','A','2','C','d','2','G'};

        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (char ch : spisok) {
            if (Character.isDigit(ch)) numbers.append(ch);
            else if (Character.isLetter(ch)) letters.append(ch);
        }

        System.out.println("Цифры: " + numbers);
        System.out.println("Буквы: " + letters);
    }
}
