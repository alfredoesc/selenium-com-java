import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    @Before //Annotation que faz com que o método seja feito antes de todos os @Test
    public void abreBrowser() { //Método para abrir o browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Osama\\Documents\\TT-Curso_de_Teste\\drivers\\chromedriver.exe");
        //Comando pra pegar o driver do Chrome pro Selenium
        WebDriver driver = new ChromeDriver();
        //Objeto para abrir o browser
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Comando para aguardar o browser abrir
    }

    @Test
    public void loginComSucesso() { //Criamos um método: tipo do método (public) retorno (void) e nome do método (loginComSucesso)

    }

    @Test
    public void loginSemSucesso() {

    }

    @After //Annotation que faz com que o método seja feito depois de todos os @Test
    public void fechaBrowser() {
        
    }
}
