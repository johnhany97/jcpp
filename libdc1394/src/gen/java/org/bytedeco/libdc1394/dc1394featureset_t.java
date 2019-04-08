// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.libdc1394;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libdc1394.global.dc1394.*;


/**
 * The list of features
 */
@Properties(inherit = org.bytedeco.libdc1394.presets.dc1394.class)
public class dc1394featureset_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394featureset_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dc1394featureset_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394featureset_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dc1394featureset_t position(long position) {
        return (dc1394featureset_t)super.position(position);
    }

    public native @ByRef dc1394feature_info_t feature(int i); public native dc1394featureset_t feature(int i, dc1394feature_info_t setter);
    @MemberGetter public native dc1394feature_info_t feature();
}
