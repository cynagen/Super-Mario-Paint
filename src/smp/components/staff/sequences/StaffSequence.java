package smp.components.staff.sequences;

import java.io.Serializable;
import java.util.ArrayList;

import smp.components.Values;

/**
 * We might not even need MIDI to do this sequencing stuff.
 * This class keeps track of whatever is displaying on the
 * staff right now.
 * @author RehdBlob
 * @since 2013.08.23
 */
public class StaffSequence implements Serializable {

    /**
     * Generated serial ID.
     */
    private static final long serialVersionUID = 5752285850525402081L;

    /** These are all of the lines on the staff. */
    private ArrayList<StaffNoteLine> theLines;

    /** Default constructor. Makes an empty song. */
    public StaffSequence() {
        theLines = new ArrayList<StaffNoteLine>();
        for(int i = 0; i < Values.DEFAULT_LINES_PER_SONG; i++)
            theLines.add(new StaffNoteLine(i));
    }

    /**
     * @param i The index that we want to get some line from.
     * @return Gets a <code>StaffNoteLine</code> that resides at
     * index i.
     */
    public StaffNoteLine getLine(int i) {
        return theLines.get(i);
    }

    /**
     * @param i The index that we want to modify.
     * @param s The StaffNoteLine that we want to place at this
     * index.
     */
    public void setLine(int i, StaffNoteLine s) {
        theLines.set(i, s);
    }


}
