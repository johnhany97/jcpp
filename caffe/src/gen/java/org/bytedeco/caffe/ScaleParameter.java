// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class ScaleParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScaleParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ScaleParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ScaleParameter position(long position) {
        return (ScaleParameter)super.position(position);
    }

  public ScaleParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ScaleParameter(@Const @ByRef ScaleParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ScaleParameter from);

  public native @ByRef @Name("operator =") ScaleParameter put(@Const @ByRef ScaleParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef ScaleParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ScaleParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(ScaleParameter other);
  

  // implements Message ----------------------------------------------

  public native final ScaleParameter New();

  public native final ScaleParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef ScaleParameter from);
  public native void MergeFrom(@Const @ByRef ScaleParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional .caffe.FillerParameter filler = 3;
  public native @Cast("bool") boolean has_filler();
  public native void clear_filler();
  @MemberGetter public static native int kFillerFieldNumber();
  public static final int kFillerFieldNumber = kFillerFieldNumber();
  public native @Const @ByRef FillerParameter filler();
  public native FillerParameter release_filler();
  public native FillerParameter mutable_filler();
  public native void set_allocated_filler(FillerParameter filler);

  // optional .caffe.FillerParameter bias_filler = 5;
  public native @Cast("bool") boolean has_bias_filler();
  public native void clear_bias_filler();
  @MemberGetter public static native int kBiasFillerFieldNumber();
  public static final int kBiasFillerFieldNumber = kBiasFillerFieldNumber();
  public native @Const @ByRef FillerParameter bias_filler();
  public native FillerParameter release_bias_filler();
  public native FillerParameter mutable_bias_filler();
  public native void set_allocated_bias_filler(FillerParameter bias_filler);

  // optional bool bias_term = 4 [default = false];
  public native @Cast("bool") boolean has_bias_term();
  public native void clear_bias_term();
  @MemberGetter public static native int kBiasTermFieldNumber();
  public static final int kBiasTermFieldNumber = kBiasTermFieldNumber();
  public native @Cast("bool") boolean bias_term();
  public native void set_bias_term(@Cast("bool") boolean value);

  // optional int32 axis = 1 [default = 1];
  public native @Cast("bool") boolean has_axis();
  public native void clear_axis();
  @MemberGetter public static native int kAxisFieldNumber();
  public static final int kAxisFieldNumber = kAxisFieldNumber();
  public native @Cast("google::protobuf::int32") int axis();
  public native void set_axis(@Cast("google::protobuf::int32") int value);

  // optional int32 num_axes = 2 [default = 1];
  public native @Cast("bool") boolean has_num_axes();
  public native void clear_num_axes();
  @MemberGetter public static native int kNumAxesFieldNumber();
  public static final int kNumAxesFieldNumber = kNumAxesFieldNumber();
  public native @Cast("google::protobuf::int32") int num_axes();
  public native void set_num_axes(@Cast("google::protobuf::int32") int value);
}
