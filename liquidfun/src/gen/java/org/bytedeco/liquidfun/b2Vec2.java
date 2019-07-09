// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A 2D column vector. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Vec2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Vec2(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Vec2(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2Vec2 position(long position) {
        return (b2Vec2)super.position(position);
    }

	/** Default constructor does nothing (for performance). */
	public b2Vec2() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Construct using coordinates. */
	public b2Vec2(@Cast("float32") float x, @Cast("float32") float y) { super((Pointer)null); allocate(x, y); }
	private native void allocate(@Cast("float32") float x, @Cast("float32") float y);

	/** Set this vector to all zeros. */
	public native void SetZero();

	/** Set this vector to some specified coordinates. */
	public native void Set(@Cast("float32") float x_, @Cast("float32") float y_);

	/** Negate this vector. */
	public native @ByVal @Name("operator -") b2Vec2 subtract();

	/** Read from and indexed element. */

	/** Write to an indexed element. */
	public native @Cast("float32*") @ByRef @Name("operator ()") FloatPointer apply(@Cast("int32") int i);

	/** Add a vector to this vector. */
	public native @Name("operator +=") void addPut(@Const @ByRef b2Vec2 v);

	/** Subtract a vector from this vector. */
	public native @Name("operator -=") void subtractPut(@Const @ByRef b2Vec2 v);

	/** Multiply this vector by a scalar. */
	public native @Name("operator *=") void multiplyPut(@Cast("float32") float a);

	/** Get the length of this vector (the norm). */
	public native @Cast("float32") float Length();

	/** Get the length squared. For performance, use this instead of
	 *  b2Vec2::Length (if possible). */
	public native @Cast("float32") float LengthSquared();

	/** Convert this vector into a unit vector. Returns the length. */
	public native @Cast("float32") float Normalize();

	/** Does this vector contain finite coordinates? */
	public native @Cast("bool") boolean IsValid();

	/** Get the skew vector such that dot(skew_vec, other) == cross(vec, other) */
	public native @ByVal b2Vec2 Skew();

	public native @Cast("float32") float x(); public native b2Vec2 x(float setter);
	public native @Cast("float32") float y(); public native b2Vec2 y(float setter);
}
