import processing.core.PApplet;
import processing.core.PImage;

public class Area {
	private int x;
	private int y,xA,yA;
	private PApplet app;
	private PImage nota1,nota2,nota3,nota4,nota5;


	public Area(int x, PApplet app) {
		this.x = x;
		this.app = app;
		y = 150;
		xA=x;
		yA=y;
		nota1 = app.loadImage("recursos/abajo1.png");
		nota2 = app.loadImage("recursos/arriba1.png");
		nota3 = app.loadImage("recursos/centro.png");
		nota4 = app.loadImage("recursos/arriba2.png");
		nota5 = app.loadImage("recursos/abajo2.png");
	}

	public void pintar() {
		app.noStroke();
		app.ellipseMode(app.CENTER);
		app.fill(0, 255, 0);
		app.ellipse(x, y, 100, 100);
		app.fill(0, 0, 255);
		app.ellipse(x, y, 50, 50);
	}

	public void pintarArea() {
		app.imageMode(app.CENTER);
		if(x==100) {
			app.image(nota1, xA, yA);
		}else if(x==200) {
			app.image(nota2, xA, yA);
		}else if(x==300) {
			app.image(nota3, xA, yA);
		}else if(x==400) {
			app.image(nota4, xA, yA);
		}else if(x==500) {
			app.image(nota5, xA, yA);
		}
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
