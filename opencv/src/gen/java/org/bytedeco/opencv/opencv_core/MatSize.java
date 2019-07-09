// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;





@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class MatSize extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatSize(Pointer p) { super(p); }

    public MatSize(IntPointer _p) { super((Pointer)null); allocate(_p); }
    private native void allocate(IntPointer _p);
    public MatSize(IntBuffer _p) { super((Pointer)null); allocate(_p); }
    private native void allocate(IntBuffer _p);
    public MatSize(int[] _p) { super((Pointer)null); allocate(_p); }
    private native void allocate(int[] _p);
    public native int dims();
    public native @ByVal @Name("operator ()") Size apply();
    public native @ByRef @Name("operator []") IntPointer get(int i);
    public native @Const @Name("operator const int*") IntPointer asIntPointer();  // TODO OpenCV 4.0: drop this
    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef MatSize sz);
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef MatSize sz);

    public native IntPointer p(); public native MatSize p(IntPointer setter);
}
