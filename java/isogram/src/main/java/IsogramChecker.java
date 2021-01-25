class IsogramChecker {

    boolean isIsogram(String phrase) {

        if (phrase == null || phrase == "")
            return true;

        char[] charArray = phrase.toLowerCase().toCharArray();
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.toLowerCase().lastIndexOf(charArray[i]) != i && Character.isLetter(charArray[i])) {
                return false;
            }
        }
        return true;
    }

}
