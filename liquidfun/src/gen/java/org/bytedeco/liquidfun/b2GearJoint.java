// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A gear joint is used to connect two joints together. Either joint
 *  can be a revolute or prismatic joint. You specify a gear ratio
 *  to bind the motions together:
 *  coordinate1 + ratio * coordinate2 = constant
 *  The ratio can be negative or positive. If one joint is a revolute joint
 *  and the other joint is a prismatic joint, then the ratio will have units
 *  of length or units of 1/length.
 *  \warning You have to manually destroy the gear joint if joint1 or joint2
 *  is destroyed. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2GearJoint extends b2Joint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2GearJoint(Pointer p) { super(p); }

	public native @ByVal b2Vec2 GetAnchorA();
	public native @ByVal b2Vec2 GetAnchorB();

	public native @ByVal b2Vec2 GetReactionForce(@Cast("float32") float inv_dt);
	public native @Cast("float32") float GetReactionTorque(@Cast("float32") float inv_dt);

	/** Get the first joint. */
	public native b2Joint GetJoint1();

	/** Get the second joint. */
	public native b2Joint GetJoint2();

	/** Set/Get the gear ratio. */
	public native void SetRatio(@Cast("float32") float ratio);
	public native @Cast("float32") float GetRatio();

	/** Dump joint to dmLog */
	public native void Dump();
}
