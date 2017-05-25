package chapter7.test6;

public class Glyph {
	void draw(){
		System.out.println("Glypy.draw()");
	}
	Glyph(){
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}
