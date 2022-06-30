package standard.form;

import nodes.NodeCreator;

public class Div  extends NodeCreator{
	public Div() {
		setTag("div");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}
