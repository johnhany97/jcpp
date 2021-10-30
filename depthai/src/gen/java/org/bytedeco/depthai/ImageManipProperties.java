// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Specify properties for ImageManip
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class ImageManipProperties extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ImageManipProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ImageManipProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ImageManipProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ImageManipProperties position(long position) {
        return (ImageManipProperties)super.position(position);
    }
    @Override public ImageManipProperties getPointer(long i) {
        return new ImageManipProperties((Pointer)this).offsetAddress(i);
    }

    /** Initial configuration for ImageManip node */
    public native @ByRef RawImageManipConfig initialConfig(); public native ImageManipProperties initialConfig(RawImageManipConfig setter);

    /** Whether to wait for config at 'inputConfig' IO */
    public native @Cast("bool") boolean inputConfigSync(); public native ImageManipProperties inputConfigSync(boolean setter);

    /** Maximum output frame size in bytes (eg: 300x300 BGR image -> 300*300*3 bytes) */
    public native int outputFrameSize(); public native ImageManipProperties outputFrameSize(int setter);

    /** Num frames in output pool */
    public native int numFramesPool(); public native ImageManipProperties numFramesPool(int setter);
}