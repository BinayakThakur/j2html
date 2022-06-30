package canvas;

import java.awt.CheckboxGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import custom.tags.CustomForm;
import nodes.NodeCreator;
import standard.form.Button;
import standard.form.CheckBoxGroup;
import standard.form.InputBox;
import standard.form.Label;
import standard.form.RadioButton;
import standard.form.RadioGroup;
import standard.form.Select;
import standard.form.SubmitButton;
import standard.link.Image;
import standard.link.Link;
import standard.list.StandardList;
import standard.table.Table;
import standard.text.Cite;
import standard.text.Heading;
import standard.text.Paragraph;
import structure.Brush;

public class Painter extends Brush{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub\
		
		Canvas canvas=new Canvas();
		/*
		 * Setting up meta data
		 */
		setPageTitle("Let's Roll");
		clearNodes();

		
		/*
		 * Painting
		 */
		makeList(Arrays.asList("Data1","Data2","Data3","Data4","Data5"));
	
		canvas.paint();
	}
	
	public static void makeTable(List<List<String>> data,List<String> headings) {
		//Creating component
		Table myTable=new Table();
		
		//Adding Heading
		myTable.addHeading(headings);
		
		//Adding Data
		data.forEach(myTable::addData);
		
		//Adding Table.page
		addNode(myTable.createPairNode());
	}
	
	public static void makeList(List<String> data) {
		StandardList list=new StandardList();
		//Ordered List
		list.changeToOrderedList();
		data.forEach(list::addItem);
		addNode(list.createPairNode());
		//Unordered List
		list.changeToUnorderedList();
		addNode(list.createPairNode());
		//Description List
		list.setContent("");
		list.changeToDescriptionList();
		list.addDescriptionItem("This is description list", data);
		addNode(list.createPairNode());
	}
}
