package lesson_6_allure.tests;

import lesson_6_allure.steps.WebSteps;
import org.junit.jupiter.api.Test;

public class StepAnnotatedTests {
    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final Integer ISSUE_NUMBER = 66;
    private WebSteps steps = new WebSteps();

    @Test
    public void testGithub() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssueTab();
        steps.shouldSeeIssueNumber(ISSUE_NUMBER);
    }
}
