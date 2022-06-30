package standard.form;

import nodes.NodeCreator;

public class FieldSet<T> extends NodeCreator{
	public FieldSet(String inside,String legend) {
			setTag("fieldset");
			Legend legends=new Legend();
			legends.setContent(legend);
			setContent(legends.getContent()+inside);
	}
}
