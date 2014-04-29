package com.jakon.slimotaur;
//@author Jon Wareham
//@author Jake Jones
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "SlimotaurFinal";
		cfg.width = 800;
		cfg.height = 800;
		
		new LwjglApplication(new Slimotaur(), cfg);
	}
}
