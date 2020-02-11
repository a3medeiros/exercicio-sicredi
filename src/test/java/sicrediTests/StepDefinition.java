package sicrediTests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import sicrediTests.pages.ResultadoSimuladorSicredi;
import sicrediTests.pages.SicrediSimuladorPage;
import sicrediTests.support.Constantes;
import sicrediTests.support.Web;

public class StepDefinition {

    @Before
    public void setUp() {
        Web.driver = Web.createChrome();
    }

    @After
    public void tearDown() {
        Web.driver.quit();
    }

    @Dado("que o navegador esteja na página de simulador da Sicredi")
    public void que_o_navegador_esteja_na_página_de_simulador_da_Sicredi() {
        Web.driver.get(Constantes.SICREDI_SIMULADOR_URL);
    }

    @Então("é possível ver campos do formulário")
    public void é_possível_ver_campos_do_formulário() {
        boolean retorno = new SicrediSimuladorPage(Web.driver).formularioExiste();
        Assert.assertTrue(retorno);
    }

    @Quando("o associado preenche o formulário com o {string}")
    public void o_associado_preenche_o_formulário_com_o(String valor) {
        new SicrediSimuladorPage(Web.driver).preencheValores(valor);
    }

    @Quando("com a {string} válidos")
    public void com_a_e_válidos(String qtdTempo) {
        new SicrediSimuladorPage(Web.driver).escreverQuantidadeTempo(qtdTempo);
    }

    @Quando("realiza a simulação")
    public void realiza_a_simulação() {
        new SicrediSimuladorPage(Web.driver).clicaSimular();
    }

    @Então("valor a ser poupado no tempo pesquisado é exibido")
    public void valor_a_ser_poupado_no_tempo_pesquisado_é_exibido() {
        boolean retorno = new ResultadoSimuladorSicredi(Web.driver).valorEhExibido();
        Assert.assertTrue(retorno);
    }

    @Então("tabela de outras opções é exibida")
    public void tabela_de_outras_opções_é_exibida() {
        boolean retorno = new ResultadoSimuladorSicredi(Web.driver).tabelaDeValoresExiste();
        Assert.assertTrue(retorno);
    }

    @Quando("o associado digita o {string} no campo de quantia de aplicação")
    public void o_associado_digita_o_no_campo_de_quantia_de_aplicação(String valor) {
        new SicrediSimuladorPage(Web.driver).escreveValorDeAplicacao(valor);
    }

    @Quando("o associado digita o {string} no campo de quantia de poupança")
    public void o_associado_digita_o_no_campo_de_quantia_de_poupança(String valor) {
        new SicrediSimuladorPage(Web.driver).escreveValorDePoupança(valor).clickTempo();
    }

    @Então("mensagem de valor inválido é exibida")
    public void mensagem_de_valor_inválido_é_exibida() {
        String retornoAplicacao = new SicrediSimuladorPage(Web.driver).mensagemErroAplicacao();
        String retornoPoupado = new SicrediSimuladorPage(Web.driver).mensagemErroPoupado();
        Assert.assertEquals(Constantes.MESSAGEM_VALOR_MIN, retornoAplicacao);
        Assert.assertEquals(Constantes.MESSAGEM_VALOR_MIN, retornoPoupado);
    }

    @Quando("clica em Limpar Formulário")
    public void clica_em_Limpar_Formulário() {
        new SicrediSimuladorPage(Web.driver).clicaLimparFormulario();
    }


    @Então("formulario de simulação é exibido vazio")
    public void formulario_de_simulação_é_exibido_vazio() {
        Assert.assertEquals("",new SicrediSimuladorPage(Web.driver).textoCampoAplicacao());
        Assert.assertEquals("",new SicrediSimuladorPage(Web.driver).textoCampoPoupanca());
        Assert.assertEquals("",new SicrediSimuladorPage(Web.driver).textoCampoQtdTempo());
    }

    @Quando("após ver os valores deseja realizar uma nova pesquisa voltando para a tela inicial")
    public void após_ver_os_valores_deseja_realizar_uma_nova_pesquisa_voltando_para_a_tela_inicial() {
      new ResultadoSimuladorSicredi(Web.driver).clicaNovaSimulacao();
    }
}
