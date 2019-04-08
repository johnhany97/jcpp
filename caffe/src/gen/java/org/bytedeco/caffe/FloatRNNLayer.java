// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.caffe.global.caffe.*;


/**
 * \brief Processes time-varying inputs using a simple recurrent neural network
 *        (RNN). Implemented as a network unrolling the RNN computation in time.
 *
 * Given time-varying inputs {@code  x_t }, computes hidden state {@code 
 *     h_t := \tanh[ W_{hh} h_{t_1} + W_{xh} x_t + b_h ]
 * }, and outputs {@code 
 *     o_t := \tanh[ W_{ho} h_t + b_o ]
 * }.
 */
@Name("caffe::RNNLayer<float>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatRNNLayer extends FloatRecurrentLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatRNNLayer(Pointer p) { super(p); }

  public FloatRNNLayer(@Const @ByRef LayerParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef LayerParameter param);

  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  @Virtual protected native @Const({false, false, true}) void FillUnrolledNet(NetParameter net_param);
  @Virtual protected native @Const({false, false, true}) void RecurrentInputBlobNames(StringVector names);
  @Virtual protected native @Const({false, false, true}) void RecurrentOutputBlobNames(StringVector names);
  @Virtual protected native @Const({false, false, true}) void RecurrentInputShapes(@Cast({"caffe::BlobShape*", "std::vector<caffe::BlobShape>*"}) @StdVector BlobShape shapes);
  @Virtual protected native @Const({false, false, true}) void OutputBlobNames(StringVector names);
}
