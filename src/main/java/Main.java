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
            System.out.println("The text to Encrypt is" + text);

            Scanner Key = new Scanner(System.in);
            System.out.println("Enter the key that'll be used to Decrypt ");
            int key = Integer.parseInt(Key.nextLine());
            System.out.println("your inputted key is :" + key);


           Encrypt encrypt = new Encrypt(key, text);
                System.out.println("Message Encrypted " + encrypt.encrypt());
        }else if(Select == 2){
            Scanner decryptText = new Scanner(System.in);
            System.out.println("Enter text to Decrypt ");
            String text = decryptText.nextLine();
            System.out.println("The text to Decrypt is: " + text);

            Scanner decryptKey2 = new Scanner(System.in);
            System.out.println("Enter the key that is used to Decrypt");
            int key = Integer.parseInt(decryptKey2.nextLine());
            System.out.println("The key is: " + key);

            Decrypt ciphertext = new Decrypt(key, text);
            System.out.println("The decrypted text is: " + ciphertext.Decrypt());

        }else if(Select == 3){
            System.out.println("Application is Exiting Now");

        }else{
            System.out.println("Select from the provided options");

        }
    }
}
