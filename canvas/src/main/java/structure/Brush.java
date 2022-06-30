package structure;

import canvas.WireFrame;
;
public class Brush extends WireFrame{
	 public static void setPageTitle(String newTitle) {
	    	title=newTitle;
	 }
	 public static void addNode(Object node) {
		 components=components.append("<br/>"+node.toString());
	 }
	 public static void addNode(Object node,String customTag) {
		 components=components.append("<"+customTag+">"+node.toString()+"<"+customTag+"/>");
	 }
	 public static void addNodeWithoutBreak(Object node) {
		 components.append(node.toString());
	 }
	 public static void clearNodes() {
		 components=new StringBuilder();
	 }
}
