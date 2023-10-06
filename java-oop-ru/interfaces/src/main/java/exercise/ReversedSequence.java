package exercise;

// BEGIN
class ReversedSequence {

    private CharSequence text;

    public ReversedSequence(CharSequence text) {
        text = new StringBuilder().reverse().toString();
        this.text = text;
    }

    public int length() {
        return text.length();
    }

    public char charAt(int index) {

        return text.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return text.subSequence(start, end);
    }

    public String toString() {
        return text.toString();
    }
}
// END