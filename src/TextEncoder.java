public class TextEncoder implements Decorator {
        Text text;
    public TextEncoder(Text text) {
        this.text = text;
    }


    @Override
    public String getType() {
        return "Encoded version";
    }

    @Override
    public String getText() {
        try
        {
            EncriptionUtility encriptionUtility =new EncriptionUtility();
            String key="qwertyxcvassadasdasdasdxzczxczxcvcd12345";
            String plain=text.getText().toString();
            String enc= encriptionUtility.encrypt(key, plain);
            return enc;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return e.toString();
        }

    }

}
