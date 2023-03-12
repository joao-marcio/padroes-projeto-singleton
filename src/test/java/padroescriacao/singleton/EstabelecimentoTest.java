package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstabelecimentoTest {

    @Test
    public void deveRetornarNomeLoja() {
        Estabelecimento.getInstance().setNomeLoja("Bar do Zé");
        assertEquals("Bar do Zé", Estabelecimento.getInstance().getNomeLoja());
    }

    @Test
    public void deveRetornarFuncionarioCaixa() {
        Estabelecimento.getInstance().setUsuarioLogado("Caio");
        assertEquals("Caio", Estabelecimento.getInstance().getUsuarioLogado());
    }

}