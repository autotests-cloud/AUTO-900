package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка чего--нибудь")
    void generatedTest() {
        step("Открыть yandex.ru", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать 1", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать 2", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать 3", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить, что кнопки нажаты", () -> {
            step("// todo: just add selenium action");
        });
    }
}