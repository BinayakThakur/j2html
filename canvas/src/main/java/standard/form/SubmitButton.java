package standard.form;

import nodes.NodeCreatorForm;

public class SubmitButton extends NodeCreatorForm{
	public SubmitButton() {
		setTag("input");
		setType("submit");
	}
	public void setButtonContent(String content) {
		setButtonContent(content);
	}

}
