import java.util.Date;  // Adicione esta linha no início do arquivo

// Classe Feedback
public class Feedback {
    private int idFeedback;
    private Chamado chamado;
    private Usuario usuario;
    private int nota;
    private String comentario;
    private Date dataFeedback;

    public Feedback(int idFeedback, Chamado chamado, Usuario usuario, int nota, String comentario, Date dataFeedback) {
        this.idFeedback = idFeedback;
        this.chamado = chamado;
        this.usuario = usuario;
        this.nota = nota;
        this.comentario = comentario;
        this.dataFeedback = dataFeedback;
    }

    public int getIdFeedback() {
        return idFeedback;
    }

    public void setIdFeedback(int idFeedback) {
        this.idFeedback = idFeedback;
    }

    public Chamado getChamado() {
        return chamado;
    }

    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getDataFeedback() {
        return dataFeedback;
    }

    public void setDataFeedback(Date dataFeedback) {
        this.dataFeedback = dataFeedback;
    }
}