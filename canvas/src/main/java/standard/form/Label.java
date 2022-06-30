package standard.form;

import nodes.NodeCreator;

public class Label  extends NodeCreator{
	public Label() {
		setTag("label");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}
