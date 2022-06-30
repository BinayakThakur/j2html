package standard.form;

import nodes.NodeCreator;

public class Form extends NodeCreator{
	public Form() {
		setTag("form");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}