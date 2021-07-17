public class TextDecompresser implements Decorator {
    Text text;
    @Override
    public String getType() {
        return "Text decompressed";
    }

    public TextDecompresser(Text text) {
        this.text = text;
    }

    @Override
    public String getText() {
        byte []compressed= (byte[]) text.getText();
        CompressionUtility compressionUtility=new CompressionUtility();
        try {
           String str= compressionUtility.decompress(compressed);
           return str;
        }catch (Exception e){
            return e.toString();
        }

    }
}
