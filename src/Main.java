import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A text: ");
        String newText=scanner.nextLine();
        Text text=new PlainText(newText);
        System.out.println(text.getType()+"  "+text.getText()+"\n");
       text=new TextEncoder(text);
        System.out.println(text.getType()+" "+text.getText()+"\n");
       text=new TextEncoder(text);
        System.out.println(text.getType()+" "+text.getText()+"\n");
        text=new TextCompresser(text);
        System.out.println(text.getType()+" "+text.getText()+"\n");
        text=new TextDecompresser(text);
        System.out.println(text.getType()+" "+text.getText()+"\n");
       text=new TextDecoder(text);
        System.out.println(text.getType()+" "+text.getText()+"\n");
       text=new TextDecoder(text);
        System.out.println(text.getType()+" "+text.getText()+"\n");

    }
}
