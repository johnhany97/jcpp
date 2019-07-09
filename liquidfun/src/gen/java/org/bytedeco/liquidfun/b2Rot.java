// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Rotation */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Rot extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Rot(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Rot(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2Rot position(long position) {
        return (b2Rot)super.position(position);
    }

	public b2Rot() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Initialize from an angle in radians */
	public b2Rot(@Cast("float32") float angle) { super((Pointer)null); allocate(angle); }
	private native void allocate(@Cast("float32") float angle);

	/** Set using an angle in radians. */
	public native void Set(@Cast("float32") float angle);

	/** Set to the identity rotation */
	public native void SetIdentity();

	/** Get the angle in radians */
	public native @Cast("float32") float GetAngle();

	/** Get the x-axis */
	public native @ByVal b2Vec2 GetXAxis();

	/** Get the u-axis */
	public native @ByVal b2Vec2 GetYAxis();

	/** Sine and cosine */
	public native @Cast("float32") float s(); public native b2Rot s(float setter);
	public native @Cast("float32") float c(); public native b2Rot c(float setter);
}
