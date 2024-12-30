import java.util.Date;  // Adicione esta linha no início do arquivo

// Classe Chamado
public class Chamado {
    private int idChamado;
    private Usuario usuario;
    private Categoria categoria;
    private String descricao;
    private Date dataAbertura;
    private String status;
    private String prioridade;
    private Especialista especialista;
    private Date dataEncerramento;

    public Chamado(int idChamado, Usuario usuario, Categoria categoria, String descricao, Date dataAbertura, String status, String prioridade, Especialista especialista) {
        this.idChamado = idChamado;
        this.usuario = usuario;
        this.categoria = categoria;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.status = status;
        this.prioridade = prioridade;
        this.especialista = especialista;
    }

    public int getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(int idChamado) {
        this.idChamado = idChamado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public Date getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public void classificarChamado() {
        System.out.println("Chamado classificado com sucesso!");
    }

    public void direcionarParaEspecialista() {
        System.out.println("Chamado direcionado para o especialista!");
    }
}