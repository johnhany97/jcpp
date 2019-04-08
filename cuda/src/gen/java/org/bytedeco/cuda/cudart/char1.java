// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


// #endif /* !__CUDACC__ && !__CUDACC_RTC__ && _WIN32 && !_WIN64 */

@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class char1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public char1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public char1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public char1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public char1 position(long position) {
        return (char1)super.position(position);
    }

    public native byte x(); public native char1 x(byte setter);
}
