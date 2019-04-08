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


// TODO(ckennelly):  Add a static assertion to ensure that these masks do not
// conflict with wiretypes.

// ParseTableField is kept small to help simplify instructions for computing
// offsets, as we will always need this information to parse a field.
// Additional data, needed for some types, is stored in
// AuxillaryParseTableField.
@Namespace("google::protobuf::internal") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class ParseTableField extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ParseTableField() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParseTableField(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParseTableField(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ParseTableField position(long position) {
        return (ParseTableField)super.position(position);
    }

  public native @Cast("google::protobuf::uint32") int offset(); public native ParseTableField offset(int setter);
  // The presence_index ordinarily represents a has_bit index, but for fields
  // inside a oneof it represents the index in _oneof_case_.
  public native @Cast("google::protobuf::uint32") int presence_index(); public native ParseTableField presence_index(int setter);
  public native @Cast("unsigned char") byte normal_wiretype(); public native ParseTableField normal_wiretype(byte setter);
  public native @Cast("unsigned char") byte packed_wiretype(); public native ParseTableField packed_wiretype(byte setter);

  // processing_type is given by:
  //   (FieldDescriptor->type() << 1) | FieldDescriptor->is_packed()
  public native @Cast("unsigned char") byte processing_type(); public native ParseTableField processing_type(byte setter);

  public native @Cast("unsigned char") byte tag_size(); public native ParseTableField tag_size(byte setter);
}
