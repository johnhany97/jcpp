// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RecvBufResponse extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecvBufResponse(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RecvBufResponse(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RecvBufResponse position(long position) {
        return (RecvBufResponse)super.position(position);
    }

  public RecvBufResponse() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RecvBufResponse(@Const @ByRef RecvBufResponse from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RecvBufResponse from);

  public native @ByRef @Name("operator =") RecvBufResponse put(@Const @ByRef RecvBufResponse from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef RecvBufResponse default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RecvBufResponse internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RecvBufResponse other);
  public native void Swap(RecvBufResponse other);
  

  // implements Message ----------------------------------------------

  public native RecvBufResponse New();

  public native RecvBufResponse New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RecvBufResponse from);
  public native void MergeFrom(@Const @ByRef RecvBufResponse from);
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

  // .google.protobuf.Any transport_options = 4;
  public native @Cast("bool") boolean has_transport_options();
  public native void clear_transport_options();
  @MemberGetter public static native int kTransportOptionsFieldNumber();
  public static final int kTransportOptionsFieldNumber = kTransportOptionsFieldNumber();
  public native @Cast("const google::protobuf::Any*") @ByRef Pointer transport_options();
  public native @Cast("google::protobuf::Any*") Pointer release_transport_options();
  public native @Cast("google::protobuf::Any*") Pointer mutable_transport_options();
  public native void set_allocated_transport_options(@Cast("google::protobuf::Any*") Pointer transport_options);
  public native void unsafe_arena_set_allocated_transport_options(
        @Cast("google::protobuf::Any*") Pointer transport_options);
  public native @Cast("google::protobuf::Any*") Pointer unsafe_arena_release_transport_options();

  // fixed64 buf_ptr = 1;
  public native void clear_buf_ptr();
  @MemberGetter public static native int kBufPtrFieldNumber();
  public static final int kBufPtrFieldNumber = kBufPtrFieldNumber();
  public native @Cast("google::protobuf::uint64") long buf_ptr();
  public native void set_buf_ptr(@Cast("google::protobuf::uint64") long value);

  // int64 num_bytes = 2;
  public native void clear_num_bytes();
  @MemberGetter public static native int kNumBytesFieldNumber();
  public static final int kNumBytesFieldNumber = kNumBytesFieldNumber();
  public native @Cast("google::protobuf::int64") long num_bytes();
  public native void set_num_bytes(@Cast("google::protobuf::int64") long value);

  // int64 send_start_micros = 5;
  public native void clear_send_start_micros();
  @MemberGetter public static native int kSendStartMicrosFieldNumber();
  public static final int kSendStartMicrosFieldNumber = kSendStartMicrosFieldNumber();
  public native @Cast("google::protobuf::int64") long send_start_micros();
  public native void set_send_start_micros(@Cast("google::protobuf::int64") long value);

  // bool is_dead = 3;
  public native void clear_is_dead();
  @MemberGetter public static native int kIsDeadFieldNumber();
  public static final int kIsDeadFieldNumber = kIsDeadFieldNumber();
  public native @Cast("bool") boolean is_dead();
  public native void set_is_dead(@Cast("bool") boolean value);

  // bool require_ack = 6;
  public native void clear_require_ack();
  @MemberGetter public static native int kRequireAckFieldNumber();
  public static final int kRequireAckFieldNumber = kRequireAckFieldNumber();
  public native @Cast("bool") boolean require_ack();
  public native void set_require_ack(@Cast("bool") boolean value);
}
