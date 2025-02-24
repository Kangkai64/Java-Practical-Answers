package Practical5Q3;

public class NameFormatter {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide both the full name and the salutation.");
            return;
        }

        String fullName = args[0];
        String salutation = args[1];

        String capitalizedFullName = capitalizeName(fullName);
        String surname = extractSurname(fullName);

        System.out.println("To: " + capitalizedFullName);
        System.out.println("Wishing you a Merry Christmas, " + salutation + " " + surname + ".");
    }

    public static String capitalizeName(String name) {
        String[] words = name.split("\\s+");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    public static String extractSurname(String fullName) {
        String[] words = fullName.split("\\s+");
        return words[words.length - 1];
    }
}