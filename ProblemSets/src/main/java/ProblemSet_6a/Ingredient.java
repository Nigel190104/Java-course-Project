package ProblemSet_6a;

public class Ingredient {
     private String name;
     private IngredientType type;
     private Supplier supplier;
     private double rawWeight;

 	public Ingredient(String name, IngredientType type, Supplier supplier, double rawWeight) {
		this.name = name;
		this.type = type;
		this.supplier = supplier;
		this.rawWeight = rawWeight;
	}

 	public double getCookedWeight() {
 		return this.rawWeight*0.8;
 	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IngredientType getType() {
		return type;
	}

	public void setType(IngredientType type) {
		this.type = type;
	}

	public String getSupplier() {
		return supplier.toString();
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public double getRawWeight() {
		return rawWeight;
	}

	public void setRawWeight(double rawWeight) {
		this.rawWeight = rawWeight;
	}
}


