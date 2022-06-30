package standard.text;

import nodes.NodeCreator;

public class Blockquote extends NodeCreator{
	public Blockquote() {
		setTag("blockquote");
	}
	void setBlockQuoteContent(String blockquote) {
		setContent(blockquote);
	}
}
