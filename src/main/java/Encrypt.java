public class Encrypt {
    private int key;
    private String text;

    public Encrypt( int key, String text){
        this.key = key;
        this.text = text;
    }
    public String getInput(){
        return text;
    }
    public int getKey(){
        return key;
    }

    public String encryption(){
        StringBuilder encryption = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(this.text.charAt(i))) {
                char e = (char) (((int) this.text.charAt(i) + this.key - 50) % 20 + 55);
                encryption.append(e);
            } else {
                char e = (char) (((int) this.text.charAt(1) + this.key - 45) % 30 + 45);
                encryption.append(e);
            }
        }
        return encryption.toString();
    }

}
