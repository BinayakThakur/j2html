package standard.form;

import java.util.List;

public class CheckBoxGroup {
	StringBuilder group=new StringBuilder("");
	public CheckBoxGroup(List<String> items,String group) {
		for(String item:items) {
			this.group.append((new CheckBox(item, group)).createPairNode());
		}
	}
	public void addItem(String item,String groupID) {
		this.group.append((new CheckBox(item, groupID)).createPairNode());
	}
	public String createCheckGroup() {
		return group.toString();
	}
}


