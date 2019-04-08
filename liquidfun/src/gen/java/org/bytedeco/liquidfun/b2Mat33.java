// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A 3-by-3 matrix. Stored in column-major order. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Mat33 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Mat33(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Mat33(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2Mat33 position(long position) {
        return (b2Mat33)super.position(position);
    }

	/** The default constructor does nothing (for performance). */
	public b2Mat33() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Construct this matrix using columns. */
	public b2Mat33(@Const @ByRef b2Vec3 c1, @Const @ByRef b2Vec3 c2, @Const @ByRef b2Vec3 c3) { super((Pointer)null); allocate(c1, c2, c3); }
	private native void allocate(@Const @ByRef b2Vec3 c1, @Const @ByRef b2Vec3 c2, @Const @ByRef b2Vec3 c3);

	/** Set this matrix to all zeros. */
	public native void SetZero();

	/** Solve A * x = b, where b is a column vector. This is more efficient
	 *  than computing the inverse in one-shot cases. */
	public native @ByVal b2Vec3 Solve33(@Const @ByRef b2Vec3 b);

	/** Solve A * x = b, where b is a column vector. This is more efficient
	 *  than computing the inverse in one-shot cases. Solve only the upper
	 *  2-by-2 matrix equation. */
	public native @ByVal b2Vec2 Solve22(@Const @ByRef b2Vec2 b);

	/** Get the inverse of this matrix as a 2-by-2.
	 *  Returns the zero matrix if singular. */
	public native void GetInverse22(b2Mat33 M);

	/** Get the symmetric inverse of this matrix as a 3-by-3.
	 *  Returns the zero matrix if singular. */
	public native void GetSymInverse33(b2Mat33 M);

	public native @ByRef b2Vec3 ex(); public native b2Mat33 ex(b2Vec3 setter);
	public native @ByRef b2Vec3 ey(); public native b2Mat33 ey(b2Vec3 setter);
	public native @ByRef b2Vec3 ez(); public native b2Mat33 ez(b2Vec3 setter);
}
