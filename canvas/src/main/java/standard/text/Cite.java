package standard.text;

import nodes.NodeCreator;

public class Cite extends NodeCreator{
	public Cite() {
		setTag("cite");
	}
	void setCiteText(String content) {
		setContent(content);
	}
}
