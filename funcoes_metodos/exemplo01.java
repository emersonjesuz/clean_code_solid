package funcoes_metodos;

public class exemplo01 {

}

class UsuarioRequest {
}

class UsuarioResponse {
}

class Usuario {
}

// exemplo de função ou medodo ruin:
// o metodo ou função deve ser pequeno e fazer apenas uma coisa

class UsuarioController01 {
    public UsuarioResponse cadastrar(UsuarioRequest request) {
        // converte UsuarioRequest em usuario
        // validar dados do Usuario
        // cadastrar usuario
        // converte usuario em usuarioResponse
        return null;
    }
}

// exemplo de funcao ou metodo bom:
// o metodo ou função deve ser pequeno e fazer apenas uma coisa
// ele foi dividio em pequenos metodos
class UsuarioController02 {
    public UsuarioResponse cadastrar(UsuarioRequest request) {

    Usuario usuario(UsuarioParaCadastro);
        usuarioCadastrado = cadastrar(usuario)
        return usuarioToUsuarioResponse(usuarioCadastrado);
    }

    private Usuario usuarioRequestToUsuario(UsuarioRequest request) {
        // converte request em usuario
        return null;
    }

    private void validarUsuario(Usuario) throws  ValidacaoException {
        // validar dados do Usuario
        throw new ValidacaoException("Dados do usuario invalidos");
    }

    private Usuario cadastrar(Usuario usuario) {
        // cadastrar usuario
        return usuario;
    }

    private UsuarioResponse usuarioToUsuarioResponse(Usuario usuario) {
        // converte usuario em usuarioResponse
        return null;
    }
}