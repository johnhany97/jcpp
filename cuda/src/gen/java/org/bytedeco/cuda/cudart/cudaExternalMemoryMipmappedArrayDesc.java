// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;

 
/**
 * External memory mipmap descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaExternalMemoryMipmappedArrayDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaExternalMemoryMipmappedArrayDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaExternalMemoryMipmappedArrayDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaExternalMemoryMipmappedArrayDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaExternalMemoryMipmappedArrayDesc position(long position) {
        return (cudaExternalMemoryMipmappedArrayDesc)super.position(position);
    }

    /**
     * Offset into the memory object where the base level of the
     * mipmap chain is.
     */
    public native @Cast("unsigned long long") long offset(); public native cudaExternalMemoryMipmappedArrayDesc offset(long setter);
    /**
     * Format of base level of the mipmap chain
     */
    public native @ByRef cudaChannelFormatDesc formatDesc(); public native cudaExternalMemoryMipmappedArrayDesc formatDesc(cudaChannelFormatDesc setter);
    /**
     * Dimensions of base level of the mipmap chain
     */
    public native @ByRef cudaExtent extent(); public native cudaExternalMemoryMipmappedArrayDesc extent(cudaExtent setter);
    /**
     * Flags associated with CUDA mipmapped arrays.
     * See ::cudaMallocMipmappedArray
     */
    public native @Cast("unsigned int") int flags(); public native cudaExternalMemoryMipmappedArrayDesc flags(int setter);
    /**
     * Total number of levels in the mipmap chain
     */
    public native @Cast("unsigned int") int numLevels(); public native cudaExternalMemoryMipmappedArrayDesc numLevels(int setter);
}
