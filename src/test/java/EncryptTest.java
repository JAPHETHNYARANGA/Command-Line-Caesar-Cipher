import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    @Test
    public void testEncrypt(){


            Decrypt decrypt = new Decrypt(23,"hey");
            assertEquals(true, decrypt instanceof Decrypt);

    }

}