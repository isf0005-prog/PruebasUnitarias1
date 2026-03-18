package instituto;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class ValidadorRegistroTest {
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }
    @Test
    @DisplayName("Reto 1: Nombre vacío debe ser rechazado")
    public void testNombreVacio() {
        boolean resultado = validador.validarNombre("");
        assertFalse("Error: Se aceptó un nombre vacio", resultado);
    }

    @Test
    @DisplayName("Reto 2: Password de 8 caracteres debe ser aceptada")
    public void testPasswordJusta() {
        boolean resultado = validador.validarPassword("12345678");
        assertTrue(resultado, "Error: Se rechazó una contraseña válida de 8 caracteres");
    }

    @Test
    @DisplayName("Reto 3: Password corta debe ser rechazada")
    public void testPasswordCorta() {
        boolean resultado = validador.validarPassword("Admin");
        assertFalse("Error: Se aceptó una contraseña demasiado corta", resultado);
    }

    @Test
    @DisplayName("Reto 4: Email sin arroba debe ser rechazado")
    public void testEmailSinArroba() {
        boolean resultado = validador.validarEmail("usuario.gmail.com");
        assertFalse("Error: Se aceptó un email inválido", resultado);
    }

    @Test
    @DisplayName("Reto 5: Edad mínima (16) debe ser aceptada")
    public void testEdadLimite() {
        boolean resultado = validador.validarEdad(16);
        assertTrue(resultado, "Error: Se rechazó una edad válida (16)");
    }

}



