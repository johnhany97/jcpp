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

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class ContrastiveLossParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ContrastiveLossParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ContrastiveLossParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ContrastiveLossParameter position(long position) {
        return (ContrastiveLossParameter)super.position(position);
    }

  public ContrastiveLossParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ContrastiveLossParameter(@Const @ByRef ContrastiveLossParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ContrastiveLossParameter from);

  public native @ByRef @Name("operator =") ContrastiveLossParameter put(@Const @ByRef ContrastiveLossParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef ContrastiveLossParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ContrastiveLossParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(ContrastiveLossParameter other);
  

  // implements Message ----------------------------------------------

  public native final ContrastiveLossParameter New();

  public native final ContrastiveLossParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef ContrastiveLossParameter from);
  public native void MergeFrom(@Const @ByRef ContrastiveLossParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional bool legacy_version = 2 [default = false];
  public native @Cast("bool") boolean has_legacy_version();
  public native void clear_legacy_version();
  @MemberGetter public static native int kLegacyVersionFieldNumber();
  public static final int kLegacyVersionFieldNumber = kLegacyVersionFieldNumber();
  public native @Cast("bool") boolean legacy_version();
  public native void set_legacy_version(@Cast("bool") boolean value);

  // optional float margin = 1 [default = 1];
  public native @Cast("bool") boolean has_margin();
  public native void clear_margin();
  @MemberGetter public static native int kMarginFieldNumber();
  public static final int kMarginFieldNumber = kMarginFieldNumber();
  public native float margin();
  public native void set_margin(float value);
}
