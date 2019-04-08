// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OpDef_ArgDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpDef_ArgDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpDef_ArgDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OpDef_ArgDef position(long position) {
        return (OpDef_ArgDef)super.position(position);
    }

  public OpDef_ArgDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public OpDef_ArgDef(@Const @ByRef OpDef_ArgDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef OpDef_ArgDef from);

  public native @ByRef @Name("operator =") OpDef_ArgDef put(@Const @ByRef OpDef_ArgDef from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef OpDef_ArgDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const OpDef_ArgDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(OpDef_ArgDef other);
  public native void Swap(OpDef_ArgDef other);
  

  // implements Message ----------------------------------------------

  public native OpDef_ArgDef New();

  public native OpDef_ArgDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef OpDef_ArgDef from);
  public native void MergeFrom(@Const @ByRef OpDef_ArgDef from);
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

  // string name = 1;
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
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_name();
  public native @Deprecated void unsafe_arena_set_allocated_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // string description = 2;
  public native void clear_description();
  @MemberGetter public static native int kDescriptionFieldNumber();
  public static final int kDescriptionFieldNumber = kDescriptionFieldNumber();
  public native @StdString BytePointer description();
  public native void set_description(@StdString BytePointer value);
  public native void set_description(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_description(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_description(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_description();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_description();
  public native void set_allocated_description(@StdString @Cast({"char*", "std::string*"}) BytePointer description);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_description();
  public native @Deprecated void unsafe_arena_set_allocated_description(
        @StdString @Cast({"char*", "std::string*"}) BytePointer description);

  // string type_attr = 4;
  public native void clear_type_attr();
  @MemberGetter public static native int kTypeAttrFieldNumber();
  public static final int kTypeAttrFieldNumber = kTypeAttrFieldNumber();
  public native @StdString BytePointer type_attr();
  public native void set_type_attr(@StdString BytePointer value);
  public native void set_type_attr(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_type_attr(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_type_attr(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_type_attr();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_type_attr();
  public native void set_allocated_type_attr(@StdString @Cast({"char*", "std::string*"}) BytePointer type_attr);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_type_attr();
  public native @Deprecated void unsafe_arena_set_allocated_type_attr(
        @StdString @Cast({"char*", "std::string*"}) BytePointer type_attr);

  // string number_attr = 5;
  public native void clear_number_attr();
  @MemberGetter public static native int kNumberAttrFieldNumber();
  public static final int kNumberAttrFieldNumber = kNumberAttrFieldNumber();
  public native @StdString BytePointer number_attr();
  public native void set_number_attr(@StdString BytePointer value);
  public native void set_number_attr(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_number_attr(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_number_attr(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_number_attr();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_number_attr();
  public native void set_allocated_number_attr(@StdString @Cast({"char*", "std::string*"}) BytePointer number_attr);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_number_attr();
  public native @Deprecated void unsafe_arena_set_allocated_number_attr(
        @StdString @Cast({"char*", "std::string*"}) BytePointer number_attr);

  // string type_list_attr = 6;
  public native void clear_type_list_attr();
  @MemberGetter public static native int kTypeListAttrFieldNumber();
  public static final int kTypeListAttrFieldNumber = kTypeListAttrFieldNumber();
  public native @StdString BytePointer type_list_attr();
  public native void set_type_list_attr(@StdString BytePointer value);
  public native void set_type_list_attr(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_type_list_attr(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_type_list_attr(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_type_list_attr();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_type_list_attr();
  public native void set_allocated_type_list_attr(@StdString @Cast({"char*", "std::string*"}) BytePointer type_list_attr);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_type_list_attr();
  public native @Deprecated void unsafe_arena_set_allocated_type_list_attr(
        @StdString @Cast({"char*", "std::string*"}) BytePointer type_list_attr);

  // .tensorflow.DataType type = 3;
  public native void clear_type();
  @MemberGetter public static native int kTypeFieldNumber();
  public static final int kTypeFieldNumber = kTypeFieldNumber();
  public native @Cast("tensorflow::DataType") int type();
  public native void set_type(@Cast("tensorflow::DataType") int value);

  // bool is_ref = 16;
  public native void clear_is_ref();
  @MemberGetter public static native int kIsRefFieldNumber();
  public static final int kIsRefFieldNumber = kIsRefFieldNumber();
  public native @Cast("bool") boolean is_ref();
  public native void set_is_ref(@Cast("bool") boolean value);
}
