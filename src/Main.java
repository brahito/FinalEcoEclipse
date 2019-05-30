import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Main extends PApplet {
	Minim minim;
	AudioPlayer song;
	private Logica log;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");
	}

	public void settings() {
		size(1200, 700);

	}

	public void setup() {
		log = new Logica(this);
		minim = new Minim(this);

		// this loads mysong.wav from the data folder
		song = minim.loadFile("Cancion.mp3");
		
	}

	public void draw() {
		log.pintar();
		smooth();
		if(log.getPantalla()==3) {
			song.rewind();
			song.play();
		}
	}

	public void keyPressed() {
		log.tecla();
	}

}
