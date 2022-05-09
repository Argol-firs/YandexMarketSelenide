package Steps;

import lombok.Getter;

@Getter
public class StepManager extends ActionOnPage {
    protected ActionOnPage page;

    public StepManager() {
        this.page = new ActionOnPage();
    }
}
