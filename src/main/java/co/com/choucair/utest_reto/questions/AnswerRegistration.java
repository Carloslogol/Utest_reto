package co.com.choucair.utest_reto.questions;

import co.com.choucair.utest_reto.model.UserInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.utest_reto.userinterface.PageFinishRegister.*;

public class AnswerRegistration implements Question<Boolean> {

    private final List<UserInformation> data;

    public AnswerRegistration(List<UserInformation> data) {
        this.data = data;
    }

    public static AnswerRegistration answerRegistration(List<UserInformation> data) {
        return new AnswerRegistration(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String textButtonFinal = Text.of(BUTTON_FINISH).viewedBy(actor).asString();

        return data.get(0).getTextFinal().equals(textButtonFinal);
    }
}
