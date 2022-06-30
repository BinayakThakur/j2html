package standard.list;

import java.util.List;

import nodes.NodeCreator;

public class StandardList extends NodeCreator{
	String listType="ol";
	public StandardList(){
		setTag("p");
		setContent("");
	}
	public void changeToOrderedList() {
		listType="ol";
		setTag("ol");
	}
	public void changeToUnorderedList() {
		listType="ul";
		setTag("ul");
	}
	
	public void changeToDescriptionList() {
		listType="dl";
		setTag("dl");
	}
	public void addItem(String item) {
		if(!listType.equals("dl")) {
			ListItem newItem=new ListItem();
			newItem.setContent(item);
			setContent(getContent()+newItem.createPairNode());
			
		}
	}
	public void addDescriptionItem(String item,List<String> description) {
		DT dt=new DT();
		DD dd=new DD();
		dt.setContent(item);
		setContent(getContent()+dt.createPairNode());
		for(String x : description) {
			dd.setContent(x);
			setContent(getContent()+dd.createPairNode());
		}
	}
}
