// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.mxnet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;

import static org.bytedeco.mxnet.global.mxnet.*;


/**
 * \brief the prototype of a server controller
 * @param head the head of the command
 * @param body the body of the command
 * @param controller_handle helper handle for implementing controller
 */
@Properties(inherit = org.bytedeco.mxnet.presets.mxnet.class)
public class MXKVStoreServerController extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    MXKVStoreServerController(Pointer p) { super(p); }
    protected MXKVStoreServerController() { allocate(); }
    private native void allocate();
    public native void call(int head,
                                         @Cast("const char*") BytePointer body,
                                         Pointer controller_handle);
}
