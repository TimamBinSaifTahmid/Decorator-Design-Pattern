
public class PlainText implements Text {
   String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String getType() {
        return "Plain Text";
    }

    @Override
    public Object getText() {
        return text;
    }
}
