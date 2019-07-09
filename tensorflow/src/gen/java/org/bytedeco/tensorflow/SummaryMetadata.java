// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SummaryMetadata extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SummaryMetadata(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SummaryMetadata(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SummaryMetadata position(long position) {
        return (SummaryMetadata)super.position(position);
    }

  public SummaryMetadata() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SummaryMetadata(@Const @ByRef SummaryMetadata from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SummaryMetadata from);

  public native @ByRef @Name("operator =") SummaryMetadata put(@Const @ByRef SummaryMetadata from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef SummaryMetadata default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SummaryMetadata internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SummaryMetadata other);
  public native void Swap(SummaryMetadata other);
  

  // implements Message ----------------------------------------------

  public native SummaryMetadata New();

  public native SummaryMetadata New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SummaryMetadata from);
  public native void MergeFrom(@Const @ByRef SummaryMetadata from);
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

  // string display_name = 2;
  public native void clear_display_name();
  @MemberGetter public static native int kDisplayNameFieldNumber();
  public static final int kDisplayNameFieldNumber = kDisplayNameFieldNumber();
  public native @StdString BytePointer display_name();
  public native void set_display_name(@StdString BytePointer value);
  public native void set_display_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_display_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_display_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_display_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_display_name();
  public native void set_allocated_display_name(@StdString @Cast({"char*", "std::string*"}) BytePointer display_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_display_name();
  public native void unsafe_arena_set_allocated_display_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer display_name);

  // string summary_description = 3;
  public native void clear_summary_description();
  @MemberGetter public static native int kSummaryDescriptionFieldNumber();
  public static final int kSummaryDescriptionFieldNumber = kSummaryDescriptionFieldNumber();
  public native @StdString BytePointer summary_description();
  public native void set_summary_description(@StdString BytePointer value);
  public native void set_summary_description(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_summary_description(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_summary_description(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_summary_description();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_summary_description();
  public native void set_allocated_summary_description(@StdString @Cast({"char*", "std::string*"}) BytePointer summary_description);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_summary_description();
  public native void unsafe_arena_set_allocated_summary_description(
        @StdString @Cast({"char*", "std::string*"}) BytePointer summary_description);

  // .tensorflow.SummaryMetadata.PluginData plugin_data = 1;
  public native @Cast("bool") boolean has_plugin_data();
  public native void clear_plugin_data();
  @MemberGetter public static native int kPluginDataFieldNumber();
  public static final int kPluginDataFieldNumber = kPluginDataFieldNumber();
  public native @Const @ByRef SummaryMetadata_PluginData plugin_data();
  public native SummaryMetadata_PluginData release_plugin_data();
  public native SummaryMetadata_PluginData mutable_plugin_data();
  public native void set_allocated_plugin_data(SummaryMetadata_PluginData plugin_data);
  public native void unsafe_arena_set_allocated_plugin_data(
        SummaryMetadata_PluginData plugin_data);
  public native SummaryMetadata_PluginData unsafe_arena_release_plugin_data();
}
