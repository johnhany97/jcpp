// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;



@Namespace("cv::ocl") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Kernel extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Kernel(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Kernel(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Kernel position(long position) {
        return (Kernel)super.position(position);
    }

    public Kernel() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Kernel(@Cast("const char*") BytePointer kname, @Const @ByRef Program prog) { super((Pointer)null); allocate(kname, prog); }
    private native void allocate(@Cast("const char*") BytePointer kname, @Const @ByRef Program prog);
    public Kernel(String kname, @Const @ByRef Program prog) { super((Pointer)null); allocate(kname, prog); }
    private native void allocate(String kname, @Const @ByRef Program prog);
    public Kernel(String kname, @Const @ByRef ProgramSource prog,
                @Str String buildopts, @Str BytePointer errmsg) { allocate(kname, prog, buildopts, errmsg); }
    private native void allocate(String kname, @Const @ByRef ProgramSource prog,
                @Str String buildopts, @Cast({"", "cv::String*"}) @Str BytePointer errmsg/*=NULL*/);
    public Kernel(@Const @ByRef Kernel k) { super((Pointer)null); allocate(k); }
    private native void allocate(@Const @ByRef Kernel k);
    public native @ByRef @Name("operator =") Kernel put(@Const @ByRef Kernel k);

    public native @Cast("bool") boolean empty();
    public native @Cast("bool") boolean create(@Cast("const char*") BytePointer kname, @Const @ByRef Program prog);
    public native @Cast("bool") boolean create(String kname, @Const @ByRef Program prog);
    public native @Cast("bool") boolean create(String kname, @Const @ByRef ProgramSource prog,
                @Str String buildopts, @Cast({"", "cv::String*"}) @Str BytePointer errmsg/*=NULL*/);

    public native int set(int i, @Const Pointer value, @Cast("size_t") long sz);
    public native int set(int i, @Const @ByRef Image2D image2D);
    public native int set(int i, @Const @ByRef UMat m);
    public native int set(int i, @Const @ByRef KernelArg arg);
    /** \brief Run the OpenCL kernel.
    @param dims the work problem dimensions. It is the length of globalsize and localsize. It can be either 1, 2 or 3.
    @param globalsize work items for each dimension. It is not the final globalsize passed to
      OpenCL. Each dimension will be adjusted to the nearest integer divisible by the corresponding
      value in localsize. If localsize is NULL, it will still be adjusted depending on dims. The
      adjusted values are greater than or equal to the original values.
    @param localsize work-group size for each dimension.
    @param sync specify whether to wait for OpenCL computation to finish before return.
    @param q command queue
    */
    public native @Cast("bool") boolean run(int dims, @Cast("size_t*") SizeTPointer globalsize,
                 @Cast("size_t*") SizeTPointer localsize, @Cast("bool") boolean sync, @Const @ByRef(nullValue = "cv::ocl::Queue()") Queue q);
    public native @Cast("bool") boolean run(int dims, @Cast("size_t*") SizeTPointer globalsize,
                 @Cast("size_t*") SizeTPointer localsize, @Cast("bool") boolean sync);
    public native @Cast("bool") boolean runTask(@Cast("bool") boolean sync, @Const @ByRef(nullValue = "cv::ocl::Queue()") Queue q);
    public native @Cast("bool") boolean runTask(@Cast("bool") boolean sync);

    /** \brief Similar to synchronized run() call with returning of kernel execution time
     * Separate OpenCL command queue may be used (with CL_QUEUE_PROFILING_ENABLE)
     * @return Execution time in nanoseconds or negative number on error
     */
    public native @Cast("int64") long runProfiling(int dims, @Cast("size_t*") SizeTPointer globalsize, @Cast("size_t*") SizeTPointer localsize, @Const @ByRef(nullValue = "cv::ocl::Queue()") Queue q);
    public native @Cast("int64") long runProfiling(int dims, @Cast("size_t*") SizeTPointer globalsize, @Cast("size_t*") SizeTPointer localsize);

    public native @Cast("size_t") long workGroupSize();
    public native @Cast("size_t") long preferedWorkGroupSizeMultiple();
    public native @Cast("bool") boolean compileWorkGroupSize(@Cast("size_t*") SizeTPointer wsz);
    public native @Cast("size_t") long localMemSize();

    public native Pointer ptr();
    @Opaque public static class Impl extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Impl() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Impl(Pointer p) { super(p); }
    }
}
