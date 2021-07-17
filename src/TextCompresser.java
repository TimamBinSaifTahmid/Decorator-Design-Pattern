public class TextCompresser implements Decorator  {
    Text text;

    public TextCompresser(Text text) {
        this.text = text;
    }

    @Override
    public String getType() {
        return "Text compressed";
    }

    @Override
    public Object getText() {
        String str=text.getText().toString();
        CompressionUtility compressionUtility=new CompressionUtility();
        try {
           byte [] compressed= compressionUtility.compress(str);
            return compressed;
        }catch (Exception e){
            return e.toString();
        }

    }
}
