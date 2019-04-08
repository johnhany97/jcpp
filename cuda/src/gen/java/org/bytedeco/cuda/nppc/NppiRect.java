// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/**
 * 2D Rectangle
 * This struct contains position and size information of a rectangle in 
 * two space.
 * The rectangle's position is usually signified by the coordinate of its
 * upper-left corner.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiRect extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiRect() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiRect(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiRect(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiRect position(long position) {
        return (NppiRect)super.position(position);
    }

    /**  x-coordinate of upper left corner (lowest memory address). */
    public native int x(); public native NppiRect x(int setter);
    /**  y-coordinate of upper left corner (lowest memory address). */
    public native int y(); public native NppiRect y(int setter);
    /**  Rectangle width. */
    public native int width(); public native NppiRect width(int setter);
    /**  Rectangle height. */
    public native int height(); public native NppiRect height(int setter);
}
