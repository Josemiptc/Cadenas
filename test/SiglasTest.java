import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SiglasTest {

    @Test
    void siglas() {
        assertEquals("EOI", Siglas.siglas("Escuela Oficial de Idiomas"));
    }
}