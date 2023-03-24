import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class New_autotest1 {
    @Test
    public void userAuthorization() throws InterruptedException {
        open("https://cp.selzy.com/ua/v5/login");
        $(byXpath("//input[@data-test='input-login']")).setValue("email");
        $(byXpath("//input[@data-test='input-password']")).setValue("pass");
        $(byXpath("//button[@data-test='btn-login']")).click();
        $(".fullpage").shouldBe(visible);

    }
}
