
public class Television {
private String mark;
private String generation;
private float price;

public void setMark(String mark) {
	this.mark = mark;
}

public String getMark() {
	return mark;
}

public void setGeneration(String generation) {
	this.generation = generation;
}

public String getGeneration() {
	String wowLocal = "wow";
	return generation + wowLocal;
}

public void setPrice(float price) {
	this.price = price;
}

public float getPrice() {
	return price;
}

public static void main(String[] args) {
	Television tele = new Television();
	tele.setMark("sony");
	tele.setGeneration("huitième génération");
	tele.setPrice(800.52f);
	System.out.print(tele.getMark() + "coute" + tele.getPrice() + "euro");
}
}
