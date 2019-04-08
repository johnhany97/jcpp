// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CostGraphDef_Node_InputInfo extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CostGraphDef_Node_InputInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CostGraphDef_Node_InputInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CostGraphDef_Node_InputInfo position(long position) {
        return (CostGraphDef_Node_InputInfo)super.position(position);
    }

  public CostGraphDef_Node_InputInfo() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CostGraphDef_Node_InputInfo(@Const @ByRef CostGraphDef_Node_InputInfo from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CostGraphDef_Node_InputInfo from);

  public native @ByRef @Name("operator =") CostGraphDef_Node_InputInfo put(@Const @ByRef CostGraphDef_Node_InputInfo from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef CostGraphDef_Node_InputInfo default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CostGraphDef_Node_InputInfo internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CostGraphDef_Node_InputInfo other);
  public native void Swap(CostGraphDef_Node_InputInfo other);
  

  // implements Message ----------------------------------------------

  public native CostGraphDef_Node_InputInfo New();

  public native CostGraphDef_Node_InputInfo New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CostGraphDef_Node_InputInfo from);
  public native void MergeFrom(@Const @ByRef CostGraphDef_Node_InputInfo from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // int32 preceding_node = 1;
  public native void clear_preceding_node();
  @MemberGetter public static native int kPrecedingNodeFieldNumber();
  public static final int kPrecedingNodeFieldNumber = kPrecedingNodeFieldNumber();
  public native @Cast("google::protobuf::int32") int preceding_node();
  public native void set_preceding_node(@Cast("google::protobuf::int32") int value);

  // int32 preceding_port = 2;
  public native void clear_preceding_port();
  @MemberGetter public static native int kPrecedingPortFieldNumber();
  public static final int kPrecedingPortFieldNumber = kPrecedingPortFieldNumber();
  public native @Cast("google::protobuf::int32") int preceding_port();
  public native void set_preceding_port(@Cast("google::protobuf::int32") int value);
}
