package utils;

public class TextWrapper {

    public static String wordWrap(String text) {
        int width = 40; // desired wrap width
        return wrapText(text, width);
    }

    public static String wrapText(String text, int width) {
        StringBuilder wrappedText = new StringBuilder();
        int i = 0;

        while (i < text.length()) {
            int end = Math.min(i + width, text.length());

            // Try not to break in the middle of a word
            if (end < text.length() && text.charAt(end) != ' ') {
                int lastSpace = text.lastIndexOf(' ', end);
                if (lastSpace > i) {
                    end = lastSpace;
                }
            }

            wrappedText.append(text, i, end).append("\n");
            i = end;

            // Skip any space right after the break
            while (i < text.length() && text.charAt(i) == ' ') {
                i++;
            }
        }

        return wrappedText.toString();
    }
}