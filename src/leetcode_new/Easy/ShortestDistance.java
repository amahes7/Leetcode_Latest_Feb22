package leetcode_new.Easy;

public class ShortestDistance {

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int min = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                for (int j = 0; j < wordsDict.length; j++) {
                    if (wordsDict[j].equals(word2)) {
                        min = Math.min(min, Math.abs(j - i));
                    }
                }
            }
        }
        return min;
    }


    public int shortestDistanceOp(String[] wordsDict, String word1, String word2) {
        int w1 = -1, w2 = -1, min = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) w1 = i;
            if (wordsDict[i].equals(word2)) w2 = i;
            if (w1 != -1 && w2 != -1) min = Math.min(min,Math.abs(w1-w2));
        }
        return min;
    }
}
