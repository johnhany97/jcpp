// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class GROUP_RELATIONSHIP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GROUP_RELATIONSHIP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GROUP_RELATIONSHIP(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GROUP_RELATIONSHIP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GROUP_RELATIONSHIP position(long position) {
        return (GROUP_RELATIONSHIP)super.position(position);
    }

    public native @Cast("WORD") short MaximumGroupCount(); public native GROUP_RELATIONSHIP MaximumGroupCount(short setter);
    public native @Cast("WORD") short ActiveGroupCount(); public native GROUP_RELATIONSHIP ActiveGroupCount(short setter);
    public native @Cast("BYTE") byte Reserved(int i); public native GROUP_RELATIONSHIP Reserved(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Reserved();
    public native @ByRef PROCESSOR_GROUP_INFO GroupInfo(int i); public native GROUP_RELATIONSHIP GroupInfo(int i, PROCESSOR_GROUP_INFO setter);
    @MemberGetter public native PROCESSOR_GROUP_INFO GroupInfo();
}
