// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Friction joint. This is used for top-down friction.
 *  It provides 2D translational friction and angular friction. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2FrictionJoint extends b2Joint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2FrictionJoint(Pointer p) { super(p); }

	public native @ByVal b2Vec2 GetAnchorA();
	public native @ByVal b2Vec2 GetAnchorB();

	public native @ByVal b2Vec2 GetReactionForce(@Cast("float32") float inv_dt);
	public native @Cast("float32") float GetReactionTorque(@Cast("float32") float inv_dt);

	/** The local anchor point relative to bodyA's origin. */
	public native @Const @ByRef b2Vec2 GetLocalAnchorA();

	/** The local anchor point relative to bodyB's origin. */
	public native @Const @ByRef b2Vec2 GetLocalAnchorB();

	/** Set the maximum friction force in N. */
	public native void SetMaxForce(@Cast("float32") float force);

	/** Get the maximum friction force in N. */
	public native @Cast("float32") float GetMaxForce();

	/** Set the maximum friction torque in N*m. */
	public native void SetMaxTorque(@Cast("float32") float torque);

	/** Get the maximum friction torque in N*m. */
	public native @Cast("float32") float GetMaxTorque();

	/** Dump joint to dmLog */
	public native void Dump();
}
