// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A motor joint is used to control the relative motion
 *  between two bodies. A typical usage is to control the movement
 *  of a dynamic body with respect to the ground. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2MotorJoint extends b2Joint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2MotorJoint(Pointer p) { super(p); }

	public native @ByVal b2Vec2 GetAnchorA();
	public native @ByVal b2Vec2 GetAnchorB();

	public native @ByVal b2Vec2 GetReactionForce(@Cast("float32") float inv_dt);
	public native @Cast("float32") float GetReactionTorque(@Cast("float32") float inv_dt);

	/** Set/get the target linear offset, in frame A, in meters. */
	public native void SetLinearOffset(@Const @ByRef b2Vec2 linearOffset);
	public native @Const @ByRef b2Vec2 GetLinearOffset();

	/** Set/get the target angular offset, in radians. */
	public native void SetAngularOffset(@Cast("float32") float angularOffset);
	public native @Cast("float32") float GetAngularOffset();

	/** Set the maximum friction force in N. */
	public native void SetMaxForce(@Cast("float32") float force);

	/** Get the maximum friction force in N. */
	public native @Cast("float32") float GetMaxForce();

	/** Set the maximum friction torque in N*m. */
	public native void SetMaxTorque(@Cast("float32") float torque);

	/** Get the maximum friction torque in N*m. */
	public native @Cast("float32") float GetMaxTorque();

	/** Set the position correction factor in the range [0,1]. */
	public native void SetCorrectionFactor(@Cast("float32") float factor);

	/** Get the position correction factor in the range [0,1]. */
	public native @Cast("float32") float GetCorrectionFactor();

	/** Dump to b2Log */
	public native void Dump();
}
