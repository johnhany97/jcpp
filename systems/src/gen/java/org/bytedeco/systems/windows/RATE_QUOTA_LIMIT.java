// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class RATE_QUOTA_LIMIT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RATE_QUOTA_LIMIT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RATE_QUOTA_LIMIT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RATE_QUOTA_LIMIT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RATE_QUOTA_LIMIT position(long position) {
        return (RATE_QUOTA_LIMIT)super.position(position);
    }

    public native @Cast("DWORD") int RateData(); public native RATE_QUOTA_LIMIT RateData(int setter);
        public native @Cast("DWORD") @NoOffset int RatePercent(); public native RATE_QUOTA_LIMIT RatePercent(int setter);
        public native @Cast("DWORD") @NoOffset int Reserved0(); public native RATE_QUOTA_LIMIT Reserved0(int setter); 
}
