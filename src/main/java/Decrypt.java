public class Decrypt {
    private String text;
    private int key;


    public Decrypt(int key, String text){
        this.key = key;
        this.text = text;
    }
    public String getInput(){
        return text;
    }
    public int getKey(){
        return key;
    }

    public String Decrypt(){
        StringBuffer decryption = new StringBuffer();
        for (int h = 0; h < text.length(); h++){
            if (Character.isUpperCase(this.text.charAt(h))) {
                char e = (char) (((int) this.text.charAt(h) + this.key - 65) % 26 + 65);
                decryption.append(e);
            } else {
                char e = (char) (((int) this.text.charAt(h) + this.key - 97) % 26 + 97);
                decryption.append(e);
            }
        }
        return decryption.toString();



    }
}
