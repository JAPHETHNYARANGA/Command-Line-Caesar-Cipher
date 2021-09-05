public class Encrypt {
    private String text;
    private int key;


    public Encrypt(int key, String text){
        this.key = key;
        this.text = text;
    }
    public String getInput(){
        return text;
    }
    public int getKey(){
        return key;
    }

    public String encrypt(){
        StringBuilder encryption = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(this.text.charAt(i))) {
                char e = (char) (((int) this.text.charAt(i) + this.key - 65) % 26 + 65);
                encryption.append(e);
            } else {
                char e = (char) (((int) this.text.charAt(1) + this.key - 97) % 26 + 97);
                encryption.append(e);
            }
        }
        return encryption.toString();
    }
}
