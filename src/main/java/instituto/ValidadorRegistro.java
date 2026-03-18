package instituto;public class ValidadorRegistro {
    public boolean validarNombre(String nombre) {
        return nombre != null && !nombre.isEmpty();
    }

    public boolean validarPassword(String password) {
        return password.length() >= 8;
    }

    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    public boolean validarEdad(int edad) {
        return edad >= 16;
    }
}
