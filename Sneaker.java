public class Sneaker {

private String sneakerBrand;
private double sneakerSize;
private String sneakerColor;

public Sneaker() {
	sneakerBrand = "Nike";
	sneakerSize = 9.5;
	sneakerColor = "orange";
}
public Sneaker(String newSneakerBrand, double newSneakerSize) {
	sneakerBrand = newSneakerBrand;
	sneakerSize = newSneakerSize;
}
public Sneaker(String newSneakerBrand, double newSneakerSize, String newSneakerColor) {
	sneakerBrand = newSneakerBrand;
	sneakerSize = newSneakerSize;
	sneakerColor = newSneakerColor;
}
boolean realSneakerSize() {
	if(sneakerSize < 15) {
		return true;
	}
	return false;
}
String anotherSneakerColor() {
	return "burgandy";
	
//Getters and Setters Below
}
	public String getSneakerBrand() {
	return sneakerBrand;
}
public void setSneakerBrand(String sneakerBrand) {
	this.sneakerBrand = sneakerBrand;
}
public double getSneakerSize() {
	return sneakerSize;
}
public void setSneakerSize(double sneakerSize) {
	this.sneakerSize = sneakerSize;
}
public String getSneakerColor() {
	return sneakerColor;
}
public void setSneakerColor(String sneakerColor) {
	this.sneakerColor = sneakerColor;
}
	public static void main(String[] args) {
		

	}

}
