// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InMemoryRunGraphRequest extends MutableRunGraphRequestWrapper {
    static { Loader.load(); }
    /** Default native constructor. */
    public InMemoryRunGraphRequest() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InMemoryRunGraphRequest(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InMemoryRunGraphRequest(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public InMemoryRunGraphRequest position(long position) {
        return (InMemoryRunGraphRequest)super.position(position);
    }

  // RunGraphRequestWrapper methods.
  public native @StdString BytePointer session_handle();
  public native @StdString BytePointer graph_handle();
  public native @Cast("bool") boolean create_worker_session_called();
  public native @Cast("tensorflow::int64") long step_id();
  public native @Const @ByRef ExecutorOpts exec_opts();
  public native @Cast("size_t") long num_sends();
  public native @StdString BytePointer send_key(@Cast("size_t") long i);
  public native @ByVal Status SendValue(@Cast("size_t") long i, Tensor out_tensor);
  public native @Cast("size_t") long num_recvs();
  public native @StdString BytePointer recv_key(@Cast("size_t") long i);
  public native @Cast("bool") boolean is_partial();
  public native @Cast("bool") boolean is_last_partial_run();
  public native @Const @ByRef RunGraphRequest ToProto();
  public native @Cast("bool") boolean store_errors_in_response_body();
  public native @Cast("tensorflow::int64") long request_id();

  // MutableRunGraphRequestWrapper methods.
  public native void set_session_handle(@StdString BytePointer handle);
  public native void set_session_handle(@StdString String handle);
  public native void set_create_worker_session_called(@Cast("bool") boolean called);
  public native void set_graph_handle(@StdString BytePointer handle);
  public native void set_graph_handle(@StdString String handle);
  public native void set_step_id(@Cast("tensorflow::int64") long step_id);
  public native ExecutorOpts mutable_exec_opts();
  public native @ByVal Status AddSendFromRunStepRequest(
        @Const @ByRef RunStepRequestWrapper run_step_request, @Cast("size_t") long i,
        @StdString BytePointer send_key);
  public native @ByVal Status AddSendFromRunStepRequest(
        @Const @ByRef RunStepRequestWrapper run_step_request, @Cast("size_t") long i,
        @StdString String send_key);
  public native @ByVal Status AddSendFromRunCallableRequest(
        @Const @ByRef RunCallableRequest run_callable_request, @Cast("size_t") long i,
        @StdString BytePointer send_key);
  public native @ByVal Status AddSendFromRunCallableRequest(
        @Const @ByRef RunCallableRequest run_callable_request, @Cast("size_t") long i,
        @StdString String send_key);
  public native void add_recv_key(@StdString BytePointer recv_key);
  public native void add_recv_key(@StdString String recv_key);
  public native void set_is_partial(@Cast("bool") boolean is_partial);
  public native void set_is_last_partial_run(@Cast("bool") boolean is_last_partial_run);
  public native void set_store_errors_in_response_body(@Cast("bool") boolean store_errors);
  public native void set_request_id(@Cast("tensorflow::int64") long request_id);
}
