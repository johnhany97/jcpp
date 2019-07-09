// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Represents an op kernel and the device it will be run on.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class KernelAndDeviceOp extends KernelAndDevice {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelAndDeviceOp(Pointer p) { super(p); }

  public KernelAndDeviceOp(
        Rendezvous rendez, @Cast("bool") boolean log_memory,
        FunctionLibraryRuntime flr,
        @Cast("std::function<void(std::function<void()>)>*") Pointer runner,
        @MoveUniquePtr CollectiveExecutor.Handle collective_executor,
        Device host_cpu_device) { super((Pointer)null); allocate(rendez, log_memory, flr, runner, collective_executor, host_cpu_device); }
  private native void allocate(
        Rendezvous rendez, @Cast("bool") boolean log_memory,
        FunctionLibraryRuntime flr,
        @Cast("std::function<void(std::function<void()>)>*") Pointer runner,
        @MoveUniquePtr CollectiveExecutor.Handle collective_executor,
        Device host_cpu_device);

  public native @ByVal Status Init(@Const @ByRef NodeDef ndef, GraphCollector graph_collector);

  public native @ByVal Status Run(@Const @ByRef TensorValueVector inputs,
               TensorVector outputs, NodeExecStats stats,
               StepStats step_stats, GraphCollector graph_collector);

  public native @ByVal Status Run(ScopedStepContainer step_container,
               @Const @ByRef TensorValueVector inputs,
               TensorVector outputs, NodeExecStats stats,
               StepStats step_stats, GraphCollector graph_collector);

  public native @Const OpKernel kernel();

  public native Device InputDevice(int i);
  public native Device OutputDevice(int idx);
  public native Device OutputResourceDevice(int idx);

  public native @Cast("tensorflow::DataType") int input_type(int i);
  public native @Const @ByRef DataTypeVector output_dtypes();
  public native int num_inputs();
  public native int num_outputs();
  public native @StdString BytePointer name();
}
