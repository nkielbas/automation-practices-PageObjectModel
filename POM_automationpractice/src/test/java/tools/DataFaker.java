package tools;

import com.github.javafaker.Faker;

public class DataFaker {

    private Faker faker;

    public DataFaker() {
        faker = new Faker();
    }

    public String FakeFirstname() {
        return faker.name().firstName();
    }

    public String FakeLastname() {
        return faker.name().lastName();
    }

    public String FakeEmail() {
        return faker.internet().emailAddress();
    }

    public String FakePassword() {
        return faker.internet().password();
    }

}
