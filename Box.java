package Inheritance;

public class Box {
	float width, height,depth;
	Box(float width, float height, float depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public float volume() {
		return width*depth*height;
	}
}
