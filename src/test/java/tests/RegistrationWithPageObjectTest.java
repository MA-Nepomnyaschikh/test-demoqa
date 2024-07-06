package tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationWithPageObjectTest extends BaseTest {

    String firstName = "Alexey";
    String lastName = "Egorov";
    String email = "aegorov@mail.com";
    String gender = "Male";
    String phone = "9090909090";
    String[] dayOfBirthday = {"30", "July", "1998"};
    String subject = "Chemistry";

    @Test
    void fillFormTest() {

        registrationPage.openPage()
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setEmail(email)
                        .setGender(gender)
                        .setPhone(phone)
                        .setBirthday(dayOfBirthday[0], dayOfBirthday[1], dayOfBirthday[2]);

        $("#subjectsInput").setValue("Chemistry").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
        $("#uploadPicture").uploadFromClasspath("cat.png");
        $("#currentAddress").setValue("currentAddress1");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").click();

        registrationPage.verifyResultModalAppears()
                        .verifyResult("Student Name", firstName + " " + lastName)
                        .verifyResult("Student Email", email)
                        .verifyResult("Gender", gender)
                        .verifyResult("Mobile", phone)
                        .verifyResult("Date of Birth", dayOfBirthday[0] + " " + dayOfBirthday[1] + "," + dayOfBirthday[2])
                        .verifyResult("Subjects", subject)
                        .verifyResult("Hobbies", "Sports")
                        .verifyResult("Picture", "cat.png")
                        .verifyResult("Address", "currentAddress1")
                        .verifyResult("State and City", "NCR Delhi");
    }
}
