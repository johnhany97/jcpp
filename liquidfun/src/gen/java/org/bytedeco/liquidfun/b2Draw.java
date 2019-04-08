// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Implement and register this class with a b2World to provide debug drawing of physics
 *  entities in your game. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Draw extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Draw(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Draw(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2Draw position(long position) {
        return (b2Draw)super.position(position);
    }

	public b2Draw() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** enum b2Draw:: */
	public static final int
		/** draw shapes */
		e_shapeBit				 = 0x0001,
		/** draw joint connections */
		e_jointBit				 = 0x0002,
		/** draw axis aligned bounding boxes */
		e_aabbBit				 = 0x0004,
		/** draw broad-phase pairs */
		e_pairBit				 = 0x0008,
		/** draw center of mass frame */
		e_centerOfMassBit			 = 0x0010,
		/** draw particles */
		e_particleBit				 = 0x0020;

	/** Set the drawing flags. */
	public native void SetFlags(@Cast("uint32") long flags);

	/** Get the drawing flags. */
	public native @Cast("uint32") long GetFlags();

	/** Append flags to the current flags. */
	public native void AppendFlags(@Cast("uint32") long flags);

	/** Clear flags from the current flags. */
	public native void ClearFlags(@Cast("uint32") long flags);

	/** Draw a closed polygon provided in CCW order. */
	@Virtual(true) public native void DrawPolygon(@Const b2Vec2 vertices, @Cast("int32") int vertexCount, @Const @ByRef b2Color color);

	/** Draw a solid closed polygon provided in CCW order. */
	@Virtual(true) public native void DrawSolidPolygon(@Const b2Vec2 vertices, @Cast("int32") int vertexCount, @Const @ByRef b2Color color);

	/** Draw a circle. */
	@Virtual(true) public native void DrawCircle(@Const @ByRef b2Vec2 center, @Cast("float32") float radius, @Const @ByRef b2Color color);

	/** Draw a solid circle. */
	@Virtual(true) public native void DrawSolidCircle(@Const @ByRef b2Vec2 center, @Cast("float32") float radius, @Const @ByRef b2Vec2 axis, @Const @ByRef b2Color color);

	/** Draw a particle array */
	@Virtual(true) public native void DrawParticles(@Const b2Vec2 centers, @Cast("float32") float radius, @Const b2ParticleColor colors, @Cast("int32") int count);

	/** Draw a line segment. */
	@Virtual(true) public native void DrawSegment(@Const @ByRef b2Vec2 p1, @Const @ByRef b2Vec2 p2, @Const @ByRef b2Color color);

	/** Draw a transform. Choose your own length scale.
	 *  @param xf a transform. */
	@Virtual(true) public native void DrawTransform(@Const @ByRef b2Transform xf);
}
