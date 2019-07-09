// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class VariantTensorDataProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VariantTensorDataProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public VariantTensorDataProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public VariantTensorDataProto position(long position) {
        return (VariantTensorDataProto)super.position(position);
    }

  public VariantTensorDataProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public VariantTensorDataProto(@Const @ByRef VariantTensorDataProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef VariantTensorDataProto from);

  public native @ByRef @Name("operator =") VariantTensorDataProto put(@Const @ByRef VariantTensorDataProto from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef VariantTensorDataProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const VariantTensorDataProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(VariantTensorDataProto other);
  public native void Swap(VariantTensorDataProto other);
  

  // implements Message ----------------------------------------------

  public native VariantTensorDataProto New();

  public native VariantTensorDataProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef VariantTensorDataProto from);
  public native void MergeFrom(@Const @ByRef VariantTensorDataProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated .tensorflow.TensorProto tensors = 3;
  public native int tensors_size();
  public native void clear_tensors();
  @MemberGetter public static native int kTensorsFieldNumber();
  public static final int kTensorsFieldNumber = kTensorsFieldNumber();
  public native TensorProto mutable_tensors(int index);
  public native @Const @ByRef TensorProto tensors(int index);
  public native TensorProto add_tensors();

  // string type_name = 1;
  public native void clear_type_name();
  @MemberGetter public static native int kTypeNameFieldNumber();
  public static final int kTypeNameFieldNumber = kTypeNameFieldNumber();
  public native @StdString BytePointer type_name();
  public native void set_type_name(@StdString BytePointer value);
  public native void set_type_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_type_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_type_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_type_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_type_name();
  public native void set_allocated_type_name(@StdString @Cast({"char*", "std::string*"}) BytePointer type_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_type_name();
  public native void unsafe_arena_set_allocated_type_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer type_name);

  // bytes metadata = 2;
  public native void clear_metadata();
  @MemberGetter public static native int kMetadataFieldNumber();
  public static final int kMetadataFieldNumber = kMetadataFieldNumber();
  public native @StdString BytePointer metadata();
  public native void set_metadata(@StdString BytePointer value);
  public native void set_metadata(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_metadata(@Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_metadata();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_metadata();
  public native void set_allocated_metadata(@StdString @Cast({"char*", "std::string*"}) BytePointer metadata);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_metadata();
  public native void unsafe_arena_set_allocated_metadata(
        @StdString @Cast({"char*", "std::string*"}) BytePointer metadata);
}
