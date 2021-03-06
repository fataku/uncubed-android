package com.ramblescript.uncubed.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Dmitri on 21/6/15.
 */
public interface Neighbor {

	void setNeighbor(int dir, Neighbor n);

	Neighbor getNeighbor(int dir);

	ArrayList<Neighbor> getLoop(int dir);
	ArrayList<Neighbor> getLoop(int dir, ArrayList<Neighbor> loop);

	void select();
	void select(boolean s);

    void setColor(int color);
    int getColor();
}
