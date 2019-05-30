import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica implements Observer {
	private PApplet app;
	private LinkedList<Nota> notas;
	private Area a1, a2, a3, a4, a5;
	private int estado, pantalla, perfect, miss, bad, good, puntitos, combo;
	private int contador;
	private int r;
	private int x;
	private int segundos, secSplash;
	private boolean stop = false;
	private PImage inicio;
	private DatagramSocket ds;
	private ConexionUDP conexion;
	public Logica(PApplet app) {
		this.app = app;
		notas = new LinkedList<Nota>();
		a1 = new Area(100, app);
		a2 = new Area(200, app);
		a3 = new Area(300, app);
		a4 = new Area(400, app);
		a5 = new Area(500, app);
		segundos = -130;
		estado = 0;
		secSplash = 0;
		inicio = app.loadImage("recursos/inicio.jpg");
		combo = 0;
		contador = 0;
		r = 0;
		pantalla = 1;
		x = 0;
		this.conexion = ConexionUDP.getInicializar();
		this.conexion.setObservador(this);
	}

	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

	public void pintar() {
		app.background(255);

		switch (pantalla) {
		case 1:
			app.image(inicio, 0, 0);
			break;
		case 2:
			app.fill(0);

			app.text("da enter", app.width / 2, app.height / 2);

			break;
		case 3:
			app.fill(0);

			app.text("esto vale por splashScreen", app.width / 2, app.height / 2);

			secSplash++;
			System.out.println(secSplash);
			if (secSplash == 120) {
				pantalla++;
				secSplash = 0;
			}
			break;
		case 4:
			a1.pintarArea();
			a2.pintarArea();
			a3.pintarArea();
			a4.pintarArea();
			a5.pintarArea();
			app.fill(0);
			app.textSize(40);
			app.textAlign(app.CENTER);
			app.text(puntitos, 430, 68);
			new Thread(()->{
				
				segundos++;
			
			if (segundos == 110)
				generarNotas(100);
			if (segundos == 130)
				generarNotas(300);
			if (segundos == 150)
				generarNotas(100);
			if (segundos == 160)
				generarNotas(400);
			if (segundos == 180)
				generarNotas(300);
			if (segundos == 200)
				generarNotas(400);
			if (segundos == 210)
				generarNotas(100);
			if (segundos == 220)
				generarNotas(300);
			if (segundos == 240)
				generarNotas(400);
			if (segundos == 250)
				generarNotas(100);
			if (segundos == 270)
				generarNotas(300);
			if (segundos == 280)
				generarNotas(100);
			if (segundos == 290)
				generarNotas(400);
			if (segundos == 310)
				generarNotas(300);
			if (segundos == 320)
				generarNotas(400);
			if (segundos == 330)
				generarNotas(100);
			if (segundos == 350)
				generarNotas(200);
			if (segundos == 350)
				generarNotas(500);
			if (segundos == 380)
				generarNotas(400);
			if (segundos == 380)
				generarNotas(100);
			if (segundos == 400)
				generarNotas(200);
			if (segundos == 400)
				generarNotas(400);
			if (segundos == 410)
				generarNotas(100);
			if (segundos == 410)
				generarNotas(500);
			if (segundos == 415)
				generarNotas(100);
			if (segundos == 415)
				generarNotas(500);
			if (segundos == 435)
				generarNotas(300);
			if (segundos == 455)
				generarNotas(400);
			if (segundos == 465)
				generarNotas(100);
			if (segundos == 480)
				generarNotas(300);
			if (segundos == 500)
				generarNotas(500);
			if (segundos == 510)
				generarNotas(200);
			if (segundos == 530)
				generarNotas(300);
			if (segundos == 540)
				generarNotas(200);
			if (segundos == 560)
				generarNotas(500);
			if (segundos == 570)
				generarNotas(200);
			if (segundos == 585)
				generarNotas(300);
			if (segundos == 600)
				generarNotas(200);
			if (segundos == 610)
				generarNotas(500);
			if (segundos == 625)
				generarNotas(300);
			if (segundos == 640)
				generarNotas(500);
			if (segundos == 650)
				generarNotas(100);
			if (segundos == 665)
				generarNotas(300);
			if (segundos == 675)
				generarNotas(200);
			if (segundos == 690)
				generarNotas(500);
			if (segundos == 700)
				generarNotas(100);
			if (segundos == 715)
				generarNotas(500);
			if (segundos == 715)
				generarNotas(100);
			if (segundos == 730)
				generarNotas(200);
			if (segundos == 740)
				generarNotas(300);
			if (segundos == 750)
				generarNotas(200);
			if (segundos == 760)
				generarNotas(300);
			if (segundos == 775)
				generarNotas(300);
			if (segundos == 785)
				generarNotas(200);
			if (segundos == 800)
				generarNotas(200);
			if (segundos == 810)
				generarNotas(400);
			if (segundos == 820)
				generarNotas(300);
			if (segundos == 830)
				generarNotas(500);
			if (segundos == 840)
				generarNotas(100);
			if (segundos == 855)
				generarNotas(100);
			if (segundos == 855)
				generarNotas(500 );
			if (segundos == 870)
				generarNotas(500);
			if (segundos == 880)
				generarNotas(300);
			if (segundos == 890)
				generarNotas(500);
			if (segundos == 900)
				generarNotas(300);
			if (segundos == 915)
				generarNotas(300);
			if (segundos == 925)
				generarNotas(500);
			if (segundos == 940)
				generarNotas(500);
			if (segundos == 950)
				generarNotas(100);
			if (segundos == 960)
				generarNotas(300);
			if (segundos == 970)
				generarNotas(200);
			if (segundos == 980)
				generarNotas(400);
			if (segundos == 995)
				generarNotas(400);
			if (segundos == 995)
				generarNotas(200);
			if (segundos == 1010)
				generarNotas(400);
			if (segundos == 1020)
				generarNotas(300);
			if (segundos == 1030)
				generarNotas(400);
			if (segundos == 1040)
				generarNotas(300);
			if (segundos == 1055)
				generarNotas(300);
			if (segundos == 1065)
				generarNotas(500);
			if (segundos == 1080)
				generarNotas(500);
			if (segundos == 1090)
				generarNotas(100);
			if (segundos == 1100)
				generarNotas(300);
			if (segundos == 1110)
				generarNotas(200);
			if (segundos == 1120)
				generarNotas(400);
			if (segundos == 1130)
				generarNotas(300);
			if (segundos == 1140)
				generarNotas(400);
			if (segundos == 1150)
				generarNotas(300);
			if (segundos == 1160)
				generarNotas(400);
			if (segundos == 1170)
				generarNotas(300);
			if (segundos == 1180)
				generarNotas(400);
			if (segundos == 1190)
				generarNotas(300);
			if (segundos == 1200)
				generarNotas(500);
			if (segundos == 1210)
				generarNotas(300);
			if (segundos == 1220)
				generarNotas(500);
			if (segundos == 1230)
				generarNotas(300);
			if (segundos == 1240)
				generarNotas(500);
			if (segundos == 1250)
				generarNotas(300);
			if (segundos == 1260)
				generarNotas(500);
			if (segundos == 1270)
				generarNotas(300);
			if (segundos == 1280)
				generarNotas(200);
			if (segundos == 1290)
				generarNotas(400);
			if (segundos == 1300)
				generarNotas(300);
			if (segundos == 1310)
				generarNotas(100);
			if (segundos == 1320)
				generarNotas(500);
			if (segundos == 1350)
				generarNotas(500);
			if (segundos == 1370)
				generarNotas(500);
			if (segundos == 1390)
				generarNotas(500);
			if (segundos == 1410)
				generarNotas(500);
			if (segundos == 1430)
				generarNotas(100);
			if (segundos == 1450)
				generarNotas(100);
			if (segundos == 1470)
				generarNotas(100);
			if (segundos == 1490)
				generarNotas(100);
			if (segundos == 1510)
				generarNotas(400);
			if (segundos == 1530)
				generarNotas(400);
			if (segundos == 1550)
				generarNotas(400);
			if (segundos == 1570)
				generarNotas(400);
			if (segundos == 1590)
				generarNotas(300);
			if (segundos == 1610)
				generarNotas(400);
			if (segundos == 1610)
				generarNotas(200);
			if (segundos == 1630)
				generarNotas(200);
			if (segundos == 1640)
				generarNotas(300);
			if (segundos == 1650)
				generarNotas(200);
			if (segundos == 1660)
				generarNotas(300);
			if (segundos == 1670)
				generarNotas(100);
			if (segundos == 1690)
				generarNotas(100);
			if (segundos == 1710)
				generarNotas(100);
			if (segundos == 1730)
				generarNotas(100);
			if (segundos == 1750)
				generarNotas(500);
			if (segundos == 1770)
				generarNotas(500);
			if (segundos == 1790)
				generarNotas(500);
			if (segundos == 1810)
				generarNotas(500);
			if (segundos == 1830)
				generarNotas(200);
			if (segundos == 1850)
				generarNotas(200);
			if (segundos == 1870)
				generarNotas(200);
			if (segundos == 1890)
				generarNotas(200);
			if (segundos == 1910-10)
				generarNotas(400);
			if (segundos == 1920-10)
				generarNotas(300);
			if (segundos == 1930-10)
				generarNotas(400);
			if (segundos == 1940-10)
				generarNotas(200);
			if (segundos == 1950-10)
				generarNotas(300);
			if (segundos == 1960-10)
				generarNotas(100);
			if (segundos == 1970-10)
				generarNotas(500);
			if (segundos == 1980-10)
				generarNotas(300);
			if (segundos == 1990-10)
				generarNotas(400);
			if (segundos == 1995)
				generarNotas(300);
			if (segundos == 2005)
				generarNotas(400);
			if (segundos == 2015)
				generarNotas(300);
			if (segundos == 2025)
				generarNotas(400);
			if (segundos == 2035)
				generarNotas(300);
			if (segundos == 2045)
				generarNotas(400);
			if (segundos == 2055)
				generarNotas(200);
			if (segundos == 2070)
				generarNotas(300);
			if (segundos == 2080)
				generarNotas(200);
			if (segundos == 2090)
				generarNotas(300);
			if (segundos == 2100)
				generarNotas(200);
			if (segundos == 2110)
				generarNotas(300);
			if (segundos == 2120)
				generarNotas(200);
			if (segundos == 2130)
				generarNotas(500);
			if (segundos == 2150)
				generarNotas(300);
			if (segundos == 2160)
				generarNotas(500);
			if (segundos == 2170)
				generarNotas(300);
			if (segundos == 2180)
				generarNotas(500);
			if (segundos == 2190)
				generarNotas(300);
			if (segundos == 2200)
				generarNotas(500);
			if (segundos == 2210)
				generarNotas(100);
			if (segundos == 2230)
				generarNotas(100);
			if (segundos == 2230)
				generarNotas(500);
			if (segundos == 2250)
				generarNotas(100);
			if (segundos == 2260)
				generarNotas(300);
			if (segundos == 2270)
				generarNotas(200);
			if (segundos == 2280)
				generarNotas(400);
			if (segundos == 2290)
				generarNotas(300);
			if (segundos == 2300)
				generarNotas(500);
			if (segundos == 2310)
				generarNotas(300);
			if (segundos == 2320)
				generarNotas(500);
			if (segundos == 2330)
				generarNotas(300);
			if (segundos == 2340)
				generarNotas(500);
			if (segundos == 2350)
				generarNotas(300);
			if (segundos == 2360)
				generarNotas(500);
			if (segundos == 2370)
				generarNotas(100);
			if (segundos == 2380)
				generarNotas(300);
			if (segundos == 2390)
				generarNotas(100);
			if (segundos == 2400)
				generarNotas(300);
			if (segundos == 2410)
				generarNotas(100);
			if (segundos == 2420)
				generarNotas(300);
			if (segundos == 2430)
				generarNotas(100);
			if (segundos == 2440)
				generarNotas(300);
			if (segundos == 2450)
				generarNotas(200);
			if (segundos == 2460)
				generarNotas(400);
			if (segundos == 2470)
				generarNotas(200);
			if (segundos == 2480)
				generarNotas(400);
			if (segundos == 2490)
				generarNotas(200);
			if (segundos == 2500)
				generarNotas(400);
			if (segundos == 2510)
				generarNotas(200);
			if (segundos == 2520)
				generarNotas(400);
			if (segundos == 2530)
				generarNotas(300);
			if (segundos == 2540)
				generarNotas(500);
			if (segundos == 2550)
				generarNotas(100);
			if (segundos == 2560)
				generarNotas(300);
			if (segundos == 2570)
				generarNotas(100);
			if (segundos == 2580)
				generarNotas(500);
			if (segundos == 2590)
				generarNotas(100);
			if (segundos == 2600)
				generarNotas(500);
			if (segundos == 2610)
				generarNotas(300);
			if(segundos == 2620) {
				pantalla++;
			}
			}).start();
			
			
			
			

			for (int i = 0; i < notas.size(); i++) {
				notas.get(i).pintar();
			}
			if (combo >= 4) {
				app.text("Combo " + combo, 700, 50);
			}
			switch (estado) {
			case 1:
				app.textSize(150);
				app.fill(255, 0, 0);
				app.text("Bad", 250, 250);
				contador++;

				if (contador == 30) {
					estado = 0;
					contador = 0;
				}
				break;

			case 2:
				app.textSize(150);
				app.fill(0, 0, 255);
				app.text("Good", 250, 250);
				contador++;

				if (contador == 30) {
					estado = 0;
					contador = 0;
				}
				break;

			case 3:
				app.textSize(150);
				app.fill(0, 255, 0);
				app.text("Perfect", 250, 250);
				contador++;

				if (contador == 30) {
					estado = 0;
					contador = 0;
				}
				break;

			case 4:
				app.textSize(150);
				app.fill(150);
				app.text("Miss", 250, 250);
				contador++;

				if (contador == 30) {
					estado = 0;
					contador = 0;
				}
				break;
			}

			for (int i = 0; i < notas.size(); i++) {
				if (notas.get(i).getY() < 50) {
					estado = 4;
					miss++;
					combo = 0;
					puntitos -= 50;
					notas.remove(i);
				}
			}
			break;
		case 5:
			conexion.enviar(Integer.toString(puntitos));
			break;
		}

	}

	public void tecla() {

		switch (pantalla) {
		case 1:
			if (app.key == 's') {
				pantalla++;
			}

			break;
		case 2:
			if (app.key == 's') {
				pantalla++;
			}
			break;
		case 3:

			break;
		case 4:
			if (app.key == 'w' || app.key == 'W') { //a
				choques(a1);
			}

			if (app.key == 'a' || app.key == 'A') { //s
				choques(a2);
			}

			if (app.key == 's' || app.key == 'S') { //j
				choques(a3);
			}
			if (app.key == 'd' || app.key == 'D') { //k
				choques(a4);
			}
			if (app.key == 'f' || app.key == 'F') { //l
				choques(a5);
			}

			break;
		}
//
	}

	public void choques(Area a) {

		for (int i = 0; i < notas.size(); i++) {
			if (app.dist(a.getX(), a.getY(), notas.get(i).getX(), notas.get(i).getY()) <= 80*2
					&& app.dist(a.getX(), a.getY(), notas.get(i).getX(), notas.get(i).getY()) >= 50*2) {
				estado = 1;
				bad++;
				puntitos -= 10;
				combo = 0;
				notas.remove(i);
				break;
			} else if (app.dist(a.getX(), a.getY(), notas.get(i).getX(), notas.get(i).getY()) <= 50*2
					&& app.dist(a.getX(), a.getY(), notas.get(i).getX(), notas.get(i).getY()) >= 25*2) {
				estado = 2;
				good++;
				puntitos += 50;
				combo += 1;
				notas.remove(i);
				break;
			} else if (app.dist(a.getX(), a.getY(), notas.get(i).getX(), notas.get(i).getY()) <= 25*2
					&& app.dist(a.getX(), a.getY(), notas.get(i).getX(), notas.get(i).getY()) >= 0) {
				estado = 3;
				perfect++;
				puntitos += 100;
				combo += 1;
				notas.remove(i);
				break;
			}
		}
	}

	public void generarNotas(int x) {
		notas.add(new Nota(x, app));
	}

	@Override
	public void recibirMensaje(String mensaje) {
		// TODO Auto-generated method stub
		
	}
}
