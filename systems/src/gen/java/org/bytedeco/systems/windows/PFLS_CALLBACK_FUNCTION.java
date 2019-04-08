// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;
 
@Convention("NTAPI") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PFLS_CALLBACK_FUNCTION extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PFLS_CALLBACK_FUNCTION(Pointer p) { super(p); }
    protected PFLS_CALLBACK_FUNCTION() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("PVOID") Pointer lpFlsData
    );
}
