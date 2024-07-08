package tests;

import org.junit.jupiter.api.Test;

public class RegistrationWithPageObjectTest extends BaseTest {

    String firstName = "Alexey";
    String lastName = "Egorov";
    String email = "aegorov@mail.com";
    String gender = "Male";
    String phone = "9090909090";
    String[] dayOfBirthday = {"30", "July", "1998"};
    String subject = "Chemistry";
    String hobbies = "Sports";
    String fileName = "cat.png";
    String address = "currentAddress1";
    String state = "NCR";
    String city = "Delhi";

    @Test
    void fillFormTest() {

        registrationPage.openPage()
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setEmail(email)
                        .setGender(gender)
                        .setPhone(phone)
                        .setBirthday(dayOfBirthday[0], dayOfBirthday[1], dayOfBirthday[2])
                        .setSubject(subject)
                        .setHobbies(hobbies)
                        .uploadPicture(fileName)
                        .setAddress(address)
                        .setState(state)
                        .setCity(city)
                        .clickOnSubmitButton()
                        .verifyResultModalAppears()
                        .verifyResult("Student Name", firstName + " " + lastName)
                        .verifyResult("Student Email", email)
                        .verifyResult("Gender", gender)
                        .verifyResult("Mobile", phone)
                        .verifyResult("Date of Birth", dayOfBirthday[0] + " " + dayOfBirthday[1] + "," + dayOfBirthday[2])
                        .verifyResult("Subjects", subject)
                        .verifyResult("Hobbies", hobbies)
                        .verifyResult("Picture", fileName)
                        .verifyResult("Address", address)
                        .verifyResult("State and City", state + " " + city);
    }
}
