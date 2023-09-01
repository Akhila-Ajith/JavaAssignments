package Class_And_Objects;

public class Volume {
	float width,height,depth;
	Volume(float width, float height, float depth){
		this.width=width;
		this.height=height;
		this.depth=depth;}
	public float volume() {
		return width*depth*height;
}
}