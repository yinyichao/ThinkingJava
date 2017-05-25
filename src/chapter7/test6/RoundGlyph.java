package chapter7.test6;

public class RoundGlyph extends Glyph{
	private int radius = 1;
	public RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph() .radius ="+radius);
	}
	void draw(){
		System.out.println("RoundGlyph.draw(),radius = "+radius);
	}
}