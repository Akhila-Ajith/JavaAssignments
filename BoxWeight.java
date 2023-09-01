package Inheritance;

public class BoxWeight extends Box{
	private int weight;

	public BoxWeight(float width, float height, float depth, int weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "[weight=" + weight+ "]";
	}
	

}
