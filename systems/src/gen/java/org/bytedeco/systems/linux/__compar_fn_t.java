// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;

@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class __compar_fn_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    __compar_fn_t(Pointer p) { super(p); }
    protected __compar_fn_t() { allocate(); }
    private native void allocate();
    public native int call(@Const Pointer arg0, @Const Pointer arg1);
}
