package com.jakon.slimotaur;

import com.badlogic.gdx.math.Vector2;

public class Maze {
	
	private Cell[][] cells;
	
	private int height;
	private int width;
	private int entranceX, entranceY;
	private int exitX, exitY;
	private float waterZ;
	private boolean doorOpen;
	private boolean flooding;
	
	/**
	 * Generates maze randomly.
	 * @param width in cells
	 * @param height in cells
	 */
	private Maze(int width, int height) {
		this.width = width;
		this.height = height;
		cells = new Cell[width][height];
		
		for(int i = 0; i < cells.length; ++i) {
			for(int j = 0; j < cells[i].length; ++j) {
				cells[i][j].set(i,j,0);
			}
		}
	}
	
	private Cell getCell(int x, int y) {
		return cells[x][y];
	}
	
	private void draw() {
		
	}
	
	private void flood(float delta) {
	}
	
	public void openDoor() {
		
	}
	
	private void mazify(int x, int y) {
		
	}
	
	//maybe in a MazeRenderer class?
	private void draw(ModelBatch batch) {
		
	}
}
