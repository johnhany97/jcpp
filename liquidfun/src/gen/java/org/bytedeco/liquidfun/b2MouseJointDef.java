// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Mouse joint definition. This requires a world target point,
 *  tuning parameters, and the time step. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2MouseJointDef extends b2JointDef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2MouseJointDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2MouseJointDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2MouseJointDef position(long position) {
        return (b2MouseJointDef)super.position(position);
    }

	public b2MouseJointDef() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** The initial world target point. This is assumed
	 *  to coincide with the body anchor initially. */
	public native @ByRef b2Vec2 target(); public native b2MouseJointDef target(b2Vec2 setter);

	/** The maximum constraint force that can be exerted
	 *  to move the candidate body. Usually you will express
	 *  as some multiple of the weight (multiplier * mass * gravity). */
	public native @Cast("float32") float maxForce(); public native b2MouseJointDef maxForce(float setter);

	/** The response speed. */
	public native @Cast("float32") float frequencyHz(); public native b2MouseJointDef frequencyHz(float setter);

	/** The damping ratio. 0 = no damping, 1 = critical damping. */
	public native @Cast("float32") float dampingRatio(); public native b2MouseJointDef dampingRatio(float setter);
}
