// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Ray-cast output data. The ray hits at p1 + fraction * (p2 - p1), where p1 and p2
 *  come from b2RayCastInput. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2RayCastOutput extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2RayCastOutput() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2RayCastOutput(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2RayCastOutput(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2RayCastOutput position(long position) {
        return (b2RayCastOutput)super.position(position);
    }

	public native @ByRef b2Vec2 normal(); public native b2RayCastOutput normal(b2Vec2 setter);
	public native @Cast("float32") float fraction(); public native b2RayCastOutput fraction(float setter);
}
