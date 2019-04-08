// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/*
 * Storage info struct used by H5O_info_t and H5F_info_t
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5_ih_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5_ih_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5_ih_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5_ih_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5_ih_info_t position(long position) {
        return (H5_ih_info_t)super.position(position);
    }

    public native @Cast("hsize_t") long index_size(); public native H5_ih_info_t index_size(long setter);     /* btree and/or list */
    public native @Cast("hsize_t") long heap_size(); public native H5_ih_info_t heap_size(long setter);
}
