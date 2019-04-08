// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


// #if __CUDA_API_VERSION >= 3020

/**
 * 2D memory copy parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_MEMCPY2D extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_MEMCPY2D() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_MEMCPY2D(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_MEMCPY2D(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_MEMCPY2D position(long position) {
        return (CUDA_MEMCPY2D)super.position(position);
    }

    /** Source X in bytes */
    public native @Cast("size_t") long srcXInBytes(); public native CUDA_MEMCPY2D srcXInBytes(long setter);
    /** Source Y */
    public native @Cast("size_t") long srcY(); public native CUDA_MEMCPY2D srcY(long setter);

    /** Source memory type (host, device, array) */
    public native @Cast("CUmemorytype") int srcMemoryType(); public native CUDA_MEMCPY2D srcMemoryType(int setter);
    /** Source host pointer */
    @MemberGetter public native @Const Pointer srcHost();
    /** Source device pointer */
    public native @Cast("CUdeviceptr") long srcDevice(); public native CUDA_MEMCPY2D srcDevice(long setter);
    /** Source array reference */
    public native CUarray_st srcArray(); public native CUDA_MEMCPY2D srcArray(CUarray_st setter);
    /** Source pitch (ignored when src is array) */
    public native @Cast("size_t") long srcPitch(); public native CUDA_MEMCPY2D srcPitch(long setter);

    /** Destination X in bytes */
    public native @Cast("size_t") long dstXInBytes(); public native CUDA_MEMCPY2D dstXInBytes(long setter);
    /** Destination Y */
    public native @Cast("size_t") long dstY(); public native CUDA_MEMCPY2D dstY(long setter);

    /** Destination memory type (host, device, array) */
    public native @Cast("CUmemorytype") int dstMemoryType(); public native CUDA_MEMCPY2D dstMemoryType(int setter);
    /** Destination host pointer */
    public native Pointer dstHost(); public native CUDA_MEMCPY2D dstHost(Pointer setter);
    /** Destination device pointer */
    public native @Cast("CUdeviceptr") long dstDevice(); public native CUDA_MEMCPY2D dstDevice(long setter);
    /** Destination array reference */
    public native CUarray_st dstArray(); public native CUDA_MEMCPY2D dstArray(CUarray_st setter);
    /** Destination pitch (ignored when dst is array) */
    public native @Cast("size_t") long dstPitch(); public native CUDA_MEMCPY2D dstPitch(long setter);

    /** Width of 2D memory copy in bytes */
    public native @Cast("size_t") long WidthInBytes(); public native CUDA_MEMCPY2D WidthInBytes(long setter);
    /** Height of 2D memory copy */
    public native @Cast("size_t") long Height(); public native CUDA_MEMCPY2D Height(long setter);
}
