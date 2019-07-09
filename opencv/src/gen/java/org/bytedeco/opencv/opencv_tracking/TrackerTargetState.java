// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;


/************************************ TrackerModel Base Classes ************************************/

/** \brief Abstract base class for TrackerTargetState that represents a possible state of the target.
<p>
See \cite AAM {@code \hat{x}^{i}_{k}} all the states candidates.
<p>
Inherits this class with your Target state, In own implementation you can add scale variation,
width, height, orientation, etc.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerTargetState extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TrackerTargetState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TrackerTargetState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerTargetState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TrackerTargetState position(long position) {
        return (TrackerTargetState)super.position(position);
    }

  /**
   * \brief Get the position
   * @return The position
   */
  public native @ByVal Point2f getTargetPosition();

  /**
   * \brief Set the position
   * @param position The position
   */
  public native void setTargetPosition( @Const @ByRef Point2f position );
  /**
   * \brief Get the width of the target
   * @return The width of the target
   */
  public native int getTargetWidth();

  /**
   * \brief Set the width of the target
   * @param width The width of the target
   */
  public native void setTargetWidth( int width );
  /**
   * \brief Get the height of the target
   * @return The height of the target
   */
  public native int getTargetHeight();

  /**
   * \brief Set the height of the target
   * @param height The height of the target
   */
  public native void setTargetHeight( int height );

}
