// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// Scope table structure definition.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SCOPE_TABLE_AMD64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SCOPE_TABLE_AMD64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SCOPE_TABLE_AMD64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SCOPE_TABLE_AMD64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SCOPE_TABLE_AMD64 position(long position) {
        return (SCOPE_TABLE_AMD64)super.position(position);
    }

    public native @Cast("DWORD") int Count(); public native SCOPE_TABLE_AMD64 Count(int setter);
        @Name({"ScopeRecord", ".BeginAddress"}) public native @Cast("DWORD") int ScopeRecord_BeginAddress(int i); public native SCOPE_TABLE_AMD64 ScopeRecord_BeginAddress(int i, int setter);
        @Name({"ScopeRecord", ".EndAddress"}) public native @Cast("DWORD") int ScopeRecord_EndAddress(int i); public native SCOPE_TABLE_AMD64 ScopeRecord_EndAddress(int i, int setter);
        @Name({"ScopeRecord", ".HandlerAddress"}) public native @Cast("DWORD") int ScopeRecord_HandlerAddress(int i); public native SCOPE_TABLE_AMD64 ScopeRecord_HandlerAddress(int i, int setter);
        @Name({"ScopeRecord", ".JumpTarget"}) public native @Cast("DWORD") int ScopeRecord_JumpTarget(int i); public native SCOPE_TABLE_AMD64 ScopeRecord_JumpTarget(int i, int setter);
}
