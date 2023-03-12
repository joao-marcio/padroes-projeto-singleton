package padroescriacao.singleton;

public class Estabelecimento {

    private Estabelecimento() {};
    private static Estabelecimento instance = new Estabelecimento();
    public static Estabelecimento getInstance() {
        return instance;
    }

    private String nomeLoja;
    private String funcionarioCaixa;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getUsuarioLogado() {
        return funcionarioCaixa;
    }

    public void setUsuarioLogado(String funcionarioCaixa) {
        this.funcionarioCaixa = funcionarioCaixa;
    }
}
