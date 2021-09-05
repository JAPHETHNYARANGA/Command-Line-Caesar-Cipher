import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {
    @Test
    public void decriptTest(){
        Decrypt decrypt = new Decrypt(23,"hey");
        assertEquals(true, decrypt instanceof Decrypt);
    }

}