package standard.form;

import nodes.NodeCreator;

public class Legend extends NodeCreator{
	public Legend() {
		setTag("label");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}
