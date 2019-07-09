// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv::hal") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class DCT2D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DCT2D(Pointer p) { super(p); }

    public static native @Ptr DCT2D create(int width, int height, int depth, int flags);
    public native void apply(@Cast("const uchar*") BytePointer src_data, @Cast("size_t") long src_step, @Cast("uchar*") BytePointer dst_data, @Cast("size_t") long dst_step);
    public native void apply(@Cast("const uchar*") ByteBuffer src_data, @Cast("size_t") long src_step, @Cast("uchar*") ByteBuffer dst_data, @Cast("size_t") long dst_step);
    public native void apply(@Cast("const uchar*") byte[] src_data, @Cast("size_t") long src_step, @Cast("uchar*") byte[] dst_data, @Cast("size_t") long dst_step);
}
