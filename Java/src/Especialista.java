// Classe Especialista
public class Especialista {
    private int idEspecialista;
    private String nome;
    private String email;
    private String telefone;
    private String areaAtuacao;

    public Especialista(int idEspecialista, String nome, String email, String telefone, String areaAtuacao) {
        this.idEspecialista = idEspecialista;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.areaAtuacao = areaAtuacao;
    }

    public int getIdEspecialista() {
        return idEspecialista;
    }

    public void setIdEspecialista(int idEspecialista) {
        this.idEspecialista = idEspecialista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void resolverChamado(Chamado chamado) {
        System.out.println("Chamado resolvido com sucesso!");
    }
}