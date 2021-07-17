public class TextDecoder implements Decorator {
    Text text;

    public TextDecoder(Text text) {
        this.text = text;
    }


    @Override
    public String getType() {
        return "Decoded version";
    }

    @Override
    public String getText() {

        try {
           // System.out.println(text.getType());

                //System.out.println("in decoder "+text.getText());
                String mainText = text.getText().toString();
                EncriptionUtility encriptionUtility = new EncriptionUtility();
                String key = "qwertyxcvassadasdasdasdxzczxczxcvcd12345";
                String decrypt = encriptionUtility.decrypt(key, mainText);
                return decrypt;

        }
        catch(Exception e)
        {
           return e.toString();
        }

    }
}
