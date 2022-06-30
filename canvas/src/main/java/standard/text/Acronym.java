package standard.text;

import nodes.NodeCreator;

public class Acronym extends NodeCreator{
	public Acronym() {
		setTag("acronym");
	}
	void setAcronymContent(String content) {
		setContent(content);
	}
}
