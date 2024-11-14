package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int currentLineLength = 0;

        for (String word : words) {
            // Check if adding the next word exceeds maxWidth
            if (word.length() + currentLine.size() + currentLineLength > maxWidth) {
                // Format the current line and add it to the result
                int spaces = maxWidth - currentLineLength;
                result.add(ListToString(currentLine, spaces));
                currentLine.clear();
                currentLineLength = 0;
            }
            currentLine.add(word);
            currentLineLength += word.length();
        }

        // Handle the last line with left justification
        if (!currentLine.isEmpty()) {
            StringBuilder lastLine = new StringBuilder(String.join(" ", currentLine));
            while (lastLine.length() < maxWidth) {
                lastLine.append(" ");
            }
            result.add(lastLine.toString());
        }

        return result;
    }

    private String ListToString(List<String> currentLine, int spaces) {
        StringBuilder builder = new StringBuilder();
        int gap = currentLine.size() - 1;

        if (gap == 0) { // Only one word in the line
            builder.append(currentLine.get(0));
            builder.append(" ".repeat(spaces));
        } else {
            int spacesBetweenWords = spaces / gap;
            int extraSpaces = spaces % gap;

            for (int i = 0; i < currentLine.size(); i++) {
                builder.append(currentLine.get(i));
                if (i < gap) {
                    int spaceToAdd = spacesBetweenWords + (extraSpaces-- > 0 ? 1 : 0);
                    builder.append(" ".repeat(spaceToAdd));
                }
            }
        }

        return builder.toString();
    }
}
