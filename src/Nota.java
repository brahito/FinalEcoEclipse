import processing.core.PApplet;
import processing.core.PImage;

public class Nota {
	private int x;
	private int y;
	private float vel;
	private PApplet app;
	private PImage nota1,nota2,nota3,nota4,nota5;

	public Nota(int x, PApplet app) {
		this.x = x;
		this.app = app;
		y = app.height + 50;
		vel = 8.5f;
		nota1 = app.loadImage("recursos/abajo1.png");
		nota2 = app.loadImage("recursos/arriba1.png");
		nota3 = app.loadImage("recursos/centro.png");
		nota4 = app.loadImage("recursos/arriba2.png");
		nota5 = app.loadImage("recursos/abajo2.png");
	}

	public void pintar() {
		app.imageMode(app.CENTER);
		if(x==100) {
			app.image(nota1, x, y);
		}else if(x==200) {
			app.image(nota2, x, y);
		}else if(x==300) {
			app.image(nota3, x, y);
		}else if(x==400) {
			app.image(nota4, x, y );
		}else if(x==500) {
			app.image(nota5, x, y);
		}
		
		y -= vel;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
