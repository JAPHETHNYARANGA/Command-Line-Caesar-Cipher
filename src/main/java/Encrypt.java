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
}
