package us.hassu.graphs.maze;

import us.hassu.graphs.maze.MazeNode;

import java.util.ArrayList;
import java.util.List;

class Grid extends ArrayList<List<MazeNode>> {
    public Grid(int initialCapacity) {
        super(initialCapacity);
    }

}