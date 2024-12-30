import java.util.Date;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String telefone;
    private Date dataCadastro;

    public Usuario(int idUsuario, String nome, String email, String telefone, Date dataCadastro) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }

    // Getters e Setters
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public Date getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(Date dataCadastro) { this.dataCadastro = dataCadastro; }

    // Métodos
    public void abrirChamado(String descricao, Categoria categoria) {
        System.out.println("Chamado aberto com sucesso!");
    }

    public void fornecerFeedback(Chamado chamado, int nota, String comentario) {
        System.out.println("Feedback fornecido com sucesso!");
    }
}
