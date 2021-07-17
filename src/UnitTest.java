import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Test
    public void testPlainText(){
       String newText="I am Tahmid";
        Text text=new PlainText(newText);
        assertEquals("Plain Text",text.getType());


        assertEquals(newText,text.getText());

    }
    @Test
    public void testEncoding(){
        String newText="I am Tahmid";
        Text text=new PlainText(newText);
        text=new TextEncoder(text);
        text=new TextDecoder(text);
        assertEquals(newText,text.getText());

      String newText2="hello world";
        Text text2=new PlainText(newText2);
        text2=new TextEncoder(text2);
        text2=new TextDecoder(text2);
        assertEquals(newText2,text2.getText());
    }
    @Test
    public void testCompresser(){
        String str="I am Tahmid";
        Text text=new PlainText(str);
        text=new TextCompresser(text);
        text=new TextDecompresser(text);
        assertEquals(str,text.getText());
    }

    @Test
    public void testComplete(){
        String newText="I am Tahmid";
        Text text=new PlainText(newText);
        text=new TextEncoder(text);
        text=new TextEncoder(text);
        text=new TextCompresser(text);
        text=new TextDecompresser(text);
        text=new TextDecoder(text);
        text=new TextDecoder(text);
        assertEquals(newText,text.getText());
    }
}
