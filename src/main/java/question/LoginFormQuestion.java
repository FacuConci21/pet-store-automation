package question;

import iu.LoginForm;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class LoginFormQuestion {

    public static Question<String> singInFailed() {
        return actor -> TextContent.of(LoginForm.LI_LABEL).viewedBy(actor).asString();
    }
}
