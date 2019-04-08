// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_highgui;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;

import static org.bytedeco.opencv.global.opencv_highgui.*;


/** \brief Callback function for Trackbar see cv::createTrackbar
@param pos current position of the specified trackbar.
@param userdata The optional parameter.
 */
@Properties(inherit = org.bytedeco.opencv.presets.opencv_highgui.class)
public class TrackbarCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TrackbarCallback(Pointer p) { super(p); }
    protected TrackbarCallback() { allocate(); }
    private native void allocate();
    public native void call(int pos, Pointer userdata);
}
