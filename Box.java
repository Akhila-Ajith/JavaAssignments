package controlStructures;

public class Box {
	float width, height,depth;
	Box(){
		width= 0.0f;
		height= 0.0f;
		depth=0.0f;		
	}
	Box(float width, float height, float depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public float volume(float width, float height, float depth) {
		return width*depth*height;
	}
	public float volume() {
		return width*depth*height;
	}
}
