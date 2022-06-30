package standard.form;

import java.util.List;

import nodes.NodeCreatorForm;

public class DataList extends NodeCreatorForm{
	public DataList(){
		setTag("datalist");
	}
	public void add(String option) {
		Option ops=new Option();
		setContent(getContent()+ops.createPairNode());
	}
	public void addAll(List<String> options) {
		for(String option : options) {
			add(option);
		}
	}
}
