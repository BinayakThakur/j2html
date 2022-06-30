package standard.text;

import nodes.NodeCreator;

public class Paragraph extends NodeCreator{
	public Paragraph() {
		setTag("p");
	}
	void setParagraphContent(String content) {
		setContent(content);
	}
}
