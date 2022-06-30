package standard.form;

import nodes.NodeCreatorForm;

public class InputBox extends NodeCreatorForm{
	public InputBox() {
		setTag("input");
		setType("text");
		
	}
	void setInputContent(String content) {
		setContent(content);
	}
}

