package nl.bioinf.java_demos.lesson10;

public class EvilDecorator extends TextDecorator {

    public EvilDecorator() {
        super("HellHellHell");
    }

    @Override
    public String decorate() {
        int[] surrogates = {0xD83D, 0xDC7D};
        String alienEmojiString = new String(surrogates, 0, surrogates.length);
        return "#$@@#@!.>> "
                + super.getText()
                + " <<&*$$#@!"
                + alienEmojiString
                + alienEmojiString
                + alienEmojiString;
    }
}
