// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5AC_cache_image_config_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5AC_cache_image_config_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5AC_cache_image_config_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5AC_cache_image_config_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5AC_cache_image_config_t position(long position) {
        return (H5AC_cache_image_config_t)super.position(position);
    }

    public native int version(); public native H5AC_cache_image_config_t version(int setter);
    public native @Cast("hbool_t") boolean generate_image(); public native H5AC_cache_image_config_t generate_image(boolean setter);
    public native @Cast("hbool_t") boolean save_resize_status(); public native H5AC_cache_image_config_t save_resize_status(boolean setter);
    public native int entry_ageout(); public native H5AC_cache_image_config_t entry_ageout(int setter);
}
