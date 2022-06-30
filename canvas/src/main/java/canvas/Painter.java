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
	
	
		canvas.paint();
	}
	

}

