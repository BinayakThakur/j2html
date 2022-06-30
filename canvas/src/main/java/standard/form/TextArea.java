package standard.form;

import nodes.NodeCreatorForm;

public class TextArea extends NodeCreatorForm{
	public TextArea(int rows,int cols) {
		setTag("textArea");
		setRows(rows);
		setCols(cols);
		
	}

	void setRows(int rows) {
		setValue(getValue()+" rows="+rows);
	}
	void setCols(int cols) {
		setValue(getValue()+" cols="+cols);
	}
}
