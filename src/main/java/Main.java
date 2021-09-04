import javax.crypto.Cipher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);
        System.out.println("Select 1:'Encrypt' or 2:'decrypt' or  3:'Exit' for action program");

        Integer Select = option.nextInt();

        if(Select ==1){
            Scanner Text = new Scanner(System.in);
            System.out.println("Enter Text to Encrypt");
            String text = Text.nextLine();
            System.out.println("you inputted" + text);

            Scanner Key = new Scanner(System.in);
            System.out.println("Enter the key ");
            int key = Integer.parseInt(Key.nextLine());
            System.out.println("your inputted key is :" + key);

            Cipher cipher = new Cipher(text, key);
            System.out.println("Encrypted : " + cipher.encrypt());
        }
    }
}
