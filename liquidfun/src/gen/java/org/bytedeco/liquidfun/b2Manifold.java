// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A manifold for two touching convex shapes.
 *  Box2D supports multiple types of contact:
 *  - clip point versus plane with radius
 *  - point versus point with radius (circles)
 *  The local point usage depends on the manifold type:
 *  -e_circles: the local center of circleA
 *  -e_faceA: the center of faceA
 *  -e_faceB: the center of faceB
 *  Similarly the local normal usage:
 *  -e_circles: not used
 *  -e_faceA: the normal on polygonA
 *  -e_faceB: the normal on polygonB
 *  We store contacts in this way so that position correction can
 *  account for movement, which is critical for continuous physics.
 *  All contact scenarios must be expressed in one of these types.
 *  This structure is stored across time steps, so we keep it small. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Manifold extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2Manifold() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Manifold(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Manifold(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2Manifold position(long position) {
        return (b2Manifold)super.position(position);
    }

	/** enum b2Manifold::Type */
	public static final int
		e_circles = 0,
		e_faceA = 1,
		e_faceB = 2;

	/** the points of contact */
	public native @ByRef b2ManifoldPoint points(int i); public native b2Manifold points(int i, b2ManifoldPoint setter);
	@MemberGetter public native b2ManifoldPoint points();
	/** not use for Type::e_points */
	public native @ByRef b2Vec2 localNormal(); public native b2Manifold localNormal(b2Vec2 setter);
	/** usage depends on manifold type */
	public native @ByRef b2Vec2 localPoint(); public native b2Manifold localPoint(b2Vec2 setter);
	public native @Cast("b2Manifold::Type") int type(); public native b2Manifold type(int setter);
	/** the number of manifold points */
	public native @Cast("int32") int pointCount(); public native b2Manifold pointCount(int setter);
}
