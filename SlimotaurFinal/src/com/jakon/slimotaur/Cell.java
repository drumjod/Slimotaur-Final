package com.jakon.slimotaur;

import com.badlogic.gdx.graphics.g3d.loaders.ModelLoader;
import com.badlogic.gdx.math.Vector3;


public class Cell {

	public enum Direction {NORTH, EAST, SOUTH, WEST};
	
	Vector3 position;
	
	//walls
	boolean[] walls = new boolean[4];
	
	//initialize cell with coordinates and
	//initial walls.
	public void set(int x, int y, int z) {
		position = new Vector3(x, y, z);
		
		for(int i = 0; i < 4; ++i)  {
			walls[i] = true;
		}
	}
	
	public void removeWall(Direction dir) {
		walls[dir.ordinal()] = false;
	}

	//if a certain wall is passable, it will
	//be false
	public boolean canPass(Direction dir)  {
		return !walls[dir.ordinal()];
	}
}
