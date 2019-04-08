// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MetaGraphDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MetaGraphDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MetaGraphDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MetaGraphDef position(long position) {
        return (MetaGraphDef)super.position(position);
    }

  public MetaGraphDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public MetaGraphDef(@Const @ByRef MetaGraphDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef MetaGraphDef from);

  public native @ByRef @Name("operator =") MetaGraphDef put(@Const @ByRef MetaGraphDef from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef MetaGraphDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const MetaGraphDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(MetaGraphDef other);
  public native void Swap(MetaGraphDef other);
  

  // implements Message ----------------------------------------------

  public native MetaGraphDef New();

  public native MetaGraphDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef MetaGraphDef from);
  public native void MergeFrom(@Const @ByRef MetaGraphDef from);
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

  // map<string, .tensorflow.CollectionDef> collection_def = 4;
  public native int collection_def_size();
  public native void clear_collection_def();
  @MemberGetter public static native int kCollectionDefFieldNumber();
  public static final int kCollectionDefFieldNumber = kCollectionDefFieldNumber();
  public native @Const @ByRef StringCollectionDefMap collection_def();
  public native StringCollectionDefMap mutable_collection_def();

  // map<string, .tensorflow.SignatureDef> signature_def = 5;
  public native int signature_def_size();
  public native void clear_signature_def();
  @MemberGetter public static native int kSignatureDefFieldNumber();
  public static final int kSignatureDefFieldNumber = kSignatureDefFieldNumber();
  public native @Const @ByRef StringSignatureDefMap signature_def();
  public native StringSignatureDefMap mutable_signature_def();

  // repeated .tensorflow.AssetFileDef asset_file_def = 6;
  public native int asset_file_def_size();
  public native void clear_asset_file_def();
  @MemberGetter public static native int kAssetFileDefFieldNumber();
  public static final int kAssetFileDefFieldNumber = kAssetFileDefFieldNumber();
  public native AssetFileDef mutable_asset_file_def(int index);
  public native @Const @ByRef AssetFileDef asset_file_def(int index);
  public native AssetFileDef add_asset_file_def();

  // .tensorflow.MetaGraphDef.MetaInfoDef meta_info_def = 1;
  public native @Cast("bool") boolean has_meta_info_def();
  public native void clear_meta_info_def();
  @MemberGetter public static native int kMetaInfoDefFieldNumber();
  public static final int kMetaInfoDefFieldNumber = kMetaInfoDefFieldNumber();
  public native @Const @ByRef MetaGraphDef_MetaInfoDef meta_info_def();
  public native MetaGraphDef_MetaInfoDef release_meta_info_def();
  public native MetaGraphDef_MetaInfoDef mutable_meta_info_def();
  public native void set_allocated_meta_info_def(MetaGraphDef_MetaInfoDef meta_info_def);
  public native void unsafe_arena_set_allocated_meta_info_def(
        MetaGraphDef_MetaInfoDef meta_info_def);
  public native MetaGraphDef_MetaInfoDef unsafe_arena_release_meta_info_def();

  // .tensorflow.GraphDef graph_def = 2;
  public native @Cast("bool") boolean has_graph_def();
  public native void clear_graph_def();
  @MemberGetter public static native int kGraphDefFieldNumber();
  public static final int kGraphDefFieldNumber = kGraphDefFieldNumber();
  public native @Const @ByRef GraphDef graph_def();
  public native GraphDef release_graph_def();
  public native GraphDef mutable_graph_def();
  public native void set_allocated_graph_def(GraphDef graph_def);
  public native void unsafe_arena_set_allocated_graph_def(
        GraphDef graph_def);
  public native GraphDef unsafe_arena_release_graph_def();

  // .tensorflow.SaverDef saver_def = 3;
  public native @Cast("bool") boolean has_saver_def();
  public native void clear_saver_def();
  @MemberGetter public static native int kSaverDefFieldNumber();
  public static final int kSaverDefFieldNumber = kSaverDefFieldNumber();
  public native @Const @ByRef SaverDef saver_def();
  public native SaverDef release_saver_def();
  public native SaverDef mutable_saver_def();
  public native void set_allocated_saver_def(SaverDef saver_def);
  public native void unsafe_arena_set_allocated_saver_def(
        SaverDef saver_def);
  public native SaverDef unsafe_arena_release_saver_def();
}
