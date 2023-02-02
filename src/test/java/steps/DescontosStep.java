package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {
HomePage homePage = new HomePage(driver);

    @Dado("^que eu estou no site da qazando$")
    public void que_eu_estou_no_site_da_qazando()  {
        homePage.acessarAplicacao("http://qazando.com.br/curso.html");
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencherEmail("12345@gmail.com");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom(){
        homePage.clicarBotaoGanharCupom();

    }

    @Então("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto()  {
       homePage.validarCupomDesconto("QAZANDO15OFF");

    }




}
