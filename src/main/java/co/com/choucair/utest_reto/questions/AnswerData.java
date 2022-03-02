package co.com.choucair.utest_reto.questions;

import co.com.choucair.utest_reto.model.Utest_data;
import co.com.choucair.utest_reto.userinterface.PageFinish;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.utest_reto.userinterface.PageFinish.*;

public class AnswerData implements Question<Boolean> {

    private List<Utest_data> data;

    public AnswerData(List<Utest_data> data) {
        this.data = data;
    }

    public static AnswerData answer(List<Utest_data> data) {
        return new AnswerData(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String textButtonFinal = Text.of(BUTTON_FINISH).viewedBy(actor).asString();

        return data.get(0).getTextFinal().equals(textButtonFinal);
    }
}
