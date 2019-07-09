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
public class V0LayerParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public V0LayerParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public V0LayerParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public V0LayerParameter position(long position) {
        return (V0LayerParameter)super.position(position);
    }

  public V0LayerParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public V0LayerParameter(@Const @ByRef V0LayerParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef V0LayerParameter from);

  public native @ByRef @Name("operator =") V0LayerParameter put(@Const @ByRef V0LayerParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef V0LayerParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const V0LayerParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(V0LayerParameter other);
  

  // implements Message ----------------------------------------------

  public native final V0LayerParameter New();

  public native final V0LayerParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef V0LayerParameter from);
  public native void MergeFrom(@Const @ByRef V0LayerParameter from);
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
  @MemberGetter public static native @Cast("const caffe::V0LayerParameter::PoolMethod") int MAX();
  public static final int MAX = MAX();
  @MemberGetter public static native @Cast("const caffe::V0LayerParameter::PoolMethod") int AVE();
  public static final int AVE = AVE();
  @MemberGetter public static native @Cast("const caffe::V0LayerParameter::PoolMethod") int STOCHASTIC();
  public static final int STOCHASTIC = STOCHASTIC();
  public static native @Cast("bool") boolean PoolMethod_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::V0LayerParameter::PoolMethod") int PoolMethod_MIN();
  public static final int PoolMethod_MIN = PoolMethod_MIN();
  @MemberGetter public static native @Cast("const caffe::V0LayerParameter::PoolMethod") int PoolMethod_MAX();
  public static final int PoolMethod_MAX = PoolMethod_MAX();
  @MemberGetter public static native int PoolMethod_ARRAYSIZE();
  public static final int PoolMethod_ARRAYSIZE = PoolMethod_ARRAYSIZE();
  public static native @Const EnumDescriptor PoolMethod_descriptor();
  public static native @StdString BytePointer PoolMethod_Name(@Cast("caffe::V0LayerParameter::PoolMethod") int value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString BytePointer name,
        @Cast("caffe::V0LayerParameter::PoolMethod*") IntPointer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString String name,
        @Cast("caffe::V0LayerParameter::PoolMethod*") IntBuffer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString BytePointer name,
        @Cast("caffe::V0LayerParameter::PoolMethod*") int[] value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString String name,
        @Cast("caffe::V0LayerParameter::PoolMethod*") IntPointer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString BytePointer name,
        @Cast("caffe::V0LayerParameter::PoolMethod*") IntBuffer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString String name,
        @Cast("caffe::V0LayerParameter::PoolMethod*") int[] value);

  // accessors -------------------------------------------------------

  // repeated .caffe.BlobProto blobs = 50;
  public native int blobs_size();
  public native void clear_blobs();
  @MemberGetter public static native int kBlobsFieldNumber();
  public static final int kBlobsFieldNumber = kBlobsFieldNumber();
  public native BlobProto mutable_blobs(int index);
  public native @Const @ByRef BlobProto blobs(int index);
  public native BlobProto add_blobs();

  // repeated float blobs_lr = 51;
  public native int blobs_lr_size();
  public native void clear_blobs_lr();
  @MemberGetter public static native int kBlobsLrFieldNumber();
  public static final int kBlobsLrFieldNumber = kBlobsLrFieldNumber();
  public native float blobs_lr(int index);
  public native void set_blobs_lr(int index, float value);
  public native void add_blobs_lr(float value);

  // repeated float weight_decay = 52;
  public native int weight_decay_size();
  public native void clear_weight_decay();
  @MemberGetter public static native int kWeightDecayFieldNumber();
  public static final int kWeightDecayFieldNumber = kWeightDecayFieldNumber();
  public native float weight_decay(int index);
  public native void set_weight_decay(int index, float value);
  public native void add_weight_decay(float value);

  // optional string name = 1;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional string type = 2;
  public native @Cast("bool") boolean has_type();
  public native void clear_type();
  @MemberGetter public static native int kTypeFieldNumber();
  public static final int kTypeFieldNumber = kTypeFieldNumber();
  public native @StdString BytePointer type();
  public native void set_type(@StdString BytePointer value);
  public native void set_type(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_type(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_type(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_type();
  public native void set_allocated_type(@StdString @Cast({"char*", "std::string*"}) BytePointer type);

  // optional string source = 16;
  public native @Cast("bool") boolean has_source();
  public native void clear_source();
  @MemberGetter public static native int kSourceFieldNumber();
  public static final int kSourceFieldNumber = kSourceFieldNumber();
  public native @StdString BytePointer source();
  public native void set_source(@StdString BytePointer value);
  public native void set_source(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_source(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_source(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_source();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_source();
  public native void set_allocated_source(@StdString @Cast({"char*", "std::string*"}) BytePointer source);

  // optional string meanfile = 18;
  public native @Cast("bool") boolean has_meanfile();
  public native void clear_meanfile();
  @MemberGetter public static native int kMeanfileFieldNumber();
  public static final int kMeanfileFieldNumber = kMeanfileFieldNumber();
  public native @StdString BytePointer meanfile();
  public native void set_meanfile(@StdString BytePointer value);
  public native void set_meanfile(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_meanfile(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_meanfile(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_meanfile();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_meanfile();
  public native void set_allocated_meanfile(@StdString @Cast({"char*", "std::string*"}) BytePointer meanfile);

  // optional string det_crop_mode = 59 [default = "warp"];
  public native @Cast("bool") boolean has_det_crop_mode();
  public native void clear_det_crop_mode();
  @MemberGetter public static native int kDetCropModeFieldNumber();
  public static final int kDetCropModeFieldNumber = kDetCropModeFieldNumber();
  public native @StdString BytePointer det_crop_mode();
  public native void set_det_crop_mode(@StdString BytePointer value);
  public native void set_det_crop_mode(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_det_crop_mode(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_det_crop_mode(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_det_crop_mode();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_det_crop_mode();
  public native void set_allocated_det_crop_mode(@StdString @Cast({"char*", "std::string*"}) BytePointer det_crop_mode);

  // optional .caffe.FillerParameter weight_filler = 5;
  public native @Cast("bool") boolean has_weight_filler();
  public native void clear_weight_filler();
  @MemberGetter public static native int kWeightFillerFieldNumber();
  public static final int kWeightFillerFieldNumber = kWeightFillerFieldNumber();
  public native @Const @ByRef FillerParameter weight_filler();
  public native FillerParameter release_weight_filler();
  public native FillerParameter mutable_weight_filler();
  public native void set_allocated_weight_filler(FillerParameter weight_filler);

  // optional .caffe.FillerParameter bias_filler = 6;
  public native @Cast("bool") boolean has_bias_filler();
  public native void clear_bias_filler();
  @MemberGetter public static native int kBiasFillerFieldNumber();
  public static final int kBiasFillerFieldNumber = kBiasFillerFieldNumber();
  public native @Const @ByRef FillerParameter bias_filler();
  public native FillerParameter release_bias_filler();
  public native FillerParameter mutable_bias_filler();
  public native void set_allocated_bias_filler(FillerParameter bias_filler);

  // optional .caffe.HDF5OutputParameter hdf5_output_param = 1001;
  public native @Cast("bool") boolean has_hdf5_output_param();
  public native void clear_hdf5_output_param();
  @MemberGetter public static native int kHdf5OutputParamFieldNumber();
  public static final int kHdf5OutputParamFieldNumber = kHdf5OutputParamFieldNumber();
  public native @Const @ByRef HDF5OutputParameter hdf5_output_param();
  public native HDF5OutputParameter release_hdf5_output_param();
  public native HDF5OutputParameter mutable_hdf5_output_param();
  public native void set_allocated_hdf5_output_param(HDF5OutputParameter hdf5_output_param);

  // optional uint32 num_output = 3;
  public native @Cast("bool") boolean has_num_output();
  public native void clear_num_output();
  @MemberGetter public static native int kNumOutputFieldNumber();
  public static final int kNumOutputFieldNumber = kNumOutputFieldNumber();
  public native @Cast("google::protobuf::uint32") int num_output();
  public native void set_num_output(@Cast("google::protobuf::uint32") int value);

  // optional uint32 pad = 7 [default = 0];
  public native @Cast("bool") boolean has_pad();
  public native void clear_pad();
  @MemberGetter public static native int kPadFieldNumber();
  public static final int kPadFieldNumber = kPadFieldNumber();
  public native @Cast("google::protobuf::uint32") int pad();
  public native void set_pad(@Cast("google::protobuf::uint32") int value);

  // optional uint32 kernelsize = 8;
  public native @Cast("bool") boolean has_kernelsize();
  public native void clear_kernelsize();
  @MemberGetter public static native int kKernelsizeFieldNumber();
  public static final int kKernelsizeFieldNumber = kKernelsizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int kernelsize();
  public native void set_kernelsize(@Cast("google::protobuf::uint32") int value);

  // optional .caffe.V0LayerParameter.PoolMethod pool = 11 [default = MAX];
  public native @Cast("bool") boolean has_pool();
  public native void clear_pool();
  @MemberGetter public static native int kPoolFieldNumber();
  public static final int kPoolFieldNumber = kPoolFieldNumber();
  public native @Cast("caffe::V0LayerParameter_PoolMethod") int pool();
  public native void set_pool(@Cast("caffe::V0LayerParameter_PoolMethod") int value);

  // optional uint32 batchsize = 19;
  public native @Cast("bool") boolean has_batchsize();
  public native void clear_batchsize();
  @MemberGetter public static native int kBatchsizeFieldNumber();
  public static final int kBatchsizeFieldNumber = kBatchsizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int batchsize();
  public native void set_batchsize(@Cast("google::protobuf::uint32") int value);

  // optional uint32 cropsize = 20 [default = 0];
  public native @Cast("bool") boolean has_cropsize();
  public native void clear_cropsize();
  @MemberGetter public static native int kCropsizeFieldNumber();
  public static final int kCropsizeFieldNumber = kCropsizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int cropsize();
  public native void set_cropsize(@Cast("google::protobuf::uint32") int value);

  // optional int32 new_width = 63 [default = 0];
  public native @Cast("bool") boolean has_new_width();
  public native void clear_new_width();
  @MemberGetter public static native int kNewWidthFieldNumber();
  public static final int kNewWidthFieldNumber = kNewWidthFieldNumber();
  public native @Cast("google::protobuf::int32") int new_width();
  public native void set_new_width(@Cast("google::protobuf::int32") int value);

  // optional bool mirror = 21 [default = false];
  public native @Cast("bool") boolean has_mirror();
  public native void clear_mirror();
  @MemberGetter public static native int kMirrorFieldNumber();
  public static final int kMirrorFieldNumber = kMirrorFieldNumber();
  public native @Cast("bool") boolean mirror();
  public native void set_mirror(@Cast("bool") boolean value);

  // optional bool shuffle_images = 64 [default = false];
  public native @Cast("bool") boolean has_shuffle_images();
  public native void clear_shuffle_images();
  @MemberGetter public static native int kShuffleImagesFieldNumber();
  public static final int kShuffleImagesFieldNumber = kShuffleImagesFieldNumber();
  public native @Cast("bool") boolean shuffle_images();
  public native void set_shuffle_images(@Cast("bool") boolean value);

  // optional uint32 rand_skip = 53 [default = 0];
  public native @Cast("bool") boolean has_rand_skip();
  public native void clear_rand_skip();
  @MemberGetter public static native int kRandSkipFieldNumber();
  public static final int kRandSkipFieldNumber = kRandSkipFieldNumber();
  public native @Cast("google::protobuf::uint32") int rand_skip();
  public native void set_rand_skip(@Cast("google::protobuf::uint32") int value);

  // optional uint32 det_context_pad = 58 [default = 0];
  public native @Cast("bool") boolean has_det_context_pad();
  public native void clear_det_context_pad();
  @MemberGetter public static native int kDetContextPadFieldNumber();
  public static final int kDetContextPadFieldNumber = kDetContextPadFieldNumber();
  public native @Cast("google::protobuf::uint32") int det_context_pad();
  public native void set_det_context_pad(@Cast("google::protobuf::uint32") int value);

  // optional int32 new_num = 60 [default = 0];
  public native @Cast("bool") boolean has_new_num();
  public native void clear_new_num();
  @MemberGetter public static native int kNewNumFieldNumber();
  public static final int kNewNumFieldNumber = kNewNumFieldNumber();
  public native @Cast("google::protobuf::int32") int new_num();
  public native void set_new_num(@Cast("google::protobuf::int32") int value);

  // optional int32 new_channels = 61 [default = 0];
  public native @Cast("bool") boolean has_new_channels();
  public native void clear_new_channels();
  @MemberGetter public static native int kNewChannelsFieldNumber();
  public static final int kNewChannelsFieldNumber = kNewChannelsFieldNumber();
  public native @Cast("google::protobuf::int32") int new_channels();
  public native void set_new_channels(@Cast("google::protobuf::int32") int value);

  // optional int32 new_height = 62 [default = 0];
  public native @Cast("bool") boolean has_new_height();
  public native void clear_new_height();
  @MemberGetter public static native int kNewHeightFieldNumber();
  public static final int kNewHeightFieldNumber = kNewHeightFieldNumber();
  public native @Cast("google::protobuf::int32") int new_height();
  public native void set_new_height(@Cast("google::protobuf::int32") int value);

  // optional uint32 concat_dim = 65 [default = 1];
  public native @Cast("bool") boolean has_concat_dim();
  public native void clear_concat_dim();
  @MemberGetter public static native int kConcatDimFieldNumber();
  public static final int kConcatDimFieldNumber = kConcatDimFieldNumber();
  public native @Cast("google::protobuf::uint32") int concat_dim();
  public native void set_concat_dim(@Cast("google::protobuf::uint32") int value);

  // optional bool biasterm = 4 [default = true];
  public native @Cast("bool") boolean has_biasterm();
  public native void clear_biasterm();
  @MemberGetter public static native int kBiastermFieldNumber();
  public static final int kBiastermFieldNumber = kBiastermFieldNumber();
  public native @Cast("bool") boolean biasterm();
  public native void set_biasterm(@Cast("bool") boolean value);

  // optional uint32 group = 9 [default = 1];
  public native @Cast("bool") boolean has_group();
  public native void clear_group();
  @MemberGetter public static native int kGroupFieldNumber();
  public static final int kGroupFieldNumber = kGroupFieldNumber();
  public native @Cast("google::protobuf::uint32") int group();
  public native void set_group(@Cast("google::protobuf::uint32") int value);

  // optional uint32 stride = 10 [default = 1];
  public native @Cast("bool") boolean has_stride();
  public native void clear_stride();
  @MemberGetter public static native int kStrideFieldNumber();
  public static final int kStrideFieldNumber = kStrideFieldNumber();
  public native @Cast("google::protobuf::uint32") int stride();
  public native void set_stride(@Cast("google::protobuf::uint32") int value);

  // optional float dropout_ratio = 12 [default = 0.5];
  public native @Cast("bool") boolean has_dropout_ratio();
  public native void clear_dropout_ratio();
  @MemberGetter public static native int kDropoutRatioFieldNumber();
  public static final int kDropoutRatioFieldNumber = kDropoutRatioFieldNumber();
  public native float dropout_ratio();
  public native void set_dropout_ratio(float value);

  // optional uint32 local_size = 13 [default = 5];
  public native @Cast("bool") boolean has_local_size();
  public native void clear_local_size();
  @MemberGetter public static native int kLocalSizeFieldNumber();
  public static final int kLocalSizeFieldNumber = kLocalSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int local_size();
  public native void set_local_size(@Cast("google::protobuf::uint32") int value);

  // optional float alpha = 14 [default = 1];
  public native @Cast("bool") boolean has_alpha();
  public native void clear_alpha();
  @MemberGetter public static native int kAlphaFieldNumber();
  public static final int kAlphaFieldNumber = kAlphaFieldNumber();
  public native float alpha();
  public native void set_alpha(float value);

  // optional float beta = 15 [default = 0.75];
  public native @Cast("bool") boolean has_beta();
  public native void clear_beta();
  @MemberGetter public static native int kBetaFieldNumber();
  public static final int kBetaFieldNumber = kBetaFieldNumber();
  public native float beta();
  public native void set_beta(float value);

  // optional float scale = 17 [default = 1];
  public native @Cast("bool") boolean has_scale();
  public native void clear_scale();
  @MemberGetter public static native int kScaleFieldNumber();
  public static final int kScaleFieldNumber = kScaleFieldNumber();
  public native float scale();
  public native void set_scale(float value);

  // optional float k = 22 [default = 1];
  public native @Cast("bool") boolean has_k();
  public native void clear_k();
  @MemberGetter public static native int kKFieldNumber();
  public static final int kKFieldNumber = kKFieldNumber();
  public native float k();
  public native void set_k(float value);

  // optional float det_fg_threshold = 54 [default = 0.5];
  public native @Cast("bool") boolean has_det_fg_threshold();
  public native void clear_det_fg_threshold();
  @MemberGetter public static native int kDetFgThresholdFieldNumber();
  public static final int kDetFgThresholdFieldNumber = kDetFgThresholdFieldNumber();
  public native float det_fg_threshold();
  public native void set_det_fg_threshold(float value);

  // optional float det_bg_threshold = 55 [default = 0.5];
  public native @Cast("bool") boolean has_det_bg_threshold();
  public native void clear_det_bg_threshold();
  @MemberGetter public static native int kDetBgThresholdFieldNumber();
  public static final int kDetBgThresholdFieldNumber = kDetBgThresholdFieldNumber();
  public native float det_bg_threshold();
  public native void set_det_bg_threshold(float value);

  // optional float det_fg_fraction = 56 [default = 0.25];
  public native @Cast("bool") boolean has_det_fg_fraction();
  public native void clear_det_fg_fraction();
  @MemberGetter public static native int kDetFgFractionFieldNumber();
  public static final int kDetFgFractionFieldNumber = kDetFgFractionFieldNumber();
  public native float det_fg_fraction();
  public native void set_det_fg_fraction(float value);
}
