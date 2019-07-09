// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RunStepRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RunStepRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RunStepRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RunStepRequest position(long position) {
        return (RunStepRequest)super.position(position);
    }

  public RunStepRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RunStepRequest(@Const @ByRef RunStepRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RunStepRequest from);

  public native @ByRef @Name("operator =") RunStepRequest put(@Const @ByRef RunStepRequest from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef RunStepRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RunStepRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RunStepRequest other);
  public native void Swap(RunStepRequest other);
  

  // implements Message ----------------------------------------------

  public native RunStepRequest New();

  public native RunStepRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RunStepRequest from);
  public native void MergeFrom(@Const @ByRef RunStepRequest from);
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

  // repeated .tensorflow.NamedTensorProto feed = 2;
  public native int feed_size();
  public native void clear_feed();
  @MemberGetter public static native int kFeedFieldNumber();
  public static final int kFeedFieldNumber = kFeedFieldNumber();
  public native NamedTensorProto mutable_feed(int index);
  public native @Const @ByRef NamedTensorProto feed(int index);
  public native NamedTensorProto add_feed();

  // repeated string fetch = 3;
  public native int fetch_size();
  public native void clear_fetch();
  @MemberGetter public static native int kFetchFieldNumber();
  public static final int kFetchFieldNumber = kFetchFieldNumber();
  public native @StdString BytePointer fetch(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_fetch(int index);
  public native void set_fetch(int index, @StdString BytePointer value);
  public native void set_fetch(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_fetch(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_fetch(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_fetch();
  public native void add_fetch(@StdString BytePointer value);
  public native void add_fetch(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_fetch(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_fetch(String value, @Cast("size_t") long size);

  // repeated string target = 4;
  public native int target_size();
  public native void clear_target();
  @MemberGetter public static native int kTargetFieldNumber();
  public static final int kTargetFieldNumber = kTargetFieldNumber();
  public native @StdString BytePointer target(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_target(int index);
  public native void set_target(int index, @StdString BytePointer value);
  public native void set_target(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_target(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_target(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_target();
  public native void add_target(@StdString BytePointer value);
  public native void add_target(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_target(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_target(String value, @Cast("size_t") long size);

  // string session_handle = 1;
  public native void clear_session_handle();
  @MemberGetter public static native int kSessionHandleFieldNumber();
  public static final int kSessionHandleFieldNumber = kSessionHandleFieldNumber();
  public native @StdString BytePointer session_handle();
  public native void set_session_handle(@StdString BytePointer value);
  public native void set_session_handle(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_session_handle(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_session_handle(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_session_handle();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_session_handle();
  public native void set_allocated_session_handle(@StdString @Cast({"char*", "std::string*"}) BytePointer session_handle);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_session_handle();
  public native void unsafe_arena_set_allocated_session_handle(
        @StdString @Cast({"char*", "std::string*"}) BytePointer session_handle);

  // string partial_run_handle = 6;
  public native void clear_partial_run_handle();
  @MemberGetter public static native int kPartialRunHandleFieldNumber();
  public static final int kPartialRunHandleFieldNumber = kPartialRunHandleFieldNumber();
  public native @StdString BytePointer partial_run_handle();
  public native void set_partial_run_handle(@StdString BytePointer value);
  public native void set_partial_run_handle(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_partial_run_handle(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_partial_run_handle(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_partial_run_handle();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_partial_run_handle();
  public native void set_allocated_partial_run_handle(@StdString @Cast({"char*", "std::string*"}) BytePointer partial_run_handle);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_partial_run_handle();
  public native void unsafe_arena_set_allocated_partial_run_handle(
        @StdString @Cast({"char*", "std::string*"}) BytePointer partial_run_handle);

  // .tensorflow.RunOptions options = 5;
  public native @Cast("bool") boolean has_options();
  public native void clear_options();
  @MemberGetter public static native int kOptionsFieldNumber();
  public static final int kOptionsFieldNumber = kOptionsFieldNumber();
  public native @Const @ByRef RunOptions options();
  public native RunOptions release_options();
  public native RunOptions mutable_options();
  public native void set_allocated_options(RunOptions options);
  public native void unsafe_arena_set_allocated_options(
        RunOptions options);
  public native RunOptions unsafe_arena_release_options();

  // int64 request_id = 8;
  public native void clear_request_id();
  @MemberGetter public static native int kRequestIdFieldNumber();
  public static final int kRequestIdFieldNumber = kRequestIdFieldNumber();
  public native @Cast("google::protobuf::int64") long request_id();
  public native void set_request_id(@Cast("google::protobuf::int64") long value);

  // bool store_errors_in_response_body = 7;
  public native void clear_store_errors_in_response_body();
  @MemberGetter public static native int kStoreErrorsInResponseBodyFieldNumber();
  public static final int kStoreErrorsInResponseBodyFieldNumber = kStoreErrorsInResponseBodyFieldNumber();
  public native @Cast("bool") boolean store_errors_in_response_body();
  public native void set_store_errors_in_response_body(@Cast("bool") boolean value);
}
