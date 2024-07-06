package demoqa;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $(".text-center").shouldHave(text("Text Box"));

        $("#userName").setValue("Alexey Egorov");
        $("#userEmail").setValue("petrovich@mail.com");
        $("#currentAddress").setValue("currentAddress1");
        $("#permanentAddress").setValue("permanentAddress1");
        $("#submit").click();

        $("#output").shouldBe(visible);
        $("#output").$("#name").shouldHave(text("Alexey Egorov"));
        $("#output").$("#email").shouldHave(text("petrovich@mail.com"));
    }
}
