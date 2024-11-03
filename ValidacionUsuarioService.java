public class ValidacionUsuarioService {
    public boolean validarNombre(Usuario usuario) {
        return usuario.getNombre() != null && !usuario.getNombre().isEmpty();
    }
}
