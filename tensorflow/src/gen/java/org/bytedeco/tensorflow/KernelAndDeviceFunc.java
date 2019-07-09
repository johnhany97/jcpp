// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Represents a multi-device function. Functions can also be run using
// various function-calling kernels including CallOp and PartitionedCallOp.
// In such cases, KernelAndDeviceOp is used.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class KernelAndDeviceFunc extends KernelAndDevice {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelAndDeviceFunc(Pointer p) { super(p); }

  // `flr` can be nullptr.
  // `pflr` must not be nullptr.
  // `host_cpu_device` must not be nullptr.
  public KernelAndDeviceFunc(
        FunctionLibraryRuntime flr, ProcessFunctionLibraryRuntime pflr,
        @ByVal DeviceVector input_devices,
        @ByVal IntTensorShapeMap input_tensor_shapes,
        @ByVal IntDataTypeTensorShapePairMap input_resource_dtypes_and_shapes,
        @Cast("std::function<void(std::function<void()>)>*") Pointer runner,
        @MoveUniquePtr CollectiveExecutor.Handle collective_executor,
        Device host_cpu_device, @StdString BytePointer name,
        @ByVal RendezvousCreator rendezvous_creator) { super((Pointer)null); allocate(flr, pflr, input_devices, input_tensor_shapes, input_resource_dtypes_and_shapes, runner, collective_executor, host_cpu_device, name, rendezvous_creator); }
  private native void allocate(
        FunctionLibraryRuntime flr, ProcessFunctionLibraryRuntime pflr,
        @ByVal DeviceVector input_devices,
        @ByVal IntTensorShapeMap input_tensor_shapes,
        @ByVal IntDataTypeTensorShapePairMap input_resource_dtypes_and_shapes,
        @Cast("std::function<void(std::function<void()>)>*") Pointer runner,
        @MoveUniquePtr CollectiveExecutor.Handle collective_executor,
        Device host_cpu_device, @StdString BytePointer name,
        @ByVal RendezvousCreator rendezvous_creator);
  public KernelAndDeviceFunc(
        FunctionLibraryRuntime flr, ProcessFunctionLibraryRuntime pflr,
        @ByVal DeviceVector input_devices,
        @ByVal IntTensorShapeMap input_tensor_shapes,
        @ByVal IntDataTypeTensorShapePairMap input_resource_dtypes_and_shapes,
        @Cast("std::function<void(std::function<void()>)>*") Pointer runner,
        @MoveUniquePtr CollectiveExecutor.Handle collective_executor,
        Device host_cpu_device, @StdString String name,
        @ByVal RendezvousCreator rendezvous_creator) { super((Pointer)null); allocate(flr, pflr, input_devices, input_tensor_shapes, input_resource_dtypes_and_shapes, runner, collective_executor, host_cpu_device, name, rendezvous_creator); }
  private native void allocate(
        FunctionLibraryRuntime flr, ProcessFunctionLibraryRuntime pflr,
        @ByVal DeviceVector input_devices,
        @ByVal IntTensorShapeMap input_tensor_shapes,
        @ByVal IntDataTypeTensorShapePairMap input_resource_dtypes_and_shapes,
        @Cast("std::function<void(std::function<void()>)>*") Pointer runner,
        @MoveUniquePtr CollectiveExecutor.Handle collective_executor,
        Device host_cpu_device, @StdString String name,
        @ByVal RendezvousCreator rendezvous_creator);

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
