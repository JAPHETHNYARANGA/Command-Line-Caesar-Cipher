import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherDecryptTest {
    @Test
    public void decriptTest(){
        CipherDecrypt cipherdecrypt = new CipherDecrypt(23,"hey");
        assertEquals(true, cipherdecrypt instanceof CipherDecrypt);
    }
}